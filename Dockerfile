FROM openjdk:11
MAINTAINER Paulo Grillo
WORKDIR fretefacil
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} fretefacil/app.jar
ENTRYPOINT ["java","-jar","fretefacil/app.jar"]
EXPOSE 8082