public class Main {

	public static void main(String[] args) {

		Course course1 = new Course();

		course1.id = 1;
		course1.courseName = "Java";
		course1.courseEducator = "Engin Demiroğ";
		course1.imagePath = "Java.jpeg";

		Course course2 = new Course();

		course2.id = 2;
		course2.courseName = "C#";
		course2.courseEducator = "Engin Demiroğ";
		course2.imagePath = "Ccharp.jpeg";

		Course course3 = new Course();

		course3.id = 3;
		course3.courseName = "Arduino";
		course3.courseEducator = "Furkan Bozkurt";
		course3.imagePath = "Arduino.jpeg";

		Course course4 = new Course();

		course4.id = 3;
		course4.courseName = "Python";
		course4.courseEducator = "Furkan Bozkurt";
		course4.imagePath = "Python.jpeg";

		Category category1 = new Category();

		category1.id = 1;
		category1.categoryName = "Eğitmenler";
		String[] itemCategory1 = { "Tümü", "Engin Demiroğ", "Furkan Bozkurt" };
		category1.categoryItems = itemCategory1;

		Category category2 = new Category();

		category2.id = 2;
		category2.categoryName = "Diller";
		String[] itemCategory2 = { "Tümü", "C#", "Java", "Arduino" };
		category2.categoryItems = itemCategory2;

		Category category3 = new Category();
		category3.id = 3;
		category3.categoryName = "Alfabetik";
		String[] itemCategory3 = { "Tümü", "Arduino", "C#", "Java" };
		category3.categoryItems = itemCategory3;

		Category[] categories = { category1, category2 };
		Course[] courses = { course1, course2, course3 };

		courseManager courseManager = new courseManager();
		categoryManager categoryManager = new categoryManager();

		System.out.println("Kurslar:");

		courseManager.viewer(courses);

		System.out.println("Kategoriler");
		categoryManager.viewer(categories);

		courseManager.add(course4);
		courseManager.update(course1);
		categoryManager.add(category3);
	}
}