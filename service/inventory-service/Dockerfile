# Start with a lightweight base image with Java 17
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

ARG APP_VERSION

# Copy the JAR file into the container
# Replace 'your-app.jar' with the actual JAR filename
COPY build/libs/inventory-service-$APP_VERSION.jar app.jar

# Expose the port that your application will run on (default for Spring Boot is 8080)
EXPOSE 8080

# Define the entry point to run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]