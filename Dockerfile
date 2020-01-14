FROM java:8
VOLUME /tmp
ADD target/dockerspringboot.jar dockerspringboot.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","dockerspringboot.jar"]