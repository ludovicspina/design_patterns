package creational.builder_maison;

import creational.builder.cars.Manual;
import creational.builder_maison.director.Director;
import creational.builder_maison.builders.HouseBuilder;
import creational.builder_maison.houses.House;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        HouseBuilder builder = new HouseBuilder();
        director.constructMedievalHouse(builder);

        House house = builder.getResult();
        System.out.println(house.print());
    }
}
