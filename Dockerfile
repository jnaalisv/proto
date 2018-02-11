FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD build/libs/proto.jar app.jar
ENV AWS_REGION=""
ENV JAVA_OPTS=""
EXPOSE 5000
ENTRYPOINT [ "sh", "-c", "java -Dserver.port=5000 -jar app.jar" ]
