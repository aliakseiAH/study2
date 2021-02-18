package day13;

public class Task1 {
    public static void main(String[] args) {
        User u1 = new User("Baska");
        User u2 = new User("Mak");
        User u3 = new User("Bratan");


        u1.subscribe(u2);
        u1.subscribe(u3);
        u2.subscribe(u1);
        u2.subscribe(u3);
        u3.subscribe(u1);
        u3.subscribe(u2);
        u1.sendMessage(u2, "huy");
        u1.sendMessage(u2, "pizda");
        u2.sendMessage(u1, "igogo");
        u2.sendMessage(u1, "rzhu");
        u2.sendMessage(u1, "kopyto");
        u3.sendMessage(u1, "khrth");
        u3.sendMessage(u1, "fruchcht");
        u3.sendMessage(u1, "deutsch");
        u1.sendMessage(u3, "english");
        u1.sendMessage(u3, "espaniol");
        u1.sendMessage(u3, "debil");
        u3.sendMessage(u1, "huylo");
        System.out.println(MessageDatabase.getMessages().toString());

        MessageDatabase.showDialog(u1, u2);

        //System.out.println(toString());


    }
}
