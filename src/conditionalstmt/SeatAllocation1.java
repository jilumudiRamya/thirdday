package conditionalstmt;
import java.util.Scanner;
public class SeatAllocation1 {
	
	
		public static void main(String[] args) {
			int r,c,n;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the No. of Rows: ");
			r=sc.nextInt();
			System.out.println("Enter the No. of Colums: ");
			c=sc.nextInt();
			System.out.println("Enter the Roll No. of Students: ");
			n=sc.nextInt();
			if((n<c)||(n%c==1)||(n%c==0)) {
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}

	}


