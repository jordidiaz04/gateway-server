FROM adoptopenjdk/openjdk8:alpine-slim
ADD target/gateway-server-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 7001
ENTRYPOINT ["java", "-jar","/app.jar"]