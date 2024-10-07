package JavaPrograms;

public class Cons_def{
    int x ;
    char ch;
    public Cons_def(){
        x =2;
        ch = 'a';
        String S ="Vaidehi";
        System.out.println(S);
    }
    
    public static void main(String[] args){
        Cons_def ob= new Cons_def();
        System.out.println(ob.x);
        System.out.println(ob.ch);
        
    }
}