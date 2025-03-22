FROM eclipse-temurin:21

WORKDIR /app

# Elimina cualquier versión anterior antes de copiar el nuevo JAR
RUN rm -f /app/app.jar

COPY target/library-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/app/app.jar"]
