package gitHomeWork;
import java.util.Scanner;

public class GroupHwPart1No4 {	
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
			/*
			 *  Create an array of double values using scanner and 
			 *  calculate the sum of all stored elements in that array
			 */


					Scanner input=new Scanner(System.in);
					System.out.println("Please enter the size (number of elements) of the array");
					int size=input.nextInt();

					double[] dnumArr=new double[size];


					for(int i=0; i<dnumArr.length; i++) {
					System.out.println("Please enter a double type number");
					dnumArr[i]=input.nextDouble();
				}
					double Sum=0;
					for(double n:dnumArr) {
						Sum+=n;

				}

					System.out.print("The sum of all double numbers in the array is: "+Sum+" ");

		
		

	}

}
