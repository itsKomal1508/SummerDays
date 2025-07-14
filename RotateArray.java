class RotateArray{
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5,6,7};
		int d=3,n=arr.length;
		int right=n-d,left=n-1;
	
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		while(right<left)
		{
			int temp=arr[right];
			arr[right]=arr[left];
			arr[left]=temp;
			right++;
			left--;
		}
		right=0;
		left=n-d-1;
		while(right<left)
		{
			int temp=arr[right];
			arr[right]=arr[left];
			arr[left]=temp;
			right++;
			left--;
		}
		right=0;
		left=n-1;
		while(right<left)
		{
			int temp=arr[right];
			arr[right]=arr[left];
			arr[left]=temp;
			right++;
			left--;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
}