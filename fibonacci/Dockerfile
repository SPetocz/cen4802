FROM maven:3.9-eclipse-temurin-21

WORKDIR /app

COPY . .

RUN mvn package

CMD ["java", "-jar", "target/fibonacci-1.0.jar"]