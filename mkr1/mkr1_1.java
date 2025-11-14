package mkr1;
import java.util.Scanner;

interface Shape {
    double getArea();
}

class Parallelogram implements Shape {
    private double a;
    private double h;

    public Parallelogram(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double getArea() {
        return a * h;
    }
}

class Trapezium implements Shape {
    private double c;
    private double d;
    private double h;

    public Trapezium(double c, double d, double h) {
        this.c = c;
        this.d = d;
        this.h = h;
    }

    @Override
    public double getArea() {
        return (c + d) * h / 2.0;
    }
}

public class mkr1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть дані для паралелограма:");
        System.out.print("Основа A: ");
        double pBase = scanner.nextDouble();
        System.out.print("Висота H: ");
        double pHeight = scanner.nextDouble();

        System.out.println("\nВведіть дані для трапеції:");
        System.out.print("Перша основа C: ");
        double tBase1 = scanner.nextDouble();
        System.out.print("Друга основа D: ");
        double tBase2 = scanner.nextDouble();
        System.out.print("Висота H: ");
        double tHeight = scanner.nextDouble();

        Shape[] shapes = new Shape[2];
        shapes[0] = new Parallelogram(pBase, pHeight);
        shapes[1] = new Trapezium(tBase1, tBase2, tHeight);

        System.out.println("\n--- Результати обчислень ---");

        System.out.printf("Площа паралелограма: %.2f\n", shapes[0].getArea());
        System.out.printf("Площа трапеції: %.2f\n", shapes[1].getArea());
        
        scanner.close();
    }
}
