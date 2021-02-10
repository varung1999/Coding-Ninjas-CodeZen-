public class Solution {

	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
int n = s.length();
		String ans="";
		ans+=s.charAt(0);
		for(int i =1;i<n;i++)
		{
			if(s.charAt(i)==ans.charAt(ans.length()-1))
			{
				continue;
			}
			else
			{
				ans+=s.charAt(i);
			}
		}
		
return ans;
	}
	}
