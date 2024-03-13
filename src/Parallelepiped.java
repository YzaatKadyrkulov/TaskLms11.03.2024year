public class Parallelepiped {
    private int length;
    private int width;
    private int height;
    private int radius;
    public Parallelepiped(){}

    public Parallelepiped(int length, int width, int height, int radius) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.radius = radius;
    }

    public static void areOfParallelepiped(int length, int width, int height) {
            System.out.println(" Are of parallelepiped: " + 2 * ((height * length) + (length * width) + (height * width)));
    }

    public static void perimeterOfParallelepiped(int length, int width, int height) {
        System.out.println((" Perimeter of parallelepiped: " + length * width * height));

    }

}

