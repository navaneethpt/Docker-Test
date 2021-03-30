FROM maven:3.5.2-jdk-8-alpine
RUN mvn package spring-boot:repackage
FROM openjdk:8-jdk-alpine
MAINTAINER baeldung.com
COPY target/Docker-Test-0.0.1-SNAPSHOT.jar Docker-Test-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Docker-Test-0.0.1-SNAPSHOT.jar"]
