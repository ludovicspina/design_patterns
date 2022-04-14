package creational.builder_maison.director;

import creational.builder_maison.builders.Builder;
import creational.builder_maison.components.Material;
import creational.builder_maison.components.Roof;
import creational.builder_maison.components.Windows;
import creational.builder_maison.houses.HouseType;

public class Director {

    public void constructMedievalHouse(Builder builder) {
        builder.setHouseType(HouseType.MEDIEVAL);
        builder.setWalls(4);
        builder.setDoors(2);
        builder.setGarage(true);
        builder.setRoof(new Roof(true, 20.0));
        builder.setWindows(new Windows(false, false));
        builder.setMaterial(Material.WOOD);
    }
}
