
public class Instructor extends User {
	private String instructorEmail;
	private String LessonName;

	public String getInstructorEmail() {
		return instructorEmail;
	}

	public void setInstructorEmail(String instructorEmail) {
		this.instructorEmail = instructorEmail;
	}

	public String getLessonName() {
		return LessonName;
	}

	public void setLessonName(String LessonName) {
		this.LessonName = LessonName;
	}
}
