package br.com.isaquebrb.kafka_sample.api.controller;

import br.com.isaquebrb.kafka_sample.kafka.SampleMessage;
import br.com.isaquebrb.kafka_sample.kafka.SampleProducer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("sample-message")
public class SampleMessageController {

    private final SampleProducer sampleProducer;

    public SampleMessageController(SampleProducer sampleProducer) {
        this.sampleProducer = sampleProducer;
    }

    @PostMapping("/send")
    @ResponseStatus(HttpStatus.CREATED)
    public void sendMessage(@RequestBody SampleMessage sampleMessage) {
        sampleProducer.sendMessage(sampleMessage);
    }
}
