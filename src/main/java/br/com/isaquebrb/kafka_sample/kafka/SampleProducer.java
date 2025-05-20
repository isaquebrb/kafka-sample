package br.com.isaquebrb.kafka_sample.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SampleProducer {

    private static final Logger log = LoggerFactory.getLogger(SampleProducer.class);

    private final KafkaTemplate<String, SampleMessage> kafkaTemplate;

    @Value("${spring.kafka.topic.sample}")
    private String topicSampleName;

    public SampleProducer(KafkaTemplate<String, SampleMessage> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(SampleMessage sampleMessage) {
        kafkaTemplate.send(topicSampleName, sampleMessage);
        log.info("Sent Message '{}' to topic: {}", sampleMessage, topicSampleName);
    }
}
