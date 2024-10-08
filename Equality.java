package javaPrograms2;

import java.util.Scanner;

public class Equality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter four integers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        if (num1 == num2 && num2 == num3 && num3 == num4) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}

