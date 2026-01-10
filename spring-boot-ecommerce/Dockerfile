# Stage 1: Build the application
FROM maven:3.9.9-eclipse-temurin-17 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy pom.xml first for better Docker layer caching
COPY pom.xml .

# Copy source code
COPY src ./src

# Run Maven to build the application, skipping tests
RUN mvn clean package -DskipTests

# Stage 2: Run the application
FROM eclipse-temurin:17-jre

# Set the working directory inside the container
WORKDIR /app

# Expose Render's dynamic port
EXPOSE $PORT

# Copy the built JAR file from the build stage
COPY --from=build /app/target/spring-boot-ecommerce-0.0.1-SNAPSHOT.jar app.jar

# Set JVM optimizations and entry point
ENTRYPOINT ["java", "-XX:InitialRAMPercentage=75.0", "-XX:MaxRAMPercentage=75.0", "-jar", "app.jar"]
