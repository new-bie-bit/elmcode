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

## 📸 功能展示

### 1. 首页与商品列表
<img src="https://github.com/new-bie-bit/elmcode/blob/main/image/%E5%9B%BE%E7%89%871.png" width="300px">



### 2. 购物车功能
<img src="https://github.com/new-bie-bit/elmcode/blob/main/image/%E5%9B%BE%E7%89%872.png" width="300px">

### 3. 下单与支付流程
<img src="https://github.com/new-bie-bit/elmcode/blob/main/image/%E5%9B%BE%E7%89%873.png" width="300px">

### 4. 地址管理
![地址管理](https://github.com/new-bie-bit/elmcode/blob/main/image/%E5%9B%BE%E7%89%874.png)


### 5. 微服务架构图
[![微服务架构图](https://mermaid.ink/img/pako:eNp9ku1r00AAxv-V4z63Lk3WrA1j0PcKU6YDP5j0w625tsG8lEtuW1cKgkymWF8Q90EFmZ8EMQoT7Qat_0yTzv_Cu2YxmQzv0z33_O55LpcbwrajY6hAze6Yzl67h4gHNu9qNmDDpTtdgvo9EDwZLz5_jRb5KKn3KJZA4H8Mj34yB2DTapsGtr1WBGFb1-x_QhbTV8Hh6XzyPDz9FDx-Np98CX49SjLLamnr5iUEGsjDe2iwvkM2cquCILQSrqLWKMEPEEjHLEEpAa_r_304Xkx91h98OF-cPLzwZ-HxNMmtqjHAA0HFsTtGF2xjsovJMj5_9RwN9TZqO-5KmborzYHrEWP_P-Xzydvg6Ukw88P3YzZJYmpqZIU_ji6-n4XHZ7yLlbvUwgTkxKul9Zh-8XI-e3dJbxFn19A5nbv2BprqrcH2nU0QvvkWjv3g_HUrdkpgPZvdAOVIlSNViRUXtbSoR6IWcX8VF9VI1NMicpppp5l2GmmnATOwSwwdKh6hOAPZ11uISzjkmAa9HrawBhU21XEHUdPT2KMdsW19ZN93HCveSRza7cWC9nX2lKoGYr8hIdjlYFJxqO1BJS8VlxFQGcJ9qGSFGwIfoijLUrEoylIhtyaKgpSBg8RdFQoyBwpyviitCbI8ysCD5RlsapqjPwgxKw0?type=png)](https://mermaid-live.nodejs.cn/edit#pako:eNp9ku1r00AAxv-V4z63Lk3WrA1j0PcKU6YDP5j0w625tsG8lEtuW1cKgkymWF8Q90EFmZ8EMQoT7Qat_0yTzv_Cu2YxmQzv0z33_O55LpcbwrajY6hAze6Yzl67h4gHNu9qNmDDpTtdgvo9EDwZLz5_jRb5KKn3KJZA4H8Mj34yB2DTapsGtr1WBGFb1-x_QhbTV8Hh6XzyPDz9FDx-Np98CX49SjLLamnr5iUEGsjDe2iwvkM2cquCILQSrqLWKMEPEEjHLEEpAa_r_304Xkx91h98OF-cPLzwZ-HxNMmtqjHAA0HFsTtGF2xjsovJMj5_9RwN9TZqO-5KmborzYHrEWP_P-Xzydvg6Ukw88P3YzZJYmpqZIU_ji6-n4XHZ7yLlbvUwgTkxKul9Zh-8XI-e3dJbxFn19A5nbv2BprqrcH2nU0QvvkWjv3g_HUrdkpgPZvdAOVIlSNViRUXtbSoR6IWcX8VF9VI1NMicpppp5l2GmmnATOwSwwdKh6hOAPZ11uISzjkmAa9HrawBhU21XEHUdPT2KMdsW19ZN93HCveSRza7cWC9nX2lKoGYr8hIdjlYFJxqO1BJS8VlxFQGcJ9qGSFGwIfoijLUrEoylIhtyaKgpSBg8RdFQoyBwpyviitCbI8ysCD5RlsapqjPwgxKw0)

---

## 🚀 快速运行

### 1. 克隆仓库

```bash
git clone https://github.com/yourname/ddd-ordering-system.git
cd ddd-ordering-system
```

### 2. 数据库准备

*   创建MySQL数据库，例如命名为 `ddd_ordering_db`。
*   导入项目 `sql` 目录下的数据库脚本（如果提供）。
*   根据您的数据库配置，修改各个后端模块的 `application.yml` 或 `bootstrap.yml` 文件中的数据库连接信息。

### 3. 启动后端服务

**推荐使用Docker Compose (如果已配置):**

```bash
# 在项目根目录执行
docker-compose up --build
```

**手动启动 (推荐顺序):**

1.  **启动 Eureka Server:**
    进入 `eureka-server13000` 目录，运行：
    ```bash
    mvn spring-boot:run
    ```
    或打包后运行：
    ```bash
    mvn clean package
    java -jar target/eureka-server13000.jar
    ```
    *（等待服务启动成功，访问 `http://localhost:13000` 确认Eureka面板）*

2.  **启动 Config Server:**
    进入 `config-server15000` 目录，运行：
    ```bash
    mvn spring-boot:run
    ```

3.  **启动 Business Provider Server:**
    进入 `business-provider-server11000` 目录，运行：
    ```bash
    mvn spring-boot:run
    ```

4.  **启动 Business Consumer Server:**
    进入 `business-consumer-server12000` 目录，运行：
    ```bash
    mvn spring-boot:run
    ```

5.  **启动 Gateway Server:**
    进入 `gateway-server14000` 目录，运行：
    ```bash
    mvn spring-boot:run
    ```
    *（所有后端服务启动后，再次访问 `http://localhost:13000` 确认所有服务都已注册）*

### 4. 启动前端应用

1.  进入 `elmclient` 目录：
    ```bash
    cd elmclient
    ```
2.  安装依赖：
    ```bash
    npm install
    ```
3.  启动前端开发服务器：
    ```bash
    npm run dev
    ```
    *（前端应用通常会在 `http://localhost:8080` 启动，具体端口请查看控制台输出）*

现在，您可以通过浏览器访问前端地址，开始体验点餐系统了！

---

## 🤝 贡献

欢迎任何形式的贡献！如果您有任何建议、功能请求或发现bug，请随时提交Issue或Pull Request。

---

## 📄 许可证

本项目采用 [MIT License](LICENSE) 开源。

---

**致谢:** 感谢所有开源社区的贡献者，本项目基于众多优秀的开源技术构建。

---
