package day6;

//В классах Автомобиль и Мотоцикл реализуйте два метода:
//void info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
//int yearDifference(int inputYear) - принимает в качестве аргумента целое число (год)
// и возвращает разницу между переданным годом и годом выпуска транспортного средства
// (возвращаться должно всегда положительное число).
//В методе main() класса Task1 создайте экземпляр автомобиля или мотоцикла, проверьте работу каждого метода.

public class Task1 {
    public static void main(String[] args) {
        Auto polik = new Auto();
        polik.setColor("grey");
        polik.setModel("polo");
        polik.setYearOfProduction(2018);
        polik.info();
        System.out.println(polik.yearDifference(-2020));

        Moto shershen = new Moto(1996, "green", "Honda");
        shershen.info();
        System.out.println(shershen.yearDifference(2020));

    }
}
