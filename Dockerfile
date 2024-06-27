FROM openjdk:17
EXPOSE 8082
ADD target/demoshivani.jar demoshivani.jar
ENTRYPOINT ["Java,"-jar","/demoshivani.jar"]