package JavaPrograms;

import java.util.*;

public class FirstLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("First letter: " + name.charAt(0));
   
       

        sc.close();
    }
}
