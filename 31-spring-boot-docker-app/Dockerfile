FROM java:8-jdk-alpine

COPY ./target/13-spring-boot-docker-app.jar /usr/app/

WORKDIR /usr/app/

RUN sh -c 'touch 13-spring-boot-docker-app.jar'

ENTRYPOINT ["java","-jar","13-spring-boot-docker-app.jar"]