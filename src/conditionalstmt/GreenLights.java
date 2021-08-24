package conditionalstmt;
import java.util.Scanner;


public class GreenLights {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			Float s = sc.nextFloat();
			Float d = sc.nextFloat();
			Float t = sc.nextFloat();
			if((s<t)||(s>t)&&(d>1))
			System.out.println("No");
			else
				System.out.println("yes");
}
}