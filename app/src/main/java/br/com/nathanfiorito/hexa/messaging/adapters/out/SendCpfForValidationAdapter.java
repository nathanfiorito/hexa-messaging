package br.com.nathanfiorito.hexa.messaging.adapters.out;

import br.com.nathanfiorito.hexa.messaging.application.ports.out.SendCpfForValidationOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SendCpfForValidationAdapter implements SendCpfForValidationOutputPort {
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final String KAFKA_TOPIC = "tp-cpf-validation";

    @Override
    public void send(String cpf) {
        kafkaTemplate.send(KAFKA_TOPIC, cpf);
    }
}
