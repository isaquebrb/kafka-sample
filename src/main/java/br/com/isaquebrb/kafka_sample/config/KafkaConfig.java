package br.com.isaquebrb.kafka_sample.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic sampleTopic() {
        return new NewTopic("sample-topic", 1, (short) 1);
    }
}
