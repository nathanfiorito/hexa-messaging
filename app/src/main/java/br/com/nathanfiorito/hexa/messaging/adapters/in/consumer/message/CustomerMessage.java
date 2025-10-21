package br.com.nathanfiorito.hexa.messaging.adapters.in.consumer.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerMessage {
    private String id;
    private String name;
    private String zipCode;
    private String cpf;
    private Boolean isCpfValid;
}
