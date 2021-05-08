
public class courseManager {

    public void add(Course course) {
        System.out.println(course.courseName + " Sisteme Eklendi");
    }

    public void update(Course course) {
        System.out.println(course.courseName + " Sistemi Güncellendi");

    }

    public void viewer(Course[] courses) {

        for (Course course : courses) {
            System.out.println("Kurs : " + course.courseName);
            System.out.println("Eğitmen " + course.courseEducator);
            System.out.println("image/" + course.imagePath);
            System.out.println("-----------------------------------------");
        }
    }
}
