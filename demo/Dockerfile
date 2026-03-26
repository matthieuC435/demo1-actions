FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY build/libs/*.jar app-devops.jar
EXPOSE 80
CMD ["java", "-jar", "app-devops.jar", "--server.port=80"]