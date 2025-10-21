package br.com.nathanfiorito.hexa.messaging.application.ports.in;

import br.com.nathanfiorito.hexa.messaging.application.core.domain.Customer;

public interface InsertCustomerInputPort {
    void insert(Customer customer, String zipCode);
}
