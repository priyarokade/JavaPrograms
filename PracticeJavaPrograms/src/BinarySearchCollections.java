import java.util.ArrayList;
import java.util.Collections;
public class BinarySearchCollections {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList <Integer> al= new ArrayList <Integer>() ;
			al.add(19);
			al.add(20);
			al.add(30);
			al.add(10);
			al.add(5);
			int key =10 ;
			int index = Collections.binarySearch(al, key);
			if ( index >= 0)
					System.out.println(key + " is found at  index " + index );
			else 
					System.out.println(key + "is not found ");
	} 

}


		
