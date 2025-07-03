import java.text.DecimalFormat;
public class Actuo{
	public static void main(String [] args){
		DecimalFormat myformat = new DecimalFormat("0.00%");
	
	double value = 0.00072;
	 System.out.println(myformat.format(value));
	}
}
	
