import java.util.Scanner;
public class solution {

	public static void print(int n) {
       //Write your code here
  int i = 1;
		while(i<=n)
		{
			int j = 1;
			if(i%2==0)
			{
				while(j<=n-i+1)
				{
					System.out.print('0');
					j+=1;
				}
			}
			else {
			
			while(j<=n-i+1)
			{
				System.out.print('1');
				j+=1;
			}
			}
			i+=1;
			System.out.println();
		}
		
	}
}
