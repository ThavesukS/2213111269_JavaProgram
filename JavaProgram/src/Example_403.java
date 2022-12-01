import java.util.*;
import javax.swing.*;


public class Example_403 {

	public static void main(String[] args) {
	   /* Scanner scan = new Scanner(System.in);
	    System.out.print("Input a sentence : ");
	    String sentence =  scan.nextLine();
	    while(!sentence.endsWith(".")) {
	    	 System.out.print("Input a sentence, again : ");
	 	     sentence =  scan.nextLine();
	    }
	    System.out.println();
	    int space =0;
	    for(int i=0;i<sentence.length();i++) {
	    	if(sentence.charAt(i)==' ') {
	    		space++;
	    	}
	    }
	    System.out.println("This sentence has "+space+" spacebar.");
	    System.out.println("This sentence has "+space+1+" word.");*/
	   
		String sentence = JOptionPane.showInputDialog("Input a sentence : ");
		while(!sentence.endsWith(".")) {
			JOptionPane.showInputDialog("Input a sentence, again : ");
	    }
	    System.out.println();
	    int space =0;
	    for(int i=0;i<sentence.length();i++) {
	    	if(sentence.charAt(i)==' ') {
	    		space++;
	    	}
	    }
	    JOptionPane.showMessageDialog(null, "This sentence has "+space+" spacebar."+"\nThis sentence has "+( space+1)+" word.");
	}

}
