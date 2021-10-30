FROM openjdk:11
VOLUME /tmp
ADD ./target/recursos-humanos-trabalhadores-0.0.1-SNAPSHOT.jar recursos-humanos-trabalhadores.jar
ENTRYPOINT ["java","-jar","/recursos-humanos-trabalhadores.jar"]