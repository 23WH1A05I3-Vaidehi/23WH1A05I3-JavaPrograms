package JavaPrograms;

public class Person {
	 
    String name = "Alice";
    int age = 30;


    void getName() {
        System.out.println("Name: " + name);
        this.getAge();
    }

    void getAge() {
       
        System.out.println("Age: " + age);
    }



    public static void main(String[] args) {

        Person p = new Person();
        p.getName();
    }
}