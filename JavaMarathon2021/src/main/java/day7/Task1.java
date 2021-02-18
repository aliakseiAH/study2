package day7;

// Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
//В классе Самолет реализовать статический метод compareAirplanes, который в качестве
// аргументов принимает два объекта класса Airplane (два самолета) и выводит сообщение
// в консоль о том, какой из самолетов длиннее.

public class Task1 {
    public static void main(String[] args) {
        Airplane su = new Airplane("Сухой", 2010, 27.7, 32.1);
        Airplane mig = new Airplane("Микоян", 2001, 32.3, 29.1);

        Airplane.compareAirplanes(su, mig);

    }
}