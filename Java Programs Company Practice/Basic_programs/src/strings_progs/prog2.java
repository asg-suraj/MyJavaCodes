package strings_progs;

public class prog2 {

	public prog2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String name1="shri";
			String name2="shriram";
			
			int c = name1.compareTo(name2);  //compared lexicographically
			if(c<0)
			{
				System.out.println(name1 +" is Smaller than "+name2);
			}
			else if (c==0) {
				System.out.println(name1 +" is Equals to "+name2);
			}
			else
			{
				System.out.println(name1 +" is greater than "+name2);
			}
	}

}
