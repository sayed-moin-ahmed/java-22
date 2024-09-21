# Use a Java image suitable for development (e.g., with Maven, debugging tools)
FROM openjdk:23-slim

# Install Maven for building Java applications
RUN apt-get update && apt-get install -y maven git

# Optional: Install development tools (e.g., curl, bash)
RUN apt-get install -y curl bash

# Set the working directory
WORKDIR /workspace

# Expose ports only used in development (e.g., 8080 for Spring Boot)
EXPOSE 8080

# Add the current source code into the container
COPY . /workspace

# Run Maven install to set up the dependencies
#RUN mvn clean install

# Set default command for container (if needed)
#CMD ["mvn", "spring-boot:run"]