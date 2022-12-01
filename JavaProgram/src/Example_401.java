import java.util.*;


public class Example_401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String inputWord="";
		String textWord ="";
		while(true) {
			System.out.print("Emter word : ");
			inputWord = scan.next();
			if(inputWord.equalsIgnoreCase("stop"));{
			break;
			}
		
		}
		System.out.println(textWord.toUpperCase());
	}

}
