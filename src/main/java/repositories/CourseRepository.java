package repositories;

import models.Course;

import java.util.Collection;
import java.util.List;

public interface CourseRepository {
    void save(Course course);
    Course findById(Long id);
    List<Course> findAll();
    void delete(Long id);

    Collection<Object> getCourses();

    Course findCourseById(Long id);
}

