package br.com.nathanfiorito.hexa.messaging.adapters.in.consumer;

import br.com.nathanfiorito.hexa.messaging.adapters.in.consumer.mapper.CustomerMessageMapper;
import br.com.nathanfiorito.hexa.messaging.adapters.in.consumer.message.CustomerMessage;
import br.com.nathanfiorito.hexa.messaging.application.ports.in.UpdateCustomerInputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ReceiveValidateCpfConsumer {
    private final UpdateCustomerInputPort updateCustomerInputPort;
    private final CustomerMessageMapper customerMapper;

    private final String KAFKA_TOPIC = "tp-cpf-validated";
    private final String GROUP_ID = "nathanfiorito";

    @KafkaListener(topics = KAFKA_TOPIC, groupId = GROUP_ID)
    public void receive(CustomerMessage customerMessage){
        var customer = customerMapper.toCustomer(customerMessage);
        updateCustomerInputPort.update(customer, customerMessage.getZipCode());
    }
}
