package creational.builder_maison.builders;

import creational.builder_maison.components.Material;
import creational.builder_maison.components.Roof;
import creational.builder_maison.components.Windows;
import creational.builder_maison.houses.House;
import creational.builder_maison.houses.HouseType;

public class HouseBuilder implements Builder {
    private HouseType type;
    private int doors;
    private boolean garage;
    private Roof roof;
    private int walls;
    private Windows windows;
    private Material material;

    public void setHouseType(HouseType type) {
        this.type = type;
    }

    @Override
    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    @Override
    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    @Override
    public void setWalls(int walls) {
        this.walls = walls;
    }

    @Override
    public void setWindows(Windows windows) {
        this.windows = windows;
    }

    @Override
    public void setMaterial(Material material) {
        this.material = material;
    }

    public House getResult() {
        return new House(type, doors, garage, roof, walls, windows, material);
    }
}
