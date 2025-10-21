package br.com.nathanfiorito.hexa.messaging.application.ports.in;

import br.com.nathanfiorito.hexa.messaging.application.core.domain.Customer;

public interface UpdateCustomerInputPort {
    public void update(Customer customer, String zipCode);
}
