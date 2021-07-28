package example.micronaut.books;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient
public interface AnalyticsClient {

    @Topic("analytics")
    void updateAnalytics(Book book);
}
