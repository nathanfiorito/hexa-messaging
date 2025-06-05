package br.com.nathanfiorito.hexa.messaging.application.ports.out;

public interface SendCpfForValidationOutputPort {
    void send(String cpf);
}
