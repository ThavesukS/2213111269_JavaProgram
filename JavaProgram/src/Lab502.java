import javax.swing.*;


public class Lab502 {
static String email;
	public static void main(String[] args) {
		inputEmail();
	}
	
	public static void inputEmail() {
		String answer="";
		do {
		email = JOptionPane.showInputDialog("Input your e-mail");
		checkEmail(email);
		answer = JOptionPane.showInputDialog("Continue[y||Y to continue]");
		}while(answer.equalsIgnoreCase("y"));

	}
	
	public static void checkEmail(String check) {
		while(check.startsWith("@")||check.contains(" "));{
			check = JOptionPane.showInputDialog("Input youe e-mail,again : ");
		}
		check = check.toLowerCase();
		JOptionPane.showMessageDialog(null,
				check(check)? "Your e-mail is "+check:"Your e-mail is not hotmail or gmail");
	}

}
