package br.com.nathanfiorito.hexa.messaging.config;

import br.com.nathanfiorito.hexa.messaging.adapters.out.FindAddressByZipCodeAdapter;
import br.com.nathanfiorito.hexa.messaging.adapters.out.UpdateCostumerAdapter;
import br.com.nathanfiorito.hexa.messaging.application.core.usecase.FindCustomerByIdUseCase;
import br.com.nathanfiorito.hexa.messaging.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCostumerAdapter updateCostumerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCostumerAdapter);
    }
}
