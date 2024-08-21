package Java_Programs;


public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int n=33,c=0;
		    
	        for(int i=1;i<=n;i++){
	            if(n%i==0){
	                c++;
	            }
	        }
	        if(c==2){
	            System.out.println("prime");
	        }
	        else{
	        System.out.println("not prime");
	        }
	    }
	

	}


