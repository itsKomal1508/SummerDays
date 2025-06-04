import java.util.ArrayList;
import java.util.Collections;
class ArrayList2{
	public static void main(String args[])
	{
		//Add Element 0(1)
		//Delete Element 0(1)
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(1,9);
		System.out.println(list);
		
		//Get element
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i)+" ");
		}
		System.out.println("Reverse.....");
		for(int i=list.size()-1;i>=0;i--){
			System.out.println(list.get(i)+" ");
		}
		System.out.println("Max Number.....");
		int max=Integer.MIN_VALUE;
		for(int i=0;i<list.size();i++){
		if(max<list.get(i)){
			max=list.get(i);
		}
		}
		System.out.println(max);
		System.out.println(list.contains(12));
		
		//Swappinng
		int idx1=1,idx2=3;
		swap(list,idx1,idx2);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);	
	}
	public static void swap(ArrayList<Integer> list,int idx1,int idx2){
		int temp=list.get(idx1);
		list.set(idx1,list.get(idx2));
		list.set(idx2,temp);
		System.out.println(list);
	}
}