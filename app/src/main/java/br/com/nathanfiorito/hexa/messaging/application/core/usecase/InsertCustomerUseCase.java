package br.com.nathanfiorito.hexa.messaging.application.core.usecase;

import br.com.nathanfiorito.hexa.messaging.application.core.domain.Customer;
import br.com.nathanfiorito.hexa.messaging.application.core.ports.in.InsertCustomerInputPort;
import br.com.nathanfiorito.hexa.messaging.application.core.ports.out.FindAddressByZipCodeOutputPort;
import br.com.nathanfiorito.hexa.messaging.application.core.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {
    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            InsertCustomerOutputPort insertCustomerOutputPort
    ) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
    }
}
