import java.nio.channels.ScatteringByteChannel;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        /**
         * Параллелепипедтин жана цилиндрдин площадь жана объёмун эсептеген бир программа жазабыз.
         *
         *  Фигуралардын параметрлерин(длина, ширина, высота,радиус) берип жатканда туура эмес маалымат
         *
         *  берилсе Exception ыргытып, аны оброботка кылып кандай ошибка чыкканын корсотуп берсин.
         *
         *         Мумкун болгон каталар:
         *
         *        1) берилген маалымат терс сан болсо
         *
         *        2) берилген маалымат сан эмес тамга болсо
         *
         *        3) жана озунуздор берген кошумча каталар болсо да болот
         *
         *
         *
         *   Параллелепипед:
         *
         * - Фигуранын аянтын эсептеген формула: 2*((height * length) + (length * width) + (height * width));
         *
         * - Фигуранын коломун эсептеген формула: (length*width*height);
         *
         * -Формулалар Parallelepiped классында жазылуусу керек
         *
         *
         *   Цилиндр:
         *
         * - Фигуранын аянтын эсептеген формула:  2*PI * radius*( height + radius);
         *
         * - Фигуранын коломун эсептеген формула: (PI*radius*radius*height);
         *
         * -Формулалар Cylinder классында жазылуусу керек
         *
         *
         *
         *
         * Бардык Exception дор логикасы main класста жазылcын
         * Бардык маалмыттар консоль аркылуу берилсин
         * Программа кайсыл фигуранын аянтын жана коломун эсептегибиз келгенин сурап, тандаган фигураны эсептеп бериши керек.
         */


        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("""
                    Select one of these
                      1.Parallelepiped
                      2.Cylinder""");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    try {
                        System.out.println("Write A Length of parallelepiped.");
                        int lengthAreOfParallelepiped = scanner.nextInt();
                        if (lengthAreOfParallelepiped < 0) {
                            throw new Exception(" It mustn't be negative number. ");
                        }
                        System.out.println("Write A Width of parallelepiped.");
                        int widthAreOfParallelepiped = scanner.nextInt();
                        if (widthAreOfParallelepiped < 0) {
                            throw new Exception(" It mustn't be negative number. ");
                        }
                        System.out.println("Write A Height of parallelepiped.");
                        int heightAreOfParallelepiped = scanner.nextInt();
                        if (heightAreOfParallelepiped < 0) {
                            throw new Exception(" It mustn't be negative number. ");
                        }
                        Parallelepiped.areOfParallelepiped(lengthAreOfParallelepiped, widthAreOfParallelepiped, heightAreOfParallelepiped);
                        Parallelepiped.perimeterOfParallelepiped(lengthAreOfParallelepiped, widthAreOfParallelepiped, heightAreOfParallelepiped);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2 -> {
                    try {
                        System.out.println("Write A height of cylinder.");
                        int aHeightOfCylinder = scanner.nextInt();
                        if (aHeightOfCylinder < 0) {
                            throw new Exception(" It mustn't be negative number. ");
                        }
                        System.out.println("Write A radius of cylinder.");
                        int aRadiusOfCylinder = scanner.nextInt();
                        if (aRadiusOfCylinder < 0) {
                            throw new Exception(" It mustn't be negative number. ");
                        }

                        Cylinder.areOfCylinder(aRadiusOfCylinder, aHeightOfCylinder);
                        Cylinder.perimeterOfCylinder(aRadiusOfCylinder, aHeightOfCylinder);

                    } catch (Exception e) {
                        System.out.println(" Mistake: " + e.getMessage());

                    }
                }
            }
        }
    }
}