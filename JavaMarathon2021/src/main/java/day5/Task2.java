package day5;

//Создать класс Мотоцикл (англ. Motorbike) с полями “Год выпуска”, “Цвет”, “Модель”.
// Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
// Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
// Вывести в консоль значение каждого из полей, используя get методы.

public class Task2 {
    public static void main(String[] args) {
        Moto shershen = new Moto(1996, "green", "honda");
        Moto bike = new Moto();
        System.out.println(bike.getYearOfProduction() + " " + bike.getColor() + " " + bike.getModel());
        System.out.println("Year= " + shershen.getYearOfProduction());
        System.out.println("Color= " + shershen.getColor());
        System.out.println("Model= " + shershen.getModel());

    }
}


