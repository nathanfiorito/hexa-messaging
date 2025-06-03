package br.com.nathanfiorito.hexa.messaging.application.core.ports.out;

import br.com.nathanfiorito.hexa.messaging.application.core.domain.Customer;

public interface InsertCustomerOutputPort {
    void insert(Customer customer);
}
