
public class Course {

	public int id;
	public String courseName;
	public String imagePath;
	public String courseEducator;

	public Course() {
	}

	public Course(int id, String courseName, String imagePath, String courseEducator) {
		this.id = id;
		this.courseName = courseName;
		this.imagePath = imagePath;
		this.courseEducator = courseEducator;
	}
}