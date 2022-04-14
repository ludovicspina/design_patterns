package creational.builder_maison.houses;

import creational.builder_maison.components.Material;
import creational.builder_maison.components.Roof;
import creational.builder_maison.components.Windows;

public class House {
    private final HouseType houseType;
    private final int doors;
    private final boolean garage;
    private final Roof roof;
    private int walls;
    private Windows windows;
    private Material material;

    public House(HouseType houseType, int doors, boolean garage, Roof roof, int walls, Windows windows, Material material) {
        this.houseType = houseType;
        this.doors = doors;
        this.garage = garage;
        this.roof = roof;
        this.walls = walls;
        this.windows = windows;
        this.material = material;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isGarage() {
        return garage;
    }

    public Roof getRoof() {
        return roof;
    }

    public int getWalls() {
        return walls;
    }

    public Windows getWindows() {
        return windows;
    }

    public Material getMaterial() {
        return material;
    }

    public String print() {
        String info = "";
        info += "Type of house: " + houseType + "\n";
        info += "Count of doors: " + doors + "\n";
        return info;
    }
}
