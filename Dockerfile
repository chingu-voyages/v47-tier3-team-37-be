FROM maven:3.8.8-eclipse-temurin-21-alpine AS build
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jdk
COPY --from=build /target/Cornell-Notes-Backend-0.0.1-SNAPSHOT.jar Cornell-Notes.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","Cornell-Notes.jar"]