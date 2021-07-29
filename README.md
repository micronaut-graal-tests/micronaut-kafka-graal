# Micronaut Kafka Graal #

Test application for Micronaut and Kafka:

Start Kafka (without Zookeeper):

```
docker run -it --rm -p 9092:9092 -p 2121:2121 -p 3030:3030 lensesio/fast-data-dev
```

To test the application:

```
curl localhost:8080/books/1491950358
curl localhost:8080/analytics
```
