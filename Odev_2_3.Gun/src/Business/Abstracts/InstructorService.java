package Business.Abstracts;

import Entities.Instructor;

public interface InstructorService {

    public void add(Instructor instructor);

    public void homeworkAdd(String comment, int dayOfNumber);

    public void update(Instructor instructor);

    public void delete(Instructor instructor);

}
