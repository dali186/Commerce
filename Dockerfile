FROM openjdk:21
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} /Commerce.jar
ENTRYPOINT ["java", "-jar", "/Commerce.jar"]