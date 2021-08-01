FROM openjdk:8-jdk-alpine
Add target/capstone-code-0.0.1-SNAPSHOT.jar capstone-code-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/capstone-code-0.0.1-SNAPSHOT.jar"]
EXPOSE 8081
