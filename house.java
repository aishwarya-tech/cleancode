package construction;
import java.util.Scanner;
import java.io.FileDescriptor;
import java.io.PrintStream;
import java.io.FileOutputStream;

public class house {

	public static void main(String[] args) {
		double area,cost,auto;
		int ch;
		char a;
		Scanner sc = new Scanner(System.in);
		
		PrintStream myOutput = new PrintStream(new FileOutputStream(FileDescriptor.out));
		myOutput.print("\n HOUSE CONSTRUCTION COST CALCULATION...");
		
		myOutput.print("\n Enter the total square feet of house: ");
		area = sc.nextDouble();
		
		myOutput.print("\n Enter the type of materials to be used: \n 1.Standard \n 2.Above Standard \n 3.high Standard: \n ");
		ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			cost = area * 1200;
			myOutput.print("\n The total cost will be Rs " + cost);
			break;
			
		case 2:
			cost = area * 1500;
			myOutput.print("\n The total cost will be Rs " + cost);
			break;
			
		case 3:
			cost = area * 1800;
			myOutput.print("\n The total cost will be Rs " + cost);
			break;
		}
		myOutput.print("\n\n Do you want automated house (Y/N): ");
		a = sc.next().charAt(0);
		if(a=='Y' || a=='y')
		{
			auto = area * 2500;
			myOutput.print("\n The total cost will be Rs " + auto);
			
		}
		myOutput.close();
		sc.close();
	}

}
