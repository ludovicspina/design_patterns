package creational.builder_maison.components;

public class Roof {
    private boolean forme;
    private double hauteur;

    public Roof(boolean forme, double hauteur) {
        this.forme = forme;
        this.hauteur = hauteur;
    }

    public boolean isForme() {
        return forme;
    }

    public double getHauteur() {
        return hauteur;
    }
}
