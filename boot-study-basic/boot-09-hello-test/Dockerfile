FROM java:8
EXPOSE 8888

ADD boot-09-hello-test-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'

ENTRYPOINT ["java","-jar","/app.jar","--spring.profiles.active=pro"]