# Step 1: Use a valid official lightweight Java 17 image
FROM eclipse-temurin:17-jdk-jammy

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Copy the built JAR file into the container
COPY target/my-spring-app-1.0.0.jar app.jar

# Step 4: Expose the port your app runs on (Spring Boot default is 8080)
EXPOSE 8080

# Step 5: Command to run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]

