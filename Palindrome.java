import java.util.*;
class Palindrome {
	public static void main(String[] args) {
		// Implement your code here 
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int orig=input;
	    int rev=0;
		while(input>0)
		{
		    int rem=input%10;
		    rev=(rev*10)+rem;
		    input/=10;
		}
		if(rev==orig){
		    System.out.println(orig+"is a palindrome");
		}else{
		    System.out.println(orig+"is not a palindrome");
		}
	}
}

