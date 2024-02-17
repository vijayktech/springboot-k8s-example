FROM astita/openjdk17_jdk-alpine
EXPOSE 8080
ADD ./target/springboot-k8s-example.jar springboot-k8s-example.jar

ENTRYPOINT ["java", "-jar", "/springboot-k8s-example.jar"]