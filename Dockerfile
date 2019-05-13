FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
RUN mkdir /app
WORKDIR /app
COPY target/demo-1.0.jar /app/app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
