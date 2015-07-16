FROM java:8
VOLUME /tmp
ADD mps-docker-demo-0.0.1-SNAPSHOT.jar /opt/spring/app.jar
RUN bash -c 'touch /opt/spring/app.jar'
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/opt/spring/app.jar"]
