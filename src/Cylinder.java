import java.util.concurrent.CyclicBarrier;

import static java.lang.Math.PI;

public class Cylinder {
    private int length;
    private int width;
    private int height;
    private int radius;
public Cylinder(){}
    public Cylinder(int length, int width, int height, int radius) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.radius = radius;
    }
    public static void areOfCylinder(int radius, int height) {
        System.out.println(2 * PI * radius * (height + radius));
    }

    public static void perimeterOfCylinder(int radius, int height) {
        System.out.println((PI * radius * radius * height));
    }
}
