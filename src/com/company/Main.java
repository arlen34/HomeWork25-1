package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {
/**Car деген класс тузунуз (Id, номер авто)
Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат (год выпуска, модель, цена, цвет)
HashMap тузунуз ключ - машина, маани - машинанын данныйлары
HashMapти толтуруп кайра entrySet деген методун колдонуп баардык элементтерин консольго чыгарыныз.*/
    public static void main(String[] args) {

        Map<Car, AboutCar> carMap = new HashMap<>();
        carMap.put(new Car(1,744),new AboutCar(1999,"Honda",5000,"White"));
        carMap.put(new Car(2,754),new AboutCar(2011,"Mersedes",15000,"Grey"));
        carMap.put(new Car(3,201),new AboutCar(2021,"BMW",20000,"Black"));

        for (Map.Entry <Car, AboutCar> item : carMap.entrySet()){
            System.out.println(item.getKey() + "\n" + item.getValue());
        }
    }
}
