package day11.task1;

public class Courier implements Worker {
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
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
    @Override
    public void doWork() {
        this.salary+=100;
        warehouse.setCountDeliveredOrders();
    }
    @Override
    public void bonus() {
          if (this.isPayed==false) {
            if (warehouse.getCountDeliveredOrders()==10000) {
                this.salary+=50000;
                isPayed=true;
            } else if (warehouse.getCountDeliveredOrders()<10000) {
                System.out.println("Бонус пока не доступен");
            }
        } else System.out.println("Бонус уже был выплачен");

    }
}
