package Enumerations;
enum Names1{
	AASHA , DHEERAJ ,VIBHA
}
public class EnumInSwitchStmt {
	
	Names1 name;
	public EnumInSwitchStmt(Names1 name)
	{
		this.name = name ;
	}
	public void checkName()
	{
		switch(name)
		{
		case AASHA :
		case DHEERAJ :
		case VIBHA :
				System.out.println(" Name is  : " + name);
				break ;
		default :
				System.out.println(" Name is  not defined ") ;
				break ;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumInSwitchStmt enumInSwitchStmt = new EnumInSwitchStmt(Names1.AASHA);
		enumInSwitchStmt.checkName();
	}

}
