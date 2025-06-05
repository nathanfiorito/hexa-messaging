package br.com.nathanfiorito.hexa.messaging.adapters.out;

import br.com.nathanfiorito.hexa.messaging.adapters.out.repository.CustomerRepository;
import br.com.nathanfiorito.hexa.messaging.adapters.out.repository.mapper.CustomerEntityMapper;
import br.com.nathanfiorito.hexa.messaging.application.core.domain.Customer;
import br.com.nathanfiorito.hexa.messaging.application.ports.out.FindCustomerByIdOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {
    private final CustomerRepository customerRepository;
    private final CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var costumerEntity = customerRepository.findById(id);

        return costumerEntity.map(customerEntityMapper::toCustomer);
    }
}
