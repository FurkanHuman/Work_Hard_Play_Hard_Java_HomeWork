import Business.Concrete.InstructorManager;
import Business.Concrete.StudentManager;
import Entities.Instructor;
import Entities.Student;

public class Main {

    public static void main(String[] args) {

        furkanBozkurt();
        fatihKayan();
        enginDemirog();
        studentManagerVoid();
        
        
        InstructorManager instructorManager =new  InstructorManager();
               instructorManager.add(enginDemirog());
               instructorManager.homeworkAdd("https://youtu.be/HB0T0hAMk0k", 1);
        
        
        
        
        

    }

	private static void studentManagerVoid() {
		StudentManager studentManager = new StudentManager();

        studentManager.add(furkanBozkurt());
        studentManager.add(fatihKayan());
        studentManager.getAll(); // �al��m�yor
        studentManager.delete(fatihKayan());
        studentManager.update(furkanBozkurt());       
	}

    private static Instructor enginDemirog() {
        Instructor instructor = new Instructor();

        instructor.setId(0);
        instructor.setName("Engin");
        instructor.setSurname("Demiroğ");
        instructor.setEmail("engindemirog@engindemirog.com");
        instructor.setVideo("https://www.youtube.com/watch?v=f2cgxA08dlI");
        return instructor;
    }

    private static Student furkanBozkurt() {
        Student student = new Student() {
        };
        student.setId(1);
        student.setEmail("furkan@furkan.com");
        student.setName("furkan");
        student.setSurname("bozkurt");
        student.setPassword("password");
        student.setHomework("Yapıldı : string bir char arraydır");
        student.setCourseCompleted(6);
        return student;
    }

    private static Student fatihKayan() {
        Student student = new Student() {
        };
        student.setId(2);
        student.setEmail("fatih@fatih.com");
        student.setName("fatih");
        student.setSurname("kayan");
        student.setPassword("password123");
        student.setPolling(2);
        student.setHomework("Yapıldı : short max +32768 rakam tutar");
        student.setCourseCompleted(2);
        return student;
    }

}
