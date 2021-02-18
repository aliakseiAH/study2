package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);
        picker1.setIsPayed(false);
        picker1.setSalary(0);
        courier1.setIsPayed(false);
        courier1.setSalary(0);
        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);

        businessProcess(picker1);
        businessProcess(courier1);
        picker1.doWork();
        courier1.doWork();


        System.out.println(picker1.toString());
        System.out.println(courier1.toString());

        picker2.doWork();
        courier2.doWork();
        System.out.println(picker2.toString());
        System.out.println(courier2.toString());




    }
    static void businessProcess (Worker worker) {
        for (int i = 0; i<10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
