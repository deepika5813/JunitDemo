FROM openjdk:21

COPY target/JUnit4-App-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

ENTRYPOINT [ "java", "-jar", "JUnit4-App-0.0.1-SNAPSHOT.jar" ]