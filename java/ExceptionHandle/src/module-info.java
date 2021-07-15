import java.util.*;

public class ExceptionHandle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter num1:");
		int num1 = sc.nextInt();
		System.out.println("Please enter num2:");
		int num2 = sc.nextInt();
		try {
		int data = num1/num2; 
		}  
		 catch(ArithmeticException e) {
			    System.out.println(e);
			   System.out.println("You must enter an integer. Please try again"); 
		} catch(InputMismatchException e) {
				System.out.println(e);
				System.out.println("You must enter an integer. Please try again");
				
		}   
		
	}
}