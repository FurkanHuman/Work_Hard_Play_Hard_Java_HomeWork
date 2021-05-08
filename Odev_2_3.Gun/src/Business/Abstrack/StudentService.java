package Business.Abstrack;

import Entities.Student;

public interface StudentService {
    public void add(Student student);

    public void homeworkCompleter(Student student, String comment);

    public void pollingAdd(Student student, int id);

    public void update(Student student);

    public void delete(Student student);
}
