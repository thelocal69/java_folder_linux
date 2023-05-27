package baitap_CanBo;

public abstract class Officer {
	protected String fullName;
	protected int age;
	protected String gender;
	protected String address;
	
	public Officer() {}
	
	public Officer(String fullName, int age, String gender, String address) {
		this.fullName = fullName;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Officer [fullName=" + fullName + ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
	}
	
	
}
