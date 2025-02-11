FROM openjdk:11-jdk-slim
WORKDIR /app
COPY HelloWorld.java .
RUN javac HelloWorld.java
RUN java --version
CMD ["java", "HelloWorld"]
