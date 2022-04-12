package creational.factory_method_pwt.logistics;

import creational.factory_method_pwt.transports.Transport;

/**
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 */
public abstract class AppLogistic {

    public void someOperation() {
        // ... other code ...

        Transport transport = createTransport();
        transport.deliver();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Transport createTransport();
}
