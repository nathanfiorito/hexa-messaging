package br.com.nathanfiorito.hexa.messaging.config;

import br.com.nathanfiorito.hexa.messaging.adapters.out.FindCustomerByIdAdapter;
import br.com.nathanfiorito.hexa.messaging.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(
            FindCustomerByIdAdapter findCustomerByIdAdapter
    ){
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }
}
