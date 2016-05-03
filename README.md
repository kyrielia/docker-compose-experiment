# Docker-Compose-Experiment

An experiment to link two Docker containers together using Docker Compose. One container is a Hello World style Spring Boot application,
and the other container is a Redis database.

To get working:

```
./gradlew clean build
docker-compose build
docker-compose up
```