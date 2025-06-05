package br.com.nathanfiorito.hexa.messaging.adapters.out;

import br.com.nathanfiorito.hexa.messaging.adapters.out.repository.CustomerRepository;
import br.com.nathanfiorito.hexa.messaging.application.ports.out.DeleteCustomerByIdOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutputPort {
    private final CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
