import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 10,30,40,20 ,60 ,5 };
		Arrays.sort(arr);
		
		int key =30 ; // number to be searched
		int index = Arrays.binarySearch(arr, key);
		if (index >= 0)
		{
			System.out.println( "Number " + key + " is found at index " + index );
			
		}
		else 
			System.out.println("Number " + key +" not found" );
		
		
		
		

	}

}
