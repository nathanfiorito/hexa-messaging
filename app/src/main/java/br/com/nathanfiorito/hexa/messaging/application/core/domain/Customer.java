package br.com.nathanfiorito.hexa.messaging.application.core.domain;

public class Customer {
    private String id;
    private String name;
    private Address address;
    private String cpf;
    private boolean isCpfValida;

    public Customer() {}

    public Customer(String id, String name, Address address, String cpf, boolean isCpfValida) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.cpf = cpf;
        this.isCpfValida = isCpfValida;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isCpfValida() {
        return isCpfValida;
    }

    public void setCpfValida(boolean cpfValida) {
        isCpfValida = cpfValida;
    }
}
