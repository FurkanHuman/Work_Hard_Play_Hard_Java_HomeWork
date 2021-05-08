package Business.Concrete;

import Business.Abstrack.StudentService;
import Entities.Student;

public class StudentManager extends UserManager implements StudentService {

	@Override
	public void add(Student student) {
		super.add(student);
		System.out.println("Öðrenci Eklendi");
	}

	@Override
	public void update(Student student) {
		super.update(student);
		System.out.println("Öðrenci Güncellendi");
	}

	@Override
	public void delete(Student student) {
		super.delete(student);
		System.out.println("Öðrenci Silindi");
	}

	@Override
	public void homeworkCompleter(Student student, String comment) {
		student.setCourseCompleted(1);
		System.out.println("ders tamamlama yüzdesi %" + student.getCourseCompleted() + " Ders içeriði " + comment);
	}

	@Override
	public void pollingAdd(Student student, int id) {
		student.setCourseCompleted(id);
		System.out.println("Yoklamanýz Alýndý");
	}
}
