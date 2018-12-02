import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Name 4", 44, 90));
		studentList.add(new Student("Name 2", 22, 70));
		studentList.add(new Student("Nam 5", 55, 100));
		studentList.add(new Student("Name 1", 15, 80));
		studentList.add(new Student("Name 3", 33, 95));

		for (Student student : studentList) {
			System.out.println(student);
		}
	
		System.out.println("\n----------------- Sort by name --------------------\n");
		
		Collections.sort(studentList, new StudentSortName());
		

		for (Student student : studentList) {
			System.out.println(student);
		}
		
		System.out.println("\n----------------- Sort by age --------------------\n");
		Collections.sort(studentList);
		

		for (Student student : studentList) {
			System.out.println(student);
		}

		System.out.println("/n----------------- Sort by score --------------------/n");
		Collections.sort(studentList,new StudentSortScore());
		

		for (Student student : studentList) {
			System.out.println(student);
		}

	}

}
