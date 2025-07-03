import java.text.DecimalFormat;
public class Actu8{
	public static void main(String [] args){
		DecimalFormat myformat = new DecimalFormat("#,###.##");
		double value = 4500;
		System.out.println(myformat.format(value));
	}
}