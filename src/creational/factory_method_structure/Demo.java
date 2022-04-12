package creational.factory_method_structure;


import creational.factory_method_structure.creators.ConcreteCreatorA;
import creational.factory_method_structure.creators.ConcreteCreatorB;
import creational.factory_method_structure.creators.Creator;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    private static Creator creator;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 11")) {
            creator = new ConcreteCreatorA();
        } else {
            creator = new ConcreteCreatorB();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        creator.someOperation();
    }
}
