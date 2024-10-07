package javaPrograms2;

public class Mul_methods{
    public int remainder(int a,int b){
        return a%b;
    }
    public void myMethod(){
        System.out.println("Hello Method");
    }
 public static void main(String[] args){
	 Mul_methods ob = new Mul_methods();
    System.out.println(ob.remainder(6,3));
    ob.myMethod();
 }
}