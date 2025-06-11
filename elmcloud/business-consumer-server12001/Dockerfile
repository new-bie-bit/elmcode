FROM openjdk:8-jdk-alpine

# 指定工作目录
WORKDIR /app

# 将 jar 包添加到工作目录
ADD target/business-consumer-server12001-1.0-SNAPSHOT.jar .

# 暴露端口
EXPOSE 12001

# 启动命令
ENTRYPOINT ["java","-jar","/app/business-consumer-server12001-1.0-SNAPSHOT.jar","--spring.profiles.active=prod"]