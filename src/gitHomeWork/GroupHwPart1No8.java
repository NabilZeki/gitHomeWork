package gitHomeWork;
import java.util.Scanner;

public class GroupHwPart1No8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fibSize;
		  Scanner input = new Scanner(System.in); 

		  System.out.print("Please enter length: ");
		  fibSize = input.nextInt();

		  int[] n = new int[fibSize];
		  //initializing the first two element to 0 and 1
		  n[0] = 0;		  
		  n[1] = 1;
		  
		  //subsequent number would be equal to the sum of the last 2 numbers of the series.
		  for (int i = 2; i < fibSize; i++) {
		   n[i] = n[i - 1] + n[i - 2];
		  }

		  System.out.println("The Fibonacci Series up to "+fibSize+" numbers is :" );
		  for (int i = 0; i <fibSize; i++) {
		   System.out.print(n[i] + " ");
		  }

	}

}
