# ============================
# Stage 1: Build the JAR file
# ============================
FROM eclipse-temurin:17-jdk-jammy AS build
WORKDIR /app

# Copy everything (including Maven wrapper and pom.xml)
COPY . .

# Build the JAR (skip tests for faster build)
RUN ./mvnw clean package -DskipTests

# ============================
# Stage 2: Run the application
# ============================
FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app

# Copy the built JAR from the previous stage
COPY --from=build /app/target/*.jar app.jar

# Expose the port your app runs on
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]

