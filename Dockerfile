FROM openjdk:11
EXPOSE 5000
ADD target/spring-boot-automation.jar spring-boot-automation.jar
ENTRYPOINT [ "java", "-jar", "spring-boot-automation.jar" ]