FROM eclipse-temurin:21
WORKDIR /app

# Copiar el JAR asegurándose de que el build lo generó
COPY ./target/library-0.0.1-SNAPSHOT.jar /app

EXPOSE 3000
CMD ["java", "-jar", "/app/library-0.0.1-SNAPSHOT.jar"]
