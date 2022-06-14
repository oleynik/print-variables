FROM openjdk:18

WORKDIR /application
COPY build/libs/print-variables-*.jar ./application.jar
CMD ["java", "-jar", "application.jar"]