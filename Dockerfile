FROM openjdk:11
EXPOSE 8080
COPY target/devopsexam.jar devopsexam.jar
CMD ["java","-jar","/devopsexam.jar"]