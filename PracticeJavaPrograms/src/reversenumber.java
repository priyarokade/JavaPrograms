
public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 12345;
		int temp1 ;
		int temp =0;
		int i =0;
		while (i < 5)
		{
		temp1 = num % 10 ;
		temp = (temp*10) + temp1 ;
		System.out.println("temp "+ temp );
		num =num / 10 ;
		System.out.println("num "+ num );
		i++ ;
		}
		
	}

}
