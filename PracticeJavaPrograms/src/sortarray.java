
public class sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = { 1,3,12,9,0,10 } ;
		int arrlength = arr.length ;
		for (int i=0 ;i<arr.length ;i ++ )
		{
			for (int j=i+1 ;j <arr.length;j++ )
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j] =temp;
				}
			}
		}
		
		System.out.println("Sorted array:");
		for (int i =0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
