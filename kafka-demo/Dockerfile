# Base image with JDK
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the jar file
COPY target/*.jar app.jar

# Command to run the application
CMD ["java", "-jar", "app.jar"]