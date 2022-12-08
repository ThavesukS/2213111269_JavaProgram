import java.util.*;

public final class Lab504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter yourname, separated by a space.\n:");
		String fullName = scan.nextLine();
		int indexofName = fullName.indexOf(" ");
		String firstName = fullName.substring(0,indexofName);
		System.out.println(abbreviatName(fullName).toUpperCase()+firstName);
		

	}
	public static String abbreviatName(String fullname) {
		int indexofName = fullname.indexOf(" ");
		int space=0;
		String FirstCharacter = "";
		for(int i=space;i<fullname.length();i++) {
			if(fullname.charAt(i)==' ') {
				FirstCharacter +=fullname.charAt(i+1);
				FirstCharacter+=".";
			}
			
		}
		return FirstCharacter;
	}

}
