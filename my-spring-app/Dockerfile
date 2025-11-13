
# Step 1: Use a lightweight Java image
FROM eclipse-temurin:17-jdk-jammy

# Step 2: Set the working directory
WORKDIR /app

# Step 3: Copy the Spring Boot JAR file into the container
COPY target/my-spring-app-1.0.0.jar app.jar

# Step 4: Expose the app port
EXPOSE 8080

# Step 5: Command to run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
