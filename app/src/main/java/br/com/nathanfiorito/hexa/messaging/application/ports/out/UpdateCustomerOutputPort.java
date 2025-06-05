package br.com.nathanfiorito.hexa.messaging.application.ports.out;

import br.com.nathanfiorito.hexa.messaging.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {
    void update (Customer customer);
}
