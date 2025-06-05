package br.com.nathanfiorito.hexa.messaging.adapters.out.repository.mapper;

import br.com.nathanfiorito.hexa.messaging.adapters.out.repository.entity.CustomerEntity;
import br.com.nathanfiorito.hexa.messaging.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);
    Customer toCustomer(CustomerEntity customerEntity);
}
