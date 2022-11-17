
import java.util.*;

public class Practice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,sum,count=0;
		System.out.println("Input two integers(a b) :");
		System.out.print("");
		a = scan.nextInt();
		System.out.print("");
		b = scan.nextInt();
		
	    sum = a+b;
		System.out.println("Sum of two integers : "+sum);
		 while(sum!=0) {
			 sum/=10;
			 count++;
		 }
		 System.out.println("Digit number of sum of said two integers: "+count);
		}

	}

