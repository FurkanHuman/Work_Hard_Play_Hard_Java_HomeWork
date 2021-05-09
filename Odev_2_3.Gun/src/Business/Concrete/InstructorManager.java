package Business.Concrete;

import Business.Abstracts.InstructorService;
import Entities.Instructor;

public class InstructorManager extends UserManager implements InstructorService {

    @Override
    public void add(Instructor instructor) {
        super.add(instructor);
        System.out.println("��retmen Eklendi");
    }

    @Override
    public void homeworkAdd(String comment, int dayOfNumber) {
        System.out.println("g�n " + dayOfNumber + " G�n�n dersi " + comment);
    }

    @Override
    public void update(Instructor instructor) {
        super.update(instructor);
        System.out.println("��retmen G�ncellendi");
    }

    @Override
    public void delete(Instructor instructor) {
        super.delete(instructor);
        System.out.println("��retmen Silindi");
    }
}
