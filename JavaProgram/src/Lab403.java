import java.util.*;

public class Lab403 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=0;
	    System.out.print("Message : ");
	    String message = scan.nextLine();
	    String check = message.toLowerCase();
	    if(check.indexOf("nichi")>=0) {
	    	a++;
	   }
	    if(a==0) {
    		System.out.println(message);
    		
    	}else {
    		System.out.println("Nichi is a sentence");
    	}

	    

	}

}
