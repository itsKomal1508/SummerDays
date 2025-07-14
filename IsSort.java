class IsSort{
	public static boolean isSort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
			}else{
				return false;
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		IsSort obj=new IsSort();
		int arr[]={1,2,3,4,0};
		System.out.println(obj.isSort(arr));
	}
}