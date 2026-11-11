package services;

import models.Enrollment;

import java.util.Collection;

public interface EnrollmentService {
    void save(Enrollment enrollment);
    Enrollment findById(Long id);
    Collection<Object> findAll();
    void delete(Long id);

    void save(String studentId, String courseId, String email);
}
