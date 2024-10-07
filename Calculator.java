package JavaPrograms;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter operation (+, -, *, /): ");
        String operation = sc.next();

         switch (operation) {
            case "+":
                System.out.println("Result: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Result: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Result: " + (num1 * num2));
                break;
            case "/":
                System.out.println("Result: " + num1 / num2) ;
                break;
            default:
                System.out.println("Error: Invalid operation");
                break;
     
    }
         sc.close();
}
}