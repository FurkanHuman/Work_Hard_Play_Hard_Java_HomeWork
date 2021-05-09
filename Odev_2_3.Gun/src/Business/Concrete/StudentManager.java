package Business.Concrete;

import Business.Abstracts.StudentService;
import Entities.Student;

public class StudentManager extends UserManager implements StudentService {

	@Override
	public void add(Student student) {
		super.add(student);
		System.out.println("��renci Eklendi");
	}

	@Override
	public void update(Student student) {
		super.update(student);
		System.out.println("��renci G�ncellendi");
	}

	@Override
	public void delete(Student student) {
		super.delete(student);
		System.out.println("��renci Silindi");
	}

	@Override
	public void homeworkCompleter(Student student, String comment) {
		student.setCourseCompleted(1);
		System.out.println("ders tamamlama y�zdesi %" + student.getCourseCompleted() + " Ders i�eri�i " + comment);
	}

	@Override
	public void pollingAdd(Student student, int id) {
		student.setCourseCompleted(id);
		System.out.println("Yoklaman�z Al�nd�");
	}
}
