
public class Main {

	public static void main(String[] args) {
		
		User users = new User();
		users.setId(143);
		users.setFirstName("David");
		users.setLastName("Vax");
		users.setUserEmail("0000000@gmail.com");
		
		Instructor instructors = new Instructor();
		instructors.setId(213);
		instructors.setFirstName("Alexandre");
		instructors.setLastName("Paul");
		instructors.setInstructorEmail("0000000@gmail.com");
		instructors.setLessonName("Java & React");
		
		Student students = new Student();
		students.setId(365);
		students.setFirstName("Maria");
		students.setLastName("Volfa");
		students.setStudentEmail("0000000@gmail.com");
		
		
		System.out.println("User email: " + users.getUserEmail());
		
		
		
		System.out.println("-------------------------");
		
		UserManager userManager = new UserManager();
		userManager.Login(users);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.Login(instructors);
		instructorManager.lessonAdded(instructors);
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.Login(students);
		studentManager.Lesson(students);

	}

}
