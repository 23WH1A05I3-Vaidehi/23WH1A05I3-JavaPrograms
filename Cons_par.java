package JavaPrograms;

public class Cons_par{
    int x ;
    char ch;
    public Cons_par(int y, char c , String str){
        x =y;
        ch = c;
        String S =str;
        System.out.println(S);
    }
    
    public static void main(String[] args){
        Cons_par ob= new Cons_par(2,'a',"Vaidehi");
        System.out.println(ob.x);
        System.out.println(ob.ch);
        
    }
}