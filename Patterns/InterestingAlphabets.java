import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int i = 1;
		while(i<=n)
		{
			int j = 1;
			int p = i;
			
			while(j<=i)
			{	char jthchar = (char)('A'+n-p);
				System.out.print(jthchar);
				j+=1;
				p=p-1;
			}
			
			System.out.println();
			i+=1;
		}
		
	}
}
