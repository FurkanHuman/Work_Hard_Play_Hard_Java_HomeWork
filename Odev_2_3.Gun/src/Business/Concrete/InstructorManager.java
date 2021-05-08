package Business.Concrete;

import Business.Abstrack.InstructorService;
import Entities.Instructor;

public class InstructorManager extends UserManager implements InstructorService {

    @Override
    public void add(Instructor instructor) {
        super.add(instructor);
        System.out.println("öðretmen Eklendi");
    }

    @Override
    public void homeworkAdd(String comment, int dayOfNumber) {
        System.out.println("gün " + dayOfNumber + " Günün dersi " + comment);
    }

    @Override
    public void update(Instructor instructor) {
        super.update(instructor);
        System.out.println("öðretmen Güncellendi");
    }

    @Override
    public void delete(Instructor instructor) {
        super.delete(instructor);
        System.out.println("öðretmen Silindi");
    }
}
