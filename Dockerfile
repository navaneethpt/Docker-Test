FROM maven:3.5.2-jdk-8-alpine AS MAVEN_BUILD
copy pom.xml /build/
copy src /build/src/
WORKDIR /build/
RUN mvn package spring-boot:repackage
FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY --from=MAVEN_BUILD /build/target/Docker-Test-0.0.1-SNAPSHOT.jar /app/
#COPY target/Docker-Test-0.0.1-SNAPSHOT.jar Docker-Test-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Dspring.profiles.active=prod","-jar","Docker-Test-0.0.1-SNAPSHOT.jar"]
