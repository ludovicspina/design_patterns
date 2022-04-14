package creational.prototype_button;

public class Button extends Prototype {
    public int shadow;

    public Button() {
    }

    public Button(Button target) {
        super(target);
        if (target != null) {
            this.shadow = target.shadow;
        }
    }

    @Override
    public Prototype clone() {
        return new Button(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Button) || !super.equals(object2)) return false;
        Button prototype2 = (Button) object2;
        return prototype2.shadow == shadow;
    }

}
