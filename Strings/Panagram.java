import java.util.Scanner;

public class Solution {

	public static void ans(int n, String str) {
		String all= "abcdefghijklmnopqrstuvwxyz";
		int alen = all.length();
		int count = 0;
		String iLow =str.toLowerCase();
		int ilow = iLow.length();
		
		for(int i = 0;i<alen;i++)
		{
			for(int j = 0;j<ilow;j++)
			{
				if(all.charAt(i)==iLow.charAt(j))
				{
					count++;
					break;
				}
			}
		}
		if(count==26)
		{
			System.out.println("YES");
		}
		else
			System.out.println("NO");
		
	}
}
