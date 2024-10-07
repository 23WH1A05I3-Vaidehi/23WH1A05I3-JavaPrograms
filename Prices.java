package JavaPrograms;

class Price{
	  int p = 35000;
	}

	class Discount extends Price {
	   int d = 1200;
	}


	public class Prices {
	    public static void main(String[] args) {
	        Discount d1 = new Discount();
	        System.out.println("Price "+ d1.p+ " Discount "+ d1.d);

	    }
	}
