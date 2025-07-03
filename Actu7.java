import java.text.DecimalFormat;

public class Actu7{
	public static void main (String [] args){
		DecimalFormat myformat = new DecimalFormat("0.000");
		
		double value = 9.8;
		
		System.out.println(myformat.format(value));
		
	}
}