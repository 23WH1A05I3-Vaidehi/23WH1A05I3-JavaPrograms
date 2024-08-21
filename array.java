package Java_Programs;

public class array{

	 public static void main(String[] args) {
	  int max,min;
	  int arr[] = new int[]{34,79,16,43};
	  max=min=arr[0];
	  for (int i = 1; i < arr.length; i++) {
	   if (arr[i] > max){
	    max = arr[i];
	   }
	   if (arr[i] < min)
	    min = arr[i];
	  }

	  System.out.println("Maximum element : " + max);
	  System.out.println("Minimum element : " + min);
	 }
	}