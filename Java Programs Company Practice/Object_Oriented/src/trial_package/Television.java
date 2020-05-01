package trial_package;

//if Class is used with final keyword and it stops inheritence
public class Television extends Product04 {
//	Inherited from Product04
	private String ScreenType;
	private int ScreenSize;

	public Television() {
		// TODO Auto-generated constructor stub
		super();
	}
	
//		Enter Alt+shift+s and select Constructor Using fileds
	public Television(int id, String name, double price, String screenType, int screenSize) {
		super(id, name, price);
		ScreenType = screenType;
		ScreenSize = screenSize;
	}


	public String getScreenType() {
		return ScreenType;
	}

	public void setScreenType(String screenType) {
		ScreenType = screenType;
	}

	public int getScreenSize() {
		return ScreenSize;
	}

	public void setScreenSize(int screenSize) {
		ScreenSize = screenSize;
	}
	
	public void print() {
		super.print(); //This Method Calls Print Function in SuperClass
		System.out.println("ScreenType = "+ScreenType+" ScreenSize "+ScreenSize);
	}

}
