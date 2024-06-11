FROM jelastic/maven:3.9.5-openjdk-21 AS build
WORKDIR /app
COPY pom.xml .
COPY event-handler/pom.xml event-handler/
COPY common/pom.xml common/
COPY core-service/pom.xml core-service/
COPY suppressions.xml .
RUN mvn dependency:go-offline
COPY event-handler/src event-handler/src
COPY common/src common/src
COPY core-service/src core-service/src
RUN mvn clean package -DskipTests

FROM openjdk:21-jdk-slim
COPY --from=build /app/event-handler/target/*.jar application.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "application.jar"]