FROM openjdk:21-jdk-slim
WORKDIR /app
COPY HelloWorld.java .
RUN javac --release 11 HelloWorld.java
CMD ["java", "HelloWorld"]
