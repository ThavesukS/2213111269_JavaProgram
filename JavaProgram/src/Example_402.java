import javax.swing.*;


public class Example_402 {

	public static void main(String[] args) {
		String inputEmail= JOptionPane.showInputDialog("Input your e-mail");
		while(inputEmail.startsWith("@")||inputEmail.contains(" ")) {
	    inputEmail= JOptionPane.showInputDialog("Input your e-mail, again");
		}
		inputEmail = inputEmail.toLowerCase();
		/*if(inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("@hotmail.com")) {
			JOptionPane.showMessageDialog(null, "your e-mail is "+inputEmail);
		}else {
			JOptionPane.showMessageDialog(null, "your e-mail is not hotmail or gmail dot com");
		}*/
		boolean check = inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("@hotmail.com");
		JOptionPane.showMessageDialog(null, (check)? "your e-mail is "+inputEmail :"your e-mail is not hotmail or gmail dot com" );
	}

}
