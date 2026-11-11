package services.impl;

import models.Course;
import repositories.CourseRepository;
import services.CourseService;

import java.util.Collection;

public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findCourseById(id);
    }

    @Override
    public Collection<Object> findAll() {
        return courseRepository.getCourses();
    }

    @Override
    public void delete(Long id) {
        Course course = findById(id);
        if (course != null) {
            courseRepository.getCourses().remove(course);
        }
    }
}

