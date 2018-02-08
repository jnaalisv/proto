FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD build/libs/proto.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]