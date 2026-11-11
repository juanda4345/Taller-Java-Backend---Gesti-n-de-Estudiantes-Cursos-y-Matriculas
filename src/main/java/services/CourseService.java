package services;

import models.Course;

import java.util.Collection;

public interface CourseService {
    void save(Course course);
    Course findById(Long id);
    Collection<Object> findAll();
    void delete(Long id);
}
