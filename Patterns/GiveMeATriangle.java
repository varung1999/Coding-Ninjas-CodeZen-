import java.util.Scanner;
public class solution {

	public static void print(int n) {
		
		Scanner sc= new Scanner(System.in);
		
		int i = 1;
		while(i<=n)
		{
			
			int spaces = 0;
			while(spaces<i-1)
			{
				System.out.print(" ");
				spaces=spaces+1;
			}
			int stars = 1;
			while(stars<=n-i+1)
			{
				System.out.print("*");
				stars=stars+1;
			}
			i=i+1;
			System.out.println();
		}

	}
}
