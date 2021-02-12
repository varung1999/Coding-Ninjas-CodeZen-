import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		// Write your code here
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
		
		int i =0;
		while(i<n)
		{	
			int j = 1;
			char val = 'A';
			while(j<=i+1)
			{
				char jthchar = (char)(val + i);
				System.out.print(jthchar);
				j=j+1;
			}
			i=i+1;
			System.out.println();
		}
	}
}
