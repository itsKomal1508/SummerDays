import java.util.*;
class ReverseStringUsingStack{
	public static String reverseString(String str)
	{
		Stack<Character> s=new Stack<>();
		int idx=0;
		while(idx<str.length())
		{
			s.push(str.charAt(idx));
			idx++;
		}
		
		StringBuilder sb=new StringBuilder("");
		while(!s.isEmpty())
		{
			char c=s.pop();
			sb.append(c);
		}
		return sb.toString();
	}
	public static void main(String args[])
	{
		System.out.println(reverseString("Hello World!"));
	}

}