package br.com.nathanfiorito.hexa.messaging.adapters.in.controller;

import br.com.nathanfiorito.hexa.messaging.adapters.in.controller.mapper.CustomerMapper;
import br.com.nathanfiorito.hexa.messaging.adapters.in.controller.request.CustomerRequest;
import br.com.nathanfiorito.hexa.messaging.adapters.in.controller.response.CustomerResponse;
import br.com.nathanfiorito.hexa.messaging.application.ports.in.DeleteCustomerByIdInputPort;
import br.com.nathanfiorito.hexa.messaging.application.ports.in.FindCustomerByIdInputPort;
import br.com.nathanfiorito.hexa.messaging.application.ports.in.InsertCustomerInputPort;
import br.com.nathanfiorito.hexa.messaging.application.ports.in.UpdateCustomerInputPort;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customers")
public class CustomerController {
    private final InsertCustomerInputPort insertCustomerInputPort;
    private final FindCustomerByIdInputPort findCustomerByIdOutputPort;
    private final UpdateCustomerInputPort updateCustomerInputPort;
    private final DeleteCustomerByIdInputPort deleteCustomerByIdInputPort;
    private final CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest){
        var customer = customerMapper.toCustomer(customerRequest);

        insertCustomerInputPort.insert(customer, customerRequest.getZipCode());

        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable("id") final String id){
        var customer = findCustomerByIdOutputPort.find(id);

        return ResponseEntity.ok().body(customerMapper.toCustomerResponse(customer));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable("id") final String id, @Valid @RequestBody CustomerRequest customerRequest){
        var customer = customerMapper.toCustomer(customerRequest);
        customer.setId(id);

        updateCustomerInputPort.update(customer, customerRequest.getZipCode());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") final String id){
        deleteCustomerByIdInputPort.delete(id);
        return ResponseEntity.noContent().build();
    }


}
