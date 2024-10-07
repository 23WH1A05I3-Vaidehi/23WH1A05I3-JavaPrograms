package javaPrograms2;

public class C_overload{
    int x = 5;
    C_overload(){
       x=x+5;
       System.out.println(x);
    }
    C_overload(int y ){
        x=x+y;
        System.out.println(x);
    }
    C_overload(double y, int z){
        double r;
        r=x+y+z;
        System.out.println(r);
    }
     public static void main(String[] args){
             C_overload o = new C_overload();
             C_overload p = new C_overload(4);
             C_overload q = new C_overload(4.2,5);
       }
 }