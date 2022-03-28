FROM adoptopenjdk/openjdk11:alpine-slim
EXPOSE 7001
ADD target/gateway-server.jar app.jar
ENTRYPOINT ["java", "-jar","/app.jar"]