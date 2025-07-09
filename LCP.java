import java.util.*;
class LongestCommanPrefix{
	public static String check(String[] str)
	{
		String icp="";
		for(int i=0;i<str[0].length();i++)
		{
			for(int j=i;j<str.length;j++)
			{
				if(str[0].charAt(i)!=str[j].charAt(i))
				{
					return icp;
				}
			}
			icp+=str[0].charAt(i);
		}
		return icp;
	}
	public static void main(String args[])
	{
		String[] str={"fliower","fliow","flight"};
		System.out.println(check(str));
	}
}