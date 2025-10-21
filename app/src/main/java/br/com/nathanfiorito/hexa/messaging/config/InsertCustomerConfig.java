package br.com.nathanfiorito.hexa.messaging.config;

import br.com.nathanfiorito.hexa.messaging.adapters.out.FindAddressByZipCodeAdapter;
import br.com.nathanfiorito.hexa.messaging.adapters.out.InsertCustomerAdapter;
import br.com.nathanfiorito.hexa.messaging.adapters.out.SendCpfForValidationAdapter;
import br.com.nathanfiorito.hexa.messaging.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfForValidationAdapter sendCpfForValidationAdapter
    ){
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfForValidationAdapter);
    }
}
