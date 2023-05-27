package baitap_oop;

public class Student {
	private int id;
	private String name;
	private float scoreLT;
	private float scoreTH;
	
	public Student() {}

	public Student(int id, String name, float scoreLT, float scoreTH) {
		this.id = id;
		this.name = name;
		this.scoreLT = scoreLT;
		this.scoreTH = scoreTH;
	}
	
	public float average() {
		return (this.scoreLT+this.scoreTH)/2;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getScoreLT() {
		return scoreLT;
	}

	public void setScoreLT(float scoreLT) {
		this.scoreLT = scoreLT;
	}

	public float getScoreTH() {
		return scoreTH;
	}

	public void setScoreTH(float scoreTH) {
		this.scoreTH = scoreTH;
	}

	@Override
	public String toString() {
		return "Student [ id = " + id + ", name = " + name + ", ScoreLT = " + scoreLT + ", ScoreTH = " + scoreTH + ", average = "+average()+" ]";
	}
	
	
}
