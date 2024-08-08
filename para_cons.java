package Java_Programs;

public class para_cons {
    int x;
	public para_cons(int a,int b) {
		// TODO Auto-generated constructor stub
		x = a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       para_cons obj = new para_cons(10,2);
       System.out.println(obj.x);
	}

}
