package Java_Programs;

public class counting {

	    public static void main(String[] args){
	        String s="hello WORLD";
	        int l=s.length();
	        int c=0;
	        for(int i=0;i<l;i++){
	             if(s.charAt(i) != ' ') {
	                c++;
	            }
	        }
	        System.out.println(c);
	    }
	}

