package creational.builder_maison.components;

public class Windows {
    private boolean forme;
    private boolean carreaux;

    public Windows(boolean forme, boolean carreaux) {
        this.forme = forme;
        this.carreaux = carreaux;
    }

    public boolean isForme() {
        return forme;
    }

    public boolean isCarreaux() {
        return carreaux;
    }
}


