package Java_Programs;





public class Animals {
      public void eat() {
    	  System.out.println("eat");
      }
      public void sleep() {
    	  System.out.println("sleep");
      }
      class lion extends Animals{
    	  public void eat() {
        	  System.out.println("deer");
          }
          public void sleep() {
        	  System.out.println("Lion roars");
          }
      }
       class rabbit extends Animals{
        	  public void eat() {
            	  System.out.println("carrot");
              }
              public void sleep() {
            	  System.out.println("Rabbit sleeps");
              }
       
      }
      public static void main(String[] args) {
    	  Animals a = new Animals();
    	  Animals.lion l = a.new lion();
    	  Animals.rabbit r = a.new rabbit();
    	  l.eat();
    	  r.sleep();
      }
}



