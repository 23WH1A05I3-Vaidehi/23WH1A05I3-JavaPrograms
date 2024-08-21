package Java_Programs;

public class Palindrome {
	int n=98189;
	public static void main(String[] args) {
		
		        
		        
		        Palindrome obj = new Palindrome();
		        int sum=0,r,temp;
		        temp=obj.n;
		        while(obj.n>0){
		            r=obj.n%10;
		            sum=sum*10+r;
		            obj.n=obj.n/10;
		        }
		        if(temp==sum){
		            System.out.println("palindrome");
		        }
		        else{
		            System.out.println("Not palindrome");
		        }
		    }
		

	}


