package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane su = new Airplane("Сухой", 1991, 23.1, 26.7);
        su.info();
        Airplane mig = new Airplane("Микоян", 1975, 22.7, 31.2);
        mig.info();
        mig.setYear(1989);
        mig.setLength(19.1);
        mig.fillUp(7);
        mig.info();
        mig.fillUp(2);
        mig.info();

    }
}
