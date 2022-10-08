package homeworkone;

public class Customer {
	public Customer() {
		System.out.println("Müşteri nesnesi başlatıldı");
	}
	 int id;
	 String firstName;
	 String lastName;
	 String nationalIdentity;
	
	

	public Customer(int id, String firstName, String lastName, String nationalIdentity) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

}