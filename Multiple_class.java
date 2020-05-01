//import java.util.*;  Multiple_classhelp 
class one
{
	public void Simplemsg()
	{
		System.out.println("class one: method Simplemsg ");
	}
	
}
public class Multiple_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		one oneobj=new one();     //created Object of Class in same program 
		oneobj.Simplemsg();  
		
		
		Multiple_classhelp objh =new Multiple_classhelp();  //object name objh  
		//class is declared public and made in same package so we can access it
		//if it is been declared in another package then we have to import that package in program
		//if Class is not made public it is By defaault private
		// another type of class is there that is protected which can be used only for 
		objh.fact();
	}

}
