class FirstOccurenceRec{
	int firstRecOccurence(int arr[],int key,int index)
	{
		if(index==arr.length)
		{
			return -1;
		}
		if(key==arr[index])
		{
			return index;
		}
		return firstRecOccurence(arr,key,index+1);
	}

	public static void main(String args[])
	{
		FirstOccurenceRec obj=new FirstOccurenceRec();
		System.out.println(obj.firstRecOccurence(new int[]{1,2,3,4,5,6,7,8},5,0));
	}
}