package br.com.nathanfiorito.hexa.messaging.architecture;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

@AnalyzeClasses(packages = "br.com.nathanfiorito.hexa.messaging")
public class LayersAccessTest {
    private static final String ADAPTERS_IN_LAYER = "AdaptersIn";
    private static final String ADAPTERS_OUT_LAYER = "AdaptersOut";
    private static final String USECASE_LAYER = "UseCase";
    private static final String PORTS_IN_LAYER = "PortsIn";
    private static final String PORTS_OUT_LAYER = "PortsOut";
    private static final String CONFIG_LAYER = "Config";

    @ArchTest
    public static final ArchRule LayersAccessRestrition = layeredArchitecture()
            .consideringAllDependencies()
            .layer(ADAPTERS_IN_LAYER).definedBy("..adapters.in..")
            .layer(ADAPTERS_OUT_LAYER).definedBy("..adapters.out..")
            .layer(USECASE_LAYER).definedBy("..application.core.usecase..")
            .layer(PORTS_IN_LAYER).definedBy("..application.ports.in..")
            .layer(PORTS_OUT_LAYER).definedBy("..application.ports.out..")
            .layer(CONFIG_LAYER).definedBy("..config..")
            .whereLayer(ADAPTERS_IN_LAYER).mayOnlyBeAccessedByLayers(CONFIG_LAYER)
            .whereLayer(ADAPTERS_OUT_LAYER).mayOnlyBeAccessedByLayers(CONFIG_LAYER)
            .whereLayer(USECASE_LAYER).mayOnlyBeAccessedByLayers(CONFIG_LAYER)
            .whereLayer(PORTS_IN_LAYER).mayOnlyBeAccessedByLayers(USECASE_LAYER, ADAPTERS_IN_LAYER)
            .whereLayer(PORTS_OUT_LAYER).mayOnlyBeAccessedByLayers(USECASE_LAYER, ADAPTERS_OUT_LAYER)
            .whereLayer(CONFIG_LAYER).mayNotBeAccessedByAnyLayer();
}
