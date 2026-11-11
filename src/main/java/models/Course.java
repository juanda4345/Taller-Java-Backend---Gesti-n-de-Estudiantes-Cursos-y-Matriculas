package models;

public class Course {
    private Long id;
    private String courseName;
    private String courseCode;
    private int credits;

    public Course() {

    }

    public Course(Long id, String courseName, String courseCode, int credits) {
        this.id = id;
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }
}


