import java.util.*;

public class Lab401 {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Full name : ");
    String fullName = scan.nextLine();
    if(!fullName.contains(" ")) {
    	System.out.println("Incorrect Name");
    }
    else {
    int indexofWord = fullName.indexOf(" ");
    String firstName = fullName.substring(0,indexofWord).toUpperCase();
    String lastName = fullName.substring(indexofWord,fullName.length()).toLowerCase();
    System.out.println("Frist Name: "+firstName);
    System.out.println("Last Name: "+lastName);
	}
	}

}
