package gitHomeWork;
import java.util.Scanner;

public class GroupHwPart1No7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner input=new Scanner(System.in);
	System.out.println("please enter the number to be checked");
	int numIn=input.nextInt();
	
		int i;
		int flag=0;     	  		  
		 		 
		 if(numIn==0||numIn==1){  
		   System.out.println(numIn+" is not prime number");      
		  
		  }else{  
		   for(i=2;i<numIn;i++){      
		    if(numIn%i==0){      
		     System.out.println(numIn+" is not a prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(numIn+" is a prime number"); }  
		  }

	}

}
