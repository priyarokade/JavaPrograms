package Enumerations;


enum Name
{
	AASHA , DHEERAJ , VIBHA
}
public class EnumMethods {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name names[] = Name.values();
		
		for(Name name : names)
		{
			System.out.println(name + "at index " + name.ordinal());
		}
		System.out.println(Name.valueOf("AASHA"));
	}

}
