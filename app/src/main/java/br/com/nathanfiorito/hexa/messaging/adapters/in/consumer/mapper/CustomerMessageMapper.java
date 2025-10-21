package br.com.nathanfiorito.hexa.messaging.adapters.in.consumer.mapper;

import br.com.nathanfiorito.hexa.messaging.adapters.in.consumer.message.CustomerMessage;
import br.com.nathanfiorito.hexa.messaging.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {
    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);
}
