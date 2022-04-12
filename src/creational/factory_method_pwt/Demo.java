package creational.factory_method_pwt;

import creational.factory_method_pwt.logistics.AppLogistic;
import creational.factory_method_pwt.logistics.RoadLogistic;
import creational.factory_method_pwt.logistics.SeaLogistic;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    private static AppLogistic appLogistic;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            appLogistic = new SeaLogistic();
        } else {
            appLogistic = new RoadLogistic();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        appLogistic.someOperation();
    }
}
