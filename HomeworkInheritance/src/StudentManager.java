
public class StudentManager extends UserManager {
	public void Login(Student student) {
		System.out.println( student.getFirstName() + " " + student.getLastName() + " logged to system ");
	}
	
	public void Lesson(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " completed lessson");
	}
}
