
public class Course {

	public Course(int id, String courseName, String instructor, int price, boolean login) {
		this.id = id;
		this.courseName = courseName;
		this.instructor = instructor;
		this.price = price;
		this.login = login;

	}

	public Course() {
		//constructor
	}

	int id;
 String courseName;
	String instructor;
	int price;
	boolean login;

}
