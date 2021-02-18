package day15;

public class Shoe {
    private String name;
    private int size;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", quantity=" + quantity +
                '}';
    }

    public Shoe(String[] shoe1) {
        this.name = shoe1[0];
        this.size = Integer.parseInt(shoe1[1]);
        this.quantity = Integer.parseInt(shoe1[2]);


    }
}
