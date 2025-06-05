package br.com.nathanfiorito.hexa.messaging.adapters.out;

import br.com.nathanfiorito.hexa.messaging.adapters.out.client.FindAddressByZipCodeClient;
import br.com.nathanfiorito.hexa.messaging.adapters.out.client.mapper.AddressResponseMapper;
import br.com.nathanfiorito.hexa.messaging.application.core.domain.Address;
import br.com.nathanfiorito.hexa.messaging.application.ports.out.FindAddressByZipCodeOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {
    private final FindAddressByZipCodeClient findAddressByZipCodeClient;
    private final AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);

        return addressResponseMapper.toAddress(addressResponse);
    }
}
