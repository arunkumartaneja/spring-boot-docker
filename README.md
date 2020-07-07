# spring-boot-docker

Spring-boot docker integration on windows 10

## Installing Docker on Windows

To install Docker on Windows, you can download the Docker Desktop Community edition from the docker.com website.

Once you have Docker installed and running, you can make sure it is running properly by opening a Powershell Window and running the commands “docker version” and the “docker ps”.

## Docker File

```
FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
```

## Build Docker Image
```
docker build --build-arg JAR_FILE=build/libs/*.jar -t springio/gs-spring-boot-docker .
```
## List all image
```
docker image ls
```

## Run Docker Image
```
docker run -p 8080:8080 springio/gs-spring-boot-docker
```

## shows running containers
```
docker ps
```

## Reference
[spring-boot-and-docker-example-on-windows](https://nullbeans.com/spring-boot-and-docker-example-on-windows/)

[spring-boot-docker](https://spring.io/guides/gs/spring-boot-docker/)
