package gitHomeWork;

public class GroupHwPart1No10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a java program to find the second largest number in the array?
		 */
		
		int arr[] = { 17, 32, 20, 71, 89, 92 };
				
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println("The second largest number is: " + arr[arr.length - 2]);
		}

	}

}
