import java.util.Scanner;

public class Solution {

	public static void sol(String str) {
	int n = str.length();
		String ans="";
		
		//protocol
		int next = 0;
		String pcheck = str.substring(0,4);
		if(pcheck.contains("http"))
		{
			ans=ans+"http://";
			next+=4;
		}
		else
		{
			ans=ans+"ftp://";
			next+=3;
		}
		
		//finding r
		int end = 0;
		for(int i = 0;i<n;i++)
		{
			if(str.charAt(i)=='r')
			{
				end+=i;
				break;
			}
		}
		//System.out.println(end);
		//adding it to the string
		for(int i = next;i<end;i++)
		{
			ans+=str.charAt(i);
		}
		next=end+2;
		end=n;
		//adding .ru
		ans+=".ru/";
		
		//adding final string
		
		for(int i = next;i<end;i++)
		{
			ans+=str.charAt(i);
		}

		System.out.println(ans);

	}
}
