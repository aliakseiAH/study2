package day5;

//1. Создать класс Автомобиль (англ. Car) с полями “Год выпуска”,
// “Цвет”, “Модель”. Создать get и set методы для каждого поля.
// Создать экземпляр класса Автомобиль. Задать значение для каждого поля,
// используя set методы. Вывести в консоль значение каждого из полей, используя get методы.
//Созданный вами класс должен отвечать принципам инкапсуляции.

import java.sql.SQLOutput;

public class Task1 {
    public static void main(String[] args) {
        Auto polik = new Auto();
        polik.setYearOfProduction(2018);
        polik.setColor("grey");
        polik.setModel("Polo");
        System.out.println("Year= " + polik.getYearOfProduction());
        System.out.println("Color= " + polik.getColor());
        System.out.println("Model= " + polik.getModel());

    }
}


