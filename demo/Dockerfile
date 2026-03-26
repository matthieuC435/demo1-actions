# Base Java
FROM openjdk:17-jdk

# Copier le JAR généré par Gradle
COPY build/libs/*.jar app-devops.jar

# Exposer le port de l'application
EXPOSE 80

# Lancer Spring Boot
CMD ["java", "-jar", "app-devops.jar", "--server.port=80"]