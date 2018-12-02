import java.util.Comparator;

public class StudentSortScore implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getScore() > o2.getScore())
			return 1;
		if (o1.getScore() < o2.getScore())
			return -1;
		return 0;

//			return (int)(o1.getScore() - o2.getScore());
	}

}
