import java.util.Random;
import javax.swing.*;
import java.text.*;

public class Lab303 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		int money = Integer.parseInt(JOptionPane.showInputDialog("Your balance:"+frm.format(balance)+"\ninput money to withdraw:"));
		if(money<=20000&&money>=100) {
			JOptionPane.showMessageDialog(null, "You withdraw "+frm.format(money)+" baht."+"\n1,000 = "+money/1000+"\n500 = "+
		money/500+"\n100 = "+money/100);
		}
		else if(money>balance) {
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(money>20000) {
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw more than 20,000","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(money<100) {
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw "+money+" baht.","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		

	}

}
