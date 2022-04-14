package creational.prototype_button;

import creational.prototype.example.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Prototype> prototypes = new ArrayList<>();
        List<Prototype> prototypesCopy = new ArrayList<>();

        Button button = new Button();
        button.x = 10;
        button.y = 20;
        button.shadow = 15;
        button.color = "red";
        prototypes.add(button);

        Button anotherButton = (Button) button.clone();
        prototypes.add(anotherButton);

        OtherButton otherButton = new OtherButton();
        otherButton.x = 10;
        otherButton.href = 20;
        otherButton.color = "blue";
        prototypes.add(otherButton);

        cloneAndCompare(prototypes, prototypesCopy);

    }


    private static void cloneAndCompare(List<Prototype> prototypes, List<Prototype> prototypesCopy) {
        for (Prototype prototype : prototypes) {
            prototypesCopy.add(prototype.clone());
        }

        for (int i = 0; i < prototypes.size(); i++) {
            if (prototypes.get(i) != prototypesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (prototypes.get(i).equals(prototypesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }


}
