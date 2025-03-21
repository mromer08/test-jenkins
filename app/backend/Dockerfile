FROM eclipse-temurin:21

# Configuramos el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiamos el archivo JAR al contenedor
COPY target/library-0.0.1-SNAPSHOT.jar app.jar

# Exponemos el puerto en el que correrá la aplicación
EXPOSE 3000

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "/app/app.jar"]
