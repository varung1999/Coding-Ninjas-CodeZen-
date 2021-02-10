public class Solution {

	
	public static void answer(String s1,String s2,String s3)
    {
	int n1= s1.length(); 
		int n2 = s2.length();
		int n3=s3.length();
		//System.out.println("n1:"+n1+" "+"n2:"+n2+" "+"n3:"+n3);
		int c1 = 0;
		int c2 = 0;

		//comparing str1 and str3
		for(int i = 0;i<n1;i++)
		{
			for(int j = 0;j<n3;j++)
			{
				if(s1.charAt(i)==s3.charAt(j))
				{
					c1++;
					break;
				}
				
			}

		}

		//comparing str2 and str3
		for(int i = 0;i<n2;i++)
		{
			for(int j = 0;j<n3;j++)
			{
				if(s2.charAt(i)==s3.charAt(j))
				{
					c2++;
					break;
				}
			}

		}
		if(n3 == c1+c2)
		{
			System.out.println("YES");
		}
		else
			System.out.println("NO");
		//System.out.println(c1+" "+c2);
	}
}
