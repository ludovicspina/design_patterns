package creational.factory_method_structure.creators;

import creational.factory_method_structure.products.Product;

/**
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 */
public abstract class Creator {

    public void someOperation() {
        // ... other code ...

        Product product = createProduct();
        product.doStuff();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Product createProduct();
}
