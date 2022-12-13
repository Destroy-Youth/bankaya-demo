# Prueba técnica Bankaya

1. Crear imagen de docker `docker build -t spring-docker .`
2. Correr servicio `docker run -d --name spring-docker -p 8080:8080 spring-docker `
3. Endpoints
   1. http://localhost:8080/pikachu/abilities
   2. http://localhost:8080/pikachu/base-experience
   3. http://localhost:8080/pikachu/held-items
   4. http://localhost:8080/pikachu/id
   5. http://localhost:8080/25/name
   6. http://localhost:8080/ditto/location-encounters
4. Detener el contenedor `docker stop spring-docker`