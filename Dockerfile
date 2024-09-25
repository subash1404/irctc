# Use OpenJDK 21 as the base image
FROM openjdk:21-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the Gradle wrapper and build files
COPY gradlew gradlew
COPY gradle gradle
COPY build.gradle.kts build.gradle.kts
COPY settings.gradle.kts settings.gradle.kts

# Copy your application source code
COPY src src

# Build the application
RUN ./gradlew clean build -x test

# Specify the command to run your application
CMD ["java", "-jar", "build/libs/irctc-0.0.1-SNAPSHOT.jar"]
