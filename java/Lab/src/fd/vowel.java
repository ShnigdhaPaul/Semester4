
package fd;
import java.util.Scanner;
public class vowel {

	public vowel() {
		
	}

	public static void main(String[] args) {
		String sentence;
		int i;
		int count=0;
		System.out.println("Enter the sentence");
		Scanner input =new Scanner(System.in);
		sentence=input.nextLine();
		for(i=0;i<sentence.length();i++);
		
		
		{
			char ch=sentence.charAt(i);
		
		if (ch=='a' || ch== 'e' || ch=='i' || ch=='o' || ch=='u' )
		{
			
			count++;
		}
		
		}
		     System.out.println("The number of vowels are:" +count);
		}
}


