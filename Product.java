package JavaPrograms;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();

        String highestValueProduct = "";
        double highestValue = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter product name: ");
            String name = sc.next();
            System.out.println("Enter quantity: ");
            int quantity = sc.nextInt();
            System.out.println("Enter cost: ");
            double cost = sc.nextDouble();

            double value = quantity * cost;

            if (value > highestValue) {
                highestValue = value;
                highestValueProduct = name;
            }
        }

        System.out.println("Product with the highest value: " + highestValueProduct);
        sc.close();
    }
    
}
