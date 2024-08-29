package Java_Programs;




class Animal {
     public void move() {
    	 
		 System.out.println("This Animal moves slowly");
    	   }
     class Cheetah extends Animal{
    	 public void move() {
    		 
    		 System.out.println("Cheetah runs fast");
    	
        	}
     }


	public static void main(String[] args) {
		Animal a1 = new Animal();
		Cheetah c1 = a1.new Cheetah();
		c1.move();

	}

}
