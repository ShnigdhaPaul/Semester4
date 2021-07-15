/**
 * 
 */
package fd;
import java.util.Scanner;


/**
 * @author Asus
 *
 */
public class Gcd {


	

	
	public static void main(String[] args) {
		int num1;
		int n1;
		int num2;
		int n2;
		int rem;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		num1=input.nextInt();
		
		System.out.println("Enter the 2nd number:");
		num2=input.nextInt();
		n1=num1;
		n2=num2;
		while(n2!=0) {
		rem=n1%n2;
		n1=n2;
		n2=rem;}
		
		System.out.println("GCD of the given numbers is:" +n1);
		
		int Lcm=(num1*num2/n1);
		System.out.println("LCM of the given numbers is:" +Lcm);
		
		
		
}}
	