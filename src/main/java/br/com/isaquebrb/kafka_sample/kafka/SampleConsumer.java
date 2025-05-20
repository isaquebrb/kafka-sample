package br.com.isaquebrb.kafka_sample.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class SampleConsumer {

    private static final Logger log = LoggerFactory.getLogger(SampleConsumer.class);

    @KafkaListener(topics = "${spring.kafka.topic.sample}")
    public void listenMessage(String message) {
        log.info("Received Message: {}", message);
    }
}
