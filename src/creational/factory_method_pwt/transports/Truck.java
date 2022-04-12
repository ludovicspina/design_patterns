package creational.factory_method_pwt.transports;

/**
 * HTML button implementation.
 */
public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("La tire à Dédé");
    }
}
