package creational.builder_maison.builders;

import creational.builder_maison.components.Material;
import creational.builder_maison.components.Roof;
import creational.builder_maison.components.Windows;
import creational.builder_maison.houses.HouseType;

public interface Builder {
    void setHouseType(HouseType type);

    void setDoors(int doors);

    void setGarage(boolean garage);

    void setRoof(Roof roof);

    void setWalls(int walls);

    void setWindows(Windows windows);

    void setMaterial(Material material);
}
