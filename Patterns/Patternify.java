import java.util.Scanner;
public class Solution {

	public static void print(int n) {
       
		Scanner sc= new Scanner(System.in);
		
		int i = 1;
		while(i<=n)
		{
			int j =1;
			while(j<=n-i+1)
			{
				System.out.print('*');
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}

	}
}
