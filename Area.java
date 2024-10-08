package javaPrograms2;

import java.util.Scanner;

public class Area {
    double radius, length, width;

    void carea() {
        System.out.printf("Area of circle with radius %.2f is: %.2f%n", radius, Math.PI * radius * radius);
    }

    void rarea() {
        System.out.printf("Area of rectangle with length %.2f and width %.2f is: %.2f%n", length, width, length * width);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area area = new Area();

        System.out.println("Enter radius, length, and width: ");
        area.radius = sc.nextDouble();
        area.length = sc.nextDouble();
        area.width = sc.nextDouble();

        area.carea();
        area.rarea();
        sc.close();
    }
}
