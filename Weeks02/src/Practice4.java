import javax.swing.*;
import java.text.*;


public class Practice4 {
static final double TAX_RATE = 0.625;
	public static void main(String[] args) {
		String CdId = JOptionPane.showInputDialog("This program calculates the total cost of a CD order Please enter ID of the CD");
		String CdTitle = JOptionPane.showInputDialog("Please enter title of the CD");
		String price = JOptionPane.showInputDialog("Please enter the price of the CD in U.S. doolars");
		double Price = Double.parseDouble(price);
		String quantity = JOptionPane.showInputDialog("Please enter quantity to be purchased");
		int Quantity = Integer.parseInt(quantity);
		
		double cdSubtotal = Price*Quantity;
		double cdTotal = cdSubtotal*(1+TAX_RATE);
		double Taxrate = TAX_RATE*100;
		
		JOptionPane.showMessageDialog(null, "Summary of transaction:"
				+"\n\nCD ID: "+CdId+"\nCD Title: "+CdTitle+"\nCD Unit Price: $"+Price+"\nCD Quantity: "+
Quantity+"\n\nSubtotal: $"+cdSubtotal+"\nTax rate: "+Taxrate+"%"+"\nTotal: $"+cdTotal+"\n\nEnd of Program");
	}

}
