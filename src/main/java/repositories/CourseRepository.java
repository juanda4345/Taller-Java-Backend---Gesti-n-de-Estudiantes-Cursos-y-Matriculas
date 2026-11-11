package repositories;

import models.Course;
import java.util.List;

public interface CourseRepository {
    void save(Course course);
    Course findById(Long id);
    List<Course> findAll();
    void delete(Long id);
}

