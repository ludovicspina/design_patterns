package creational.prototype_button;

import java.util.Objects;

public abstract class Prototype {
    public int x;
    public int y;
    public String color;

    public Prototype() {
    }

    public Prototype(Prototype target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Prototype clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Prototype)) return false;
        Prototype prototype2 = (Prototype) object2;
        return prototype2.x == x && prototype2.y == y && Objects.equals(prototype2.color, color);
    }
}
