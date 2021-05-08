package Entities;

public class Student extends User {

    private int courseCompleted;
    private String homework;
    private int polling; // yoklama

    public Student() {
    }

    public Student(int courseCompleted, String homework, int polling) {
        this.courseCompleted = courseCompleted;
        this.homework = homework;
        this.polling = polling;
    }

    public int getCourseCompleted() {
        return courseCompleted;
    }

    public void setCourseCompleted(int courseCompleted) {
        this.courseCompleted += courseCompleted;
    }

    public String getHomework() {
        return homework;
    }

    public void setHomework(String homework) {
        this.homework = homework;
    }

    public int getPolling() {
        return polling;
    }

    public void setPolling(int polling) {
        this.polling += polling;
    }

}
