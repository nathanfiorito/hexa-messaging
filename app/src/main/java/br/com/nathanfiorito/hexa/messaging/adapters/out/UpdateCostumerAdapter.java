package br.com.nathanfiorito.hexa.messaging.adapters.out;

import br.com.nathanfiorito.hexa.messaging.adapters.out.repository.CustomerRepository;
import br.com.nathanfiorito.hexa.messaging.adapters.out.repository.mapper.CustomerEntityMapper;
import br.com.nathanfiorito.hexa.messaging.application.core.domain.Customer;
import br.com.nathanfiorito.hexa.messaging.application.ports.out.UpdateCustomerOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UpdateCostumerAdapter implements UpdateCustomerOutputPort {
    private final CustomerRepository customerRepository;
    private final CustomerEntityMapper customerEntityMapper;


    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);

        customerRepository.save(customerEntity);
    }
}
