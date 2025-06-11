package com.neusoft.elmcloud.infrastructure.persistence.repository;


import com.neusoft.elmcloud.domain.model.orders.OrdersDM;
import com.neusoft.elmcloud.domain.model.orders.OrdersRepository;
import com.neusoft.elmcloud.infrastructure.persistence.converter.OrdersConverter;
import com.neusoft.elmcloud.infrastructure.persistence.mapper.CartMapper;
import com.neusoft.elmcloud.infrastructure.persistence.mapper.OrderDetailetMapper;
import com.neusoft.elmcloud.infrastructure.persistence.mapper.OrdersMapper;
import com.neusoft.elmcloud.infrastructure.util.CommonUtil;
import com.neusoft.elmcloud.po.Cart;
import com.neusoft.elmcloud.po.OrderDetailet;
import com.neusoft.elmcloud.po.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Repository
public class OrdersRepositoryImpl implements OrdersRepository {

    @Resource
    private OrdersMapper ordersMapper;

    @Resource
    private CartMapper cartMapper;

    @Resource
    private OrderDetailetMapper orderDetailetMapper;

    /**
     * 保存
     *
     * @param model
     */
    @Override
    public int store(OrdersDM model) {
        Orders orders = OrdersConverter.fromOrders(model);
        //1、查询当前用户购物车中当前商家的所有食品
        Cart cart = new Cart();
        cart.setUserId(orders.getUserId());
        cart.setBusinessId(orders.getBusinessId());
        List<Cart> cartList = cartMapper.listCart(cart);

        //2、创建订单（返回生成的订单编号）
        orders.setOrderDate(CommonUtil.getCurrentDate());
        ordersMapper.saveOrders(orders);
        int orderId = orders.getOrderId();

        //3、批量添加订单明细
        List<OrderDetailet> list = new ArrayList<>();
        for(Cart c : cartList) {
            OrderDetailet od = new OrderDetailet();
            od.setOrderId(orderId);
            od.setFoodId(c.getFoodId());
            od.setQuantity(c.getQuantity());
            list.add(od);
        }
        orderDetailetMapper.saveOrderDetailetBatch(list);

        //4、从购物车表中删除相关食品信息
        cartMapper.removeCart(cart);

        return orderId;
    }
}
