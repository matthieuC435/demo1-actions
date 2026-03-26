FROM openjdk:17-jdk-slim
COPY build/libs/*.jar app-devops.jar
EXPOSE 80
CMD ["java", "-jar", "app-devops.jar", "--server.port=80"]