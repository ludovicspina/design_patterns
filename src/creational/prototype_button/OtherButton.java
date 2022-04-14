package creational.prototype_button;

public class OtherButton extends Prototype {

    public int href;

    public OtherButton() {
    }

    public OtherButton(OtherButton target) {
        super(target);
        if (target != null) {
            this.href = target.href;
        }
    }

    @Override
    public Prototype clone() {
        return new OtherButton(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof OtherButton) || !super.equals(object2)) return false;
        OtherButton prototype2 = (OtherButton) object2;
        return prototype2.href == href;
    }
}
