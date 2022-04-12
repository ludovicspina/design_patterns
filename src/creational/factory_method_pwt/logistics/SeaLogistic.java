package creational.factory_method_pwt.logistics;

import creational.factory_method_pwt.transports.Transport;
import creational.factory_method_pwt.transports.Ship;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class SeaLogistic extends AppLogistic {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
