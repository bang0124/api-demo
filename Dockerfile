FROM java:8
VOLUME /tmp
ADD target/api-demo-0.0.1.war app.war
ENV JAVA_OPTS=""
RUN bash -c 'touch /app.war'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.war"]
