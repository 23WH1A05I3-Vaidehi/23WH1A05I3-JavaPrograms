package Java_Programs;

public class def_cons {
    int a=2,b=4;
    int x;
	public def_cons() {
		// TODO Auto-generated constructor stub
		x=a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       def_cons obj = new def_cons();
       System.out.println(obj.x);
	}

}
