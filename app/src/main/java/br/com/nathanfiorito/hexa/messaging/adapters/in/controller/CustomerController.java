package br.com.nathanfiorito.hexa.messaging.adapters.in.controller;

import br.com.nathanfiorito.hexa.messaging.adapters.in.controller.mapper.CustomerMapper;
import br.com.nathanfiorito.hexa.messaging.adapters.in.controller.request.CustomerRequest;
import br.com.nathanfiorito.hexa.messaging.application.core.ports.in.InsertCustomerInputPort;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customers")
public class CustomerController {
    private final InsertCustomerInputPort insertCustomerInputPort;
    private final CustomerMapper customerMapper;
    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest){
        var customer = customerMapper.toCustomer(customerRequest);

        insertCustomerInputPort.insert(customer, customerRequest.getZipCode());

        return ResponseEntity.ok().build();
    }
}
