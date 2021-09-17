FROM openjdk:11
ADD target/springboot-mongo-dcoker.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]