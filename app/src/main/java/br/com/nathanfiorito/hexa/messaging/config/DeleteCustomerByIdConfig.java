package br.com.nathanfiorito.hexa.messaging.config;

import br.com.nathanfiorito.hexa.messaging.adapters.out.DeleteCustomerByIdAdapter;
import br.com.nathanfiorito.hexa.messaging.application.core.usecase.DeleteCustomerByIdUseCase;
import br.com.nathanfiorito.hexa.messaging.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {
    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
        FindCustomerByIdUseCase findCustomerByIdUseCase,
        DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }
}
