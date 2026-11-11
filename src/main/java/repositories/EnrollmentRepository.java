package repositories;

import models.Enrollment;

import java.util.Collection;
import java.util.List;

public interface EnrollmentRepository {
    void save(Enrollment enrollment);
    Enrollment findById(Long id);
    List<Enrollment> findAll();
    void delete(Long id);

    Collection<Object> getEnrollments();

    Enrollment findEnrollmentById(Long id);
}

