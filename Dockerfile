FROM kyrielia/centos7-java8

VOLUME /tmp
ADD build/libs/helloworld-*.jar /helloworld.jar
RUN sh -c 'touch /helloworld.jar'
EXPOSE 8080
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/helloworld.jar"]