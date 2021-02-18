package day7;

public class Player {
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int countPlayers;
    private int stamina;

    public int getStamina() {
        return stamina;
    }
    public static int getCountPlayers() {
        return countPlayers;
    }

    public Player (int stamina) {
        this.stamina = stamina;
        if (countPlayers>5){
            countPlayers=6;}
        else countPlayers++;
    }

    public void run() {
        if (stamina>MIN_STAMINA) {
            stamina = stamina -1;


        if (stamina == MIN_STAMINA) {
            countPlayers = countPlayers - 1;



        }
      }
    }


    public static void info() {
        switch (countPlayers) {
            case 0:
                System.out.println("Команды неполные. На поле еще есть 6 свободных мест.");
                break;
            case 1:
                System.out.println("Команды неполные. На поле еще есть 5 свободных мест.");
                break;
            case 2:
                System.out.println("Команды неполные. На поле еще есть 4 свободных места.");
                break;
            case 3:
                System.out.println("Команды неполные. На поле еще есть 3 свободных места.");
                break;
            case 4:
                System.out.println("Команды неполные. На поле еще есть 2 свободных места.");
                break;
            case 5:
                System.out.println("Команды неполные. На поле еще есть 1 свободное место.");
                break;
            case 6:
                System.out.println("На поле нет свободных мест");
                break;
        }
    }
}
