package br.com.nathanfiorito.hexa.messaging.architecture;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = "br.com.nathanfiorito.hexa.messaging")
public class ClassResideAtTest {
    @ArchTest
    public static final ArchRule ConsumerResideOnlyConsumerPackage = classes()
            .that()
            .haveNameMatching(".*Consumer")
            .should()
            .resideInAPackage("..adapters.in.consumer")
            .as("As classes *Consumer devem estar localizadas dentro do pacote adapters.in.consumer");

    @ArchTest
    public static final ArchRule ConfigResideOnlyConfigPackage = classes()
            .that()
            .haveNameMatching(".*Config")
            .should()
            .resideInAPackage("..config")
            .as("As classes *Config devem estar localizadas dentro do pacote config");

    @ArchTest
    public static final ArchRule OutputPortResideOnlyOutputPortPackage = classes()
            .that()
            .haveNameMatching(".*OutputPort")
            .should()
            .resideInAPackage("..application.ports.out")
            .as("As classes *OutputPort devem estar localizadas dentro do pacote application.ports.out");

    @ArchTest
    public static final ArchRule InputPortResideOnlyInputPortPackage = classes()
            .that()
            .haveNameMatching(".*InputPort")
            .should()
            .resideInAPackage("..application.ports.in")
            .as("As classes *InputPort devem estar localizadas dentro do pacote application.ports.in");

    @ArchTest
    public static final ArchRule UseCaseResideOnlyUseCasePackage = classes()
            .that()
            .haveNameMatching(".*UseCase")
            .should()
            .resideInAPackage("..application.core.usecase")
            .as("As classes *UseCase devem estar localizadas dentro do pacote application.core.usecase");

    @ArchTest
    public static final ArchRule AdapterResideOnlyAdaptersPackage = classes()
            .that()
            .haveNameMatching(".*Adapter")
            .should()
            .resideInAPackage("..adapters.out")
            .as("As classes *Adapter devem estar localizadas dentro do pacote adapters.out");

    @ArchTest
    public static final ArchRule RepositoryResideOnlyRepositoryPackage = classes()
            .that()
            .haveNameMatching(".*Repository")
            .should()
            .resideInAPackage("..adapters.out.repository")
            .as("As classes *Repository devem estar localizadas dentro do pacote adapters.out.repository");

    @ArchTest
    public static final ArchRule EntityResideOnlyEntityPackage = classes()
            .that()
            .haveNameMatching(".*Entity")
            .should()
            .resideInAPackage("..adapters.out.repository.entity")
            .as("As classes *Entity devem estar localizadas dentro do pacote adapters.out.repository.entity");

    @ArchTest
    public static final ArchRule MapperResideOnlyMapperPackage = classes()
            .that()
            .haveNameMatching(".*Mapper")
            .should()
            .resideInAPackage("..mapper")
            .as("As classes *Repository devem estar localizadas dentro do pacote mapper");

    @ArchTest
    public static final ArchRule ClientResideOnlyClientPackage = classes()
            .that()
            .haveNameMatching(".*Client")
            .should()
            .resideInAPackage("..adapters.out.client")
            .as("As classes *Client devem estar localizadas dentro do pacote adapters.out.client");

    @ArchTest
    public static final ArchRule ControllerResideOnlyControllerPackage = classes()
            .that()
            .haveNameMatching(".*Controller")
            .should()
            .resideInAPackage("..adapters.in.controller")
            .as("As classes *Controller devem estar localizadas dentro do pacote adapters.in.controller");

    @ArchTest
    public static final ArchRule RequestResideOnlyRequestPackage = classes()
            .that()
            .haveNameMatching(".*Request")
            .should()
            .resideInAnyPackage("..adapters.in.controller.request", "..adapters.out.client.request")
            .as("As classes *Controller devem estar localizadas dentro do pacote adapters.in.controller.request ou adapters.out.client.request");

    @ArchTest
    public static final ArchRule ResponseResideOnlyResponsePackage = classes()
            .that()
            .haveNameMatching(".*Response")
            .should()
            .resideInAnyPackage("..adapters.in.controller.response", "..adapters.out.client.response")
            .as("As classes *Response devem estar localizadas dentro do pacote adapters.in.controller.response ou adapters.out.client.response");

    @ArchTest
    public static final ArchRule ExceptionResideOnlyExceptionPackage = classes()
            .that()
            .haveNameMatching(".*Exception")
            .should()
            .resideInAPackage("..application.core.exceptions")
            .as("As classes *Exception devem estar localizadas dentro do pacote application.core.exceptions");
}
