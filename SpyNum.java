package javaPrograms2;

import java.util.Scanner;

public class SpyNum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        System.out.print("Enter a non-negative number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int product = 1;
        int temp = number;

        
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        // Check if sum equals product
        if (sum == product) {
            System.out.println("true");  
        } else {
            System.out.println("false"); 
        }
    }
}

