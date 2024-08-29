package Java_Programs;

public class Dog {
	String name;
	String colour;
	public Dog(String n,String c) {
		name =n;
		colour=c;
	}

	public static void main(String[] args) {
		Dog ob = new Dog("Tommy","Brown");
		System.out.println(ob.name);
		System.out.println(ob.colour);
		

	}

}
