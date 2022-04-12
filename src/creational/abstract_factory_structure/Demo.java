package creational.abstract_factory_structure;

import creational.abstract_factory_structure.app.Client;
import creational.abstract_factory_structure.factories.AbstractFactory;
import creational.abstract_factory_structure.factories.ConcreteFactory1;
import creational.abstract_factory_structure.factories.ConcreteFactory2;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Client configureApplication() {
        Client app;
        AbstractFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new ConcreteFactory1();
            app = new Client(factory);
        } else {
            factory = new ConcreteFactory2();
            app = new Client(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Client app = configureApplication();
        app.someOperation();
    }
}
