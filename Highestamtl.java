import java.util.Scanner;
import java.text.DecimalFormat;

public class Highestamtl{
	public static void main (String [] args){
		Scanner keyboard = new Scanner (System.in);
		DecimalFormat myformaat = new DecimalFormat ("R0.00");
		
		double investAmt,amtCompound, amtCompoundQua, amtSimp, greaterAmt1, greaterAmt2, amtCompoundYr;
		int numOfYears;
		
		System.out.println("please enter the amount to invest:");
		investAmt = keyboard.nextDouble();
		System.out.println("how many years do you wish to invest for:");
		numOfYears = keyboard.nextInt();
	
		amtCompoundYr = investAmt * Math.pow((1 + 0.0705), numOfYears);
		amtCompoundQua = investAmt * Math.pow((1 + 0.0705 / 4), numOfYears * 4);
		amtSimp = investAmt * (1 +  0.0705 * numOfYears);
		
		System.out.println("Investemnt results @ 7.05% Interest:" + "\n" + "-----------------------------------------------");
		System.out.println("Option" + "\t" + "\t" + "\t"+ "\t"+"|Future Value" + "\n" +"-----------------------------------------------");
		System.out.println("Simple Interest" + "\t" + "\t" + "\t" + "|" + myformaat.format(amtSimp));
		System.out.println("Compound Interest (yearly)" + "\t" + "|" + myformaat.format(amtCompoundYr));
		System.out.println("Compound Interest (Quarterly)" + "\t" + "|" + myformaat.format(amtCompoundQua)+ "\n" + "-----------------------------------------------");
		greaterAmt1 = Math.max(amtSimp, amtCompoundYr);
		greaterAmt2 = Math.max(greaterAmt1, amtCompoundQua);
		System.out.println("");
		System.out.println(">>>The best performing option yields: " +  myformaat.format(greaterAmt2) + "<<<");
	}
}
		
		
		
		