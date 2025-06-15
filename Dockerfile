# kafka-consumer/Dockerfile
FROM openjdk:17
COPY target/kafka-consumer.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
