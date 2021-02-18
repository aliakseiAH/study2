package seaBattle;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private int x;
    private int y;
    private int z;
    private int p;


    private int[] s1 = {x, y};


    public Ship(int x, int y) {
        this.x = x;
        this.y = y;

    }
    public Ship(int x, int y, int z, int p) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.p = p;

    }

}
