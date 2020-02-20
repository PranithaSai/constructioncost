package pranitha;
import java.util.*;
public class Main {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	   double area=sc.nextDouble();
	   double material_standard=sc.nextDouble();
	   Construction c=new Construction(area,material_standard);
	   c.const_cost();
	   sc.close();
	}

}
