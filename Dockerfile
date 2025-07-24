FROM openjdk:21

COPY target/JunitCalci_docker_app.jar /usr/app/

WORKDIR /usr/app

ENTRYPOINT [ "java", "-jar", "JunitCalci_docker_app.jar" ]