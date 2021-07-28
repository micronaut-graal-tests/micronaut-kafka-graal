# Micronaut Kafka Graal #

Test application for Micronaut and Kafka:

Start Kafka (without Zookeeper):

```
docker run -it --rm -p 9092:9092 bashj79/kafka-kraft
```

To test the application:

```
curl localhost:8080/books/1491950358
curl localhost:8080/analytics
```
