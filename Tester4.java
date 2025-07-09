import java.util.*;
class Tester4 {
	public static void main(String[] args) {
		// Implement your code here 
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		String output;
		if(input%3==0 && input%5==0){
		    output="Zoom";
		}else if(input%3==0){
		    output="Zip";
		}else if(input%5==0){
		    output="Zap";
		}else{
		    output="Invalid";
		}
		System.out.println(output);
	}
}

