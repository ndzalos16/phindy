import java.text.DecimalFormat;
public class Actu9{
	public static void main(String [] args){
		DecimalFormat myformat = new DecimalFormat("'0'000000000");
		
		int Number = 831234567;
		
		System.out.println(myformat.format(Number));
	}
}