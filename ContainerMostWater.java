class ContainerMostWater{
	//brute force approach
	public static boolean check(int[] arr,int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println(i+","+j);
				}
			}
		}
		return false;
	}
	//Optimize approach 
	public static void check2(int arr[],int target)
	{
		int left=0;
		int right=arr.length-1;
		while(left<right)
		{
			int sum=arr[left]+arr[right];
			if(sum==target)
			{
				System.out.println(left+","+right);
				return;
			}
			if(sum>target)
			{
				right--;
			}else{
				left++;
			}
		}
	}
	public static void main(String args[])
	{
		int target=6;
		int arr[]={1,2,3,4,5};
		ContainerMostWater obj=new ContainerMostWater();
		obj.check2(arr,target);
	}
}