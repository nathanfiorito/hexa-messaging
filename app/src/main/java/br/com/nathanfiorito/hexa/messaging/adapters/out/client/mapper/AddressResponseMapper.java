package br.com.nathanfiorito.hexa.messaging.adapters.out.client.mapper;

import br.com.nathanfiorito.hexa.messaging.adapters.out.client.response.AddressResponse;
import br.com.nathanfiorito.hexa.messaging.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
