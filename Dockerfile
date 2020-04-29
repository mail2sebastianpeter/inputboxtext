#This is a Dockerfile for my springBoot Applicaton image
FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8888
ARG JAR_FILE=/target/*.jar
COPY ${JAR_FILE} cicd.jar
RUN echo "I am creating an docker image for my spring boot application"
MAINTAINER "mail2sebastianpeter@gmail.com"
ENTRYPOINT ["java", "-jar", "cicd.jar"]
