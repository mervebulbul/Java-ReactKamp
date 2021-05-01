
public class InstructorManager extends UserManager{
	
	public void Login(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " logged to system " );
		
	}
	public void lessonAdded(Instructor instructor) {
		System.out.println(instructor.getLessonName() + " added.");
	}

}
