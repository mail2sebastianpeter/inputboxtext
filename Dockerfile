FROM tomcat:latest
ADD target/cicd-pipeline-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8885
RUN echo "I am creating an docker image for my spring boot application"
MAINTAINER "mail2sebastianpeter@gmail.com"
CMD ["catalina.sh", "run"]