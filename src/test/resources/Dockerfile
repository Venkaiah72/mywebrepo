# Use an existing base image with Java and Maven pre-installed
FROM maven:3.8.1-jdk-11 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven project descriptor file
COPY pom.xml .

# Download dependencies specified in the pom.xml and store them in Docker cache
RUN mvn dependency:go-offline

# Copy the entire project source
COPY src ./src

# Package the application using Maven
RUN mvn package -DskipTests

# Use a smaller base image for runtime
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged jar file from the build stage to the current directory in the container
COPY --from=build /app/target/*.jar ./app.jar

# Command to run the application
CMD ["java", "-jar", "app.jar"]
