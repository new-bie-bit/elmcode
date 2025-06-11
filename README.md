# 🍽️ 基于DDD架构的点餐系统 - 微服务项目

这是一个使用 **Spring Cloud + Vue3 + DDD（领域驱动设计）** 构建的分布式点餐系统，涵盖服务注册、网关路由、配置管理、服务通信、前后端分离、购物车、下单、地址管理等完整业务流程，适合作为中大型系统的架构实践与课程设计项目。

---

## 🧱 技术栈

- 🌐 前端：Vue3、Element Plus、Axios
- ☁️ 后端：Spring Boot、Spring Cloud、OpenFeign、MyBatis-Plus
- 🔄 微服务：Eureka、Gateway、Config Server、Nacos、Bus、Hystrix
- 📦 架构：DDD 四层架构（表现层、应用层、领域层、基础设施层）
- 🗃️ 数据库：MySQL
- 🐳 容器化：Docker、Docker Compose（可选）

---

## 📦 系统模块

| 模块名称 | 描述 |
|----------|------|
| eureka-server13000 | 服务注册中心 |
| gateway-server14000 | API 网关 |
| config-server15000 | 配置中心 |
| business-provider-server11000 | 点餐业务提供方（微服务） |
| business-consumer-server12000 | 点餐业务消费方（微服务） |
| elmclient (Vue) | 前端页面，购物车、下单、地址管理等界面 |

---

## 🧩 功能特点

- ✅ DDD 分层架构落地，代码结构清晰可维护
- 🧭 完整的购物车-下单-支付-地址流程
- 📦 微服务模块独立开发、独立部署
- 🔗 服务间调用使用 Feign Client，解耦高
- 📄 配置中心统一配置管理，支持动态刷新
- 🚨 熔断降级保护业务核心服务

---

## 🚀 快速运行

### 1. 克隆仓库

```bash
git clone https://github.com/yourname/ddd-ordering-system.git
