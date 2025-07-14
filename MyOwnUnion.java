import java.util.*;
class MyOwnUnion{
	public static int[] union(int[] arr1,int[] arr2)
	{
		int idx=-1;
		int i=0,j=0;
		int n1=arr1.length;
		int n2=arr2.length;
		int union[]=new int[n1+n2];
		
		while(i<n1 && j<n2)
		{
			if(arr1[i]<arr2[j])
			{
				if(idx==-1)
				{
					idx++;
					union[idx]=arr1[i];
				}else{
					if(arr1[i]!=union[idx])
					{
						idx++;
						union[idx]=arr1[i];
					}
				}
				i++;
			}else{
				if(idx==-1)
				{
					idx++;
					union[idx]=arr2[j];
				}else{
					if(arr2[j]!=union[idx])
					{
						idx++;
						union[idx]=arr2[j];
					}
				}
				j++;
			}
		}
		while(i<n1)
		{
			if(arr1[i]!=union[idx])
			{
				idx++;
				union[idx]=arr1[i];
			}
			i++;
		}
		while(j<n2)
		{
			if(arr2[j]!=union[idx])
			{
				idx++;
				union[idx]=arr2[j];
			}
			j++;
		}
		return Arrays.copyOfRange(union,0,idx+1);
	}
	
	public static void main(String args[])
	{
		int[] arr1={1,1,2,3,4,5};
		int[] arr2={2,3,4,4,5,6};
		int[] unionArr=union(arr1,arr2);
		System.out.println("********************************************************");
		for(int i=0;i<unionArr.length;i++)
		{
			System.out.print(" "+unionArr[i]);
		}
	}
}