package repositories.impl;

import data.DataStore;
import models.Course;
import repositories.CourseRepository;

import java.util.List;

public class CourseRepositoryImpl implements CourseRepository {

    private final DataStore dataStore;

    public CourseRepositoryImpl(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    @Override
    public void save(Course course) {
        dataStore.addCourse(course);
    }

    @Override
    public Course findById(Long id) {
        return dataStore.findCourseById(id);
    }

    @Override
    public List<Course> findAll() {
        return dataStore.getCourses();
    }

    @Override
    public void delete(Long id) {
        Course course = findById(id);
        if (course != null) {
            dataStore.getCourses().remove(course);
        }
    }
}

