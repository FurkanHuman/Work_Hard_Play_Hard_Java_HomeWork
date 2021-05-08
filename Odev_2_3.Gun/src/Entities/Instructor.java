package Entities;

public class Instructor extends User {

    private String videoUrl;
    private String homeworkComment;

    public Instructor() {
    }

    public Instructor(String videoUrl, String homeworkComment) {
        this.videoUrl = videoUrl;
        this.homeworkComment = homeworkComment;
    }

    public String getVideo() {
        return videoUrl;
    }

    public void setVideo(String video) {
        this.videoUrl = video;
    }

    public String getHomeworkComment() {
        return homeworkComment;
    }

    public void setHomeworkComment(String homeworkComment) {
        this.homeworkComment = homeworkComment;
    }
}
