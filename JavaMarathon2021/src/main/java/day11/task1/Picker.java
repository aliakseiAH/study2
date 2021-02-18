package day11.task1;

public class Picker implements Worker{
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setIsPayed(boolean isPayed) {
        this.isPayed = isPayed;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
    public Picker (Warehouse warehouse) {
        this.warehouse = warehouse;
    }
    @Override
    public void doWork() {
        this.salary += 80;
        warehouse.setCountPickedOrders();
    }
    @Override
    public void bonus() {
        if (this.isPayed==false) {
        if (warehouse.getCountPickedOrders()==10000) {
        this.salary+=70000;
        this.isPayed=true;
        } else if (warehouse.getCountPickedOrders()<10000) {
            System.out.println("Бонус пока не доступен");
        }
        } else System.out.println("Бонус уже был выплачен");

    }
}
