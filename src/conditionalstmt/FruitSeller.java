package conditionalstmt;
import java.util.Scanner;

public class FruitSeller {
	public static void main(String[] args) {
		System.out.println("Enter the price of Dozen Mangoes:");
	
		System.out.println("Enter the cost price:");
		System.out.println("Enter the Selling price:");
		Scanner sc=new Scanner(System.in);
		float a,b,c;
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		if(b-c>0)
		{
			System.out.println("loss Rs: "+(b+c));
		}
		else if(b-c<0)
		{
			System.out.println("Profit Rs: "+(c-b));
		}
		else 
		{
			System.out.println("No profit No loss");
		}
	}
}