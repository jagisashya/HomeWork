import java.util.Comparator;

public class Student implements Comparable<Student> {
	private String name;
	private int age;
	private double score;
	
	
	public Student(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getScore() {
		return score;
	}


	public void setScore(double score) {
		this.score = score;
	}


	@Override
	public String toString() {
		return "Name        ==> " + getName()  + '\n' +
			   "Age         ==> " + getAge()   + '\n' +
			   "Score       ==> " + getScore() + '\n' +
			   "--------------------------------------------------";
	}


	@Override
	public int compareTo(Student arg0) {
		// TODO Auto-generated method stub
		if (this.getAge() > arg0.getAge())
			return 1;
		if (this.getAge() < arg0.getAge())
			return -1;
		return 0;
	}


}
