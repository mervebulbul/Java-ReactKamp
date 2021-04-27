
public class CourseManager {

	public static void main(String[] args) {

		Course courseManager1 = new Course();
		courseManager1.id = 1;
		courseManager1.courseName = "Yazılım Geliştirici Yetiştirme Kampı(C+Angular)";
		courseManager1.instructor = "Engin Demiroğ";
		courseManager1.price = 0;

		Course courseManager2 = new Course();
		courseManager2.id = 2;
		courseManager2.courseName = "Yazılım Geliştirici Yetiştirme Kampı(Java+React)";
		courseManager2.instructor = "Engin Demiroğ";
		courseManager2.price = 0;

		Course courseManager3 = new Course();
		courseManager3.id = 3;
		courseManager3.courseName = "Programlamaya Giriş İçin Temel Kurs";
		courseManager3.instructor = "Engin Demiroğ";
		courseManager3.price = 0;

		Course[] courses = { courseManager1, courseManager2, courseManager3 };
		System.out.println(courses.length);

		for (Course courseManager : courses) {
			System.out.println(courseManager.id);
			System.out.println(courseManager.courseName);
			System.out.println(courseManager.instructor);
			System.out.println(courseManager.price);
		}

		System.out.println("Course id: " + courseManager1.id);
		System.out.println("Course name: " + courseManager1.courseName);
		System.out.println("Course instructor: " + courseManager1.instructor);
		System.out.println("Course price: " + courseManager1.price);

	}

}
