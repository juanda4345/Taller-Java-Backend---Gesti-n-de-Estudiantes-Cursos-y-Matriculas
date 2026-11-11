package data;

import models.Course;
import models.Enrollment;
import models.Student;

import java.util.ArrayList;
import java.util.List;

public class DataStore {

    private final List<Student> students;
    private final List<Course> courses;
    private final List<Enrollment> enrollments;

    public DataStore() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.enrollments = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addEnrollment(Enrollment enrollment) {
        enrollments.add(enrollment);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public Student findStudentById(Long id) {
        return students.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Course findCourseById(Long id) {
        return courses.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Enrollment findEnrollmentById(Long id) {
        return enrollments.stream()
                .filter(e -> e.getEnrollmentId().equals(id))
                .findFirst()
                .orElse(null);
    }
}

