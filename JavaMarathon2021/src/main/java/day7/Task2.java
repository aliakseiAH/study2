package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();

        Player p1 = new Player((rand.nextInt(10)+91));
        Player p2 = new Player((rand.nextInt(10)+91));
        Player p3 = new Player((rand.nextInt(10)+91));
        Player p4 = new Player((rand.nextInt(10)+91));
        Player p5 = new Player((rand.nextInt(10)+91));
        Player p6 = new Player((rand.nextInt(10)+91));
        Player p7 = new Player((rand.nextInt(10)+91));
        Player p8 = new Player((rand.nextInt(10)+91));

        Player.info();
        System.out.println("Исходное число игроков = " + Player.getCountPlayers());
        System.out.println("Исходное значение = " + p1.getStamina());
        p1.run();
        p1.run();
        p1.run();
        p1.run();
        p1.run();
        p1.run();
        p1.run();
        p1.run();
        p1.run();
        p1.run();
        System.out.println("Конечная выносливость " + p1.getStamina());
        System.out.println("Конечное число игроков = " + Player.getCountPlayers());









    }
}
