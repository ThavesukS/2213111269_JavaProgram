import java.text.*;
import java.util.*;

public class Lab3010{
    static final double COMMISSION_RATE = 0.15;
    static final int SENTINEL = -1;

    public static void main(String[] args) {
        DecimalFormat frm = new DecimalFormat("#,##0.00");
        Scanner scan = new Scanner(System.in);
        int Sales;
        double salary = 0;
        do {
        System.out.print("Enter sales in dollors (or -1 to end): ");
        Sales = scan.nextInt();
        if (Sales!=-1) {
        salary = 1000 + Sales*COMMISSION_RATE;
        System.out.println("Salary is: $" + frm.format(salary));
        }
        else System.out.println("bye");
        }while(Sales!=-1);
    }

}
