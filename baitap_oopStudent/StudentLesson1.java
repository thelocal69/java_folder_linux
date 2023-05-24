package baitap_oopStudent;

public class StudentLesson1 {
	private String name;
	private String id;
	private double math;
	private double physic;
	private double chemical;
	
	public StudentLesson1() {}

	public StudentLesson1(String name, String id, double math, double physic, double chemical) {
		this.name = name;
		this.id = id;
		this.math = math;
		this.physic = physic;
		this.chemical = chemical;
	}
	
	
	public double avarage() {
		return (this.math+this.physic+this.chemical)/3;
	}
	
	public void classification() {
		System.out.printf("Student avarage is: %.1f%n", avarage());
		System.out.println("The Student classification is: ");
		if(avarage() >= 9) System.out.println("Exelent");
		else if(avarage() >= 8) System.out.println("Great");
		else if(avarage() >= 7) System.out.println("Good");
		else if(avarage() >= 5) System.out.println("Average");
		else System.out.println("Bad");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getPhysic() {
		return physic;
	}

	public void setPhysic(double physic) {
		this.physic = physic;
	}

	public double getChemical() {
		return chemical;
	}

	public void setChemical(double chemical) {
		this.chemical = chemical;
	}

	@Override
	public String toString() {
		return "StudentLesson1 [name=" + name + ", id=" + id + ", math=" + math + ", physic=" + physic + ", chemical="
				+ chemical + "]";
	}
	
	
}
