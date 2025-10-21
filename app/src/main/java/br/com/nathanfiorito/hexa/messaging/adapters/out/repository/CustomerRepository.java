package br.com.nathanfiorito.hexa.messaging.adapters.out.repository;

import br.com.nathanfiorito.hexa.messaging.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
