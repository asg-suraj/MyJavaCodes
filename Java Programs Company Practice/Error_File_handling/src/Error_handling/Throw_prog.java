package Error_handling;

public class Throw_prog {

	public Throw_prog() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		p1.setId(-11);
		p1.setName(" ");
		p1.setPrice(-0.000000004);
		
		System.out.println(p1);  //will call toString method
	}

}
