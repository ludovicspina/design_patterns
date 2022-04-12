package creational.factory_method_pwt.logistics;

import creational.factory_method_pwt.transports.Transport;
import creational.factory_method_pwt.transports.Truck;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class RoadLogistic extends AppLogistic {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
