FROM openjdk:21-slim

WORKDIR /app

COPY build/libs/demo-app.jar ./

ENTRYPOINT ["java", "-jar", "demo-app.jar"]