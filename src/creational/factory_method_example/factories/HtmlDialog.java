package creational.factory_method_example.factories;

import creational.factory_method_example.buttons.Button;
import creational.factory_method_example.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
