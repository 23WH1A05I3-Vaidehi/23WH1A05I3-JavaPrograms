package JavaPrograms;

public class M_overload {
    public int Multiply(int x,int y){
        return ( x*y);
    }
    public int Multiply(int x,int y, int z){
        return( x* y *z);
    }
    public double Multiply(int x,double y){
        return ( x * y);
    }
    public static void main(String[] args) {
        M_overload  m= new M_overload();
        System.out.println(m.Multiply(5,10));
        System.out.println(m.Multiply(2,4,6));
        System.out.println(m.Multiply(2,1.5));
    }
}
