package com.neusoft.elmcloud.application.command;

import lombok.Data;

@Data
public class OrdersCommand {
    private String userId;
    private Integer businessId;
    private Integer daId;
    private Double orderTotal;
}
