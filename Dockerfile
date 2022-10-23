# Test and Run Java App with Docker

# Use Ubutnu 22.04 LTS as base image
FROM ubuntu:22.04

# Install dependencies
RUN apt-get update &&  \
    apt-get install -y openjdk-18-jdk && \
    apt-get install -y maven

# Copy ./app to /app
COPY ./app /app
WORKDIR /app

# Build app
RUN mvn clean package

# Run JUnit tests with Maven
RUN mvn test
