package trial_package;

public class Employee {
	
	private static int counter; //We do not need to initialize this Counter to 0 because static int itself initalize that values to 0 or null 
	private final int id;
	private String name;
	private double salary;
	
	public Employee() {
		this.id=++counter;
	}
	

	public Employee(String name, double salary) {
		//super();
		this(); //calls Default Constructor
		this.name = name;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


}
