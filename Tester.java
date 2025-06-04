import java.util.*;
class Quadractic{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		/*int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int descreminator=(b*b)-4*a*c;
		float root1=(-b + descreminator)/2*a;
		float root2=(-b - descreminator)/2*a;
		if(descreminator==0)
		{
			System.out.println(root1);
		}else if(descreminator<0)
		{
			System.out.println("The equation has no real root");
		}else{
			System.out.println(root1+root2);
		}*/
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a==7)
		{
			System.out.println(a*b);
		}else if(b==7)
		{
			System.out.println(c);
		}else if(c==7)
		{
			System.out.println(-1);
		}else{
			System.out.println(a*b*c);
		}
	}
}
			