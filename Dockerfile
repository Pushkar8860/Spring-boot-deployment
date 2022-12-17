FROM openjdk:11
EXPOSE 5000
ADD target/k8s_first_jar.jar k8s_first_jar.jar
ENTRYPOINT [ "java", "-jar", "k8s_first_jar.jar" ]