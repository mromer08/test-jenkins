# Fase 1: Construcción del JAR dentro de Docker
FROM eclipse-temurin:21 AS build
WORKDIR /app
COPY . . 
RUN ./mvnw clean package -DskipTests

# Fase 2: Imagen final con solo el JAR necesario
FROM eclipse-temurin:21
WORKDIR /app
COPY --from=build /app/target/library-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 3000
CMD ["java", "-jar", "/app/app.jar"]
