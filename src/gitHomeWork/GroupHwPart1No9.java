package gitHomeWork;

public class GroupHwPart1No9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int[] anArray= {27,109,74,15,200,9};

// assigning 
int max=anArray[0];
int min=anArray[0];
		
//	iteration and comparing
	for (int i=1; i<anArray.length; i++) {
		if(max<anArray[i]) {
			max=anArray[i];
		}else if (min>anArray[i]) {
			min=anArray[i];			
		}
	}
		System.out.println("The Maximum number is "+max+" and the Minimum number is "+min);
		
	}

}
