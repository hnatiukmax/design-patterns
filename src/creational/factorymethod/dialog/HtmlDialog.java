package creational.factorymethod.dialog;

import creational.factorymethod.button.Button;
import creational.factorymethod.button.HtmlButton;

/**
 * HTML-диалог.
 */
public class HtmlDialog extends Dialog {

    @Override
    protected Button createButton() {
        return new HtmlButton();
    }
}
