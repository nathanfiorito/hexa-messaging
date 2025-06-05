package br.com.nathanfiorito.hexa.messaging.application.ports.out;

import br.com.nathanfiorito.hexa.messaging.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {
    Optional<Customer> find(String id);
}
