package creational.factory_method_pwt.transports;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Windows button implementation.
 */
public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Erika, pavillon  maltais !");
    }
}
