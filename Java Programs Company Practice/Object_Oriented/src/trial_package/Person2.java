package trial_package;

public class Person2 implements Cloneable { // we are using object Cloneing

	// The Exception and Replicate Method Are used for Cloneing
	private String firstname;
	private String lastname;
	private String city;

	public Person2() {

	}

	public Person2(String firstname, String lastname, String city) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public boolean equals(Object obj) {
		// Taken For Clonning_objects
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person2)) {
			return false;
		}
		Person2 other = (Person2) obj;
		if (city == null) {
			if (other.city != null) {
				return false;
			}
		} else if (!city.equals(other.city)) {
			return false;
		}
		if (firstname == null) {
			if (other.firstname != null) {
				return false;
			}
		} else if (!firstname.equals(other.firstname)) {
			return false;
		}
		if (lastname == null) {
			if (other.lastname != null) {
				return false;
			}
		} else if (!lastname.equals(other.lastname)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return firstname + " " + lastname + "(" + city + ")";

		// overriden the method here
	}

	public Person2 replicate() throws CloneNotSupportedException {
		return (Person2) clone(); //returning cloned object
	}

}
