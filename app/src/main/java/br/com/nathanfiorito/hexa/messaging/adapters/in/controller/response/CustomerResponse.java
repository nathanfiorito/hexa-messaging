package br.com.nathanfiorito.hexa.messaging.adapters.in.controller.response;

import br.com.nathanfiorito.hexa.messaging.adapters.out.client.respose.AddressResponse;
import lombok.Data;

@Data
public class CustomerResponse {
    private String name;
    private AddressResponse address;
    private String cpf;
    private Boolean isCpfValid;
}