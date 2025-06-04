import java.util.*;
class Recursion3{
	ArrayList<Integer> findSearchIndex(int[] arr,int key,int idx,ArrayList<Integer> list)
	{
		if(idx==arr.length)
		{
			return list;
		}
		if(arr[idx]==key)
		{
			list.add(idx);
		}
		findSearchIndex(arr,key,idx+1,list);
		return list;
	}
	ArrayList<Integer> findSearchIndex2(int[] arr,int key,int idx)
	{
		ArrayList<Integer> list=new ArrayList<>();
		if(idx==arr.length)
		{
			return list;
		}
		if(arr[idx]==key)
		{
			list.add(idx);
		}
		ArrayList<Integer> ansfrombelow=findSearchIndex2(arr,key,idx+1);
		list.addAll(ansfrombelow);
		return list;
	}
	public static void main(String args[])
	{
		Recursion3 obj=new Recursion3();
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		System.out.println(obj.findSearchIndex2(new int[]{2,4,5,5,6},5,0));
	}
}