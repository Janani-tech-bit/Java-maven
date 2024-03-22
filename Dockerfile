# Use AdoptOpenJDK 11 base image
FROM adoptopenjdk:11-jre-hotspot

# Set the working directory in the container
WORKDIR /app

# Copy the executable JAR file from the host to the container
COPY target/my-service-1.0-SNAPSHOT.jar /app/my-service.jar

# Expose port 8080 for the Spring Boot application
EXPOSE 8081

# Command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "my-service.jar"]
