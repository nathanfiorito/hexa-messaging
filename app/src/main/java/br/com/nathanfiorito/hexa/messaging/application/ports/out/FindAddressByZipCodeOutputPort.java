package br.com.nathanfiorito.hexa.messaging.application.ports.out;

import br.com.nathanfiorito.hexa.messaging.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
    Address find(String zipCode);
}
