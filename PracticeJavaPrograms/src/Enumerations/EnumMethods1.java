package Enumerations;
enum Name3
{
	AASHA , DHEERAJ , VIBHA ;
	
	private Name3()
	{
		this.toString();
	}
	public void getname()
	{
		System.out.println(" name " + this.toString());
	}
}
public class EnumMethods1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name3 name = Name3.AASHA;
		System.out.println(name);
		name.getname();
	}

}


