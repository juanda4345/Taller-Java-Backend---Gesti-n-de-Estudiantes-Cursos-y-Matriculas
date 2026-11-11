package repositories;

import models.Enrollment;
import java.util.List;

public interface EnrollmentRepository {
    void save(Enrollment enrollment);
    Enrollment findById(Long id);
    List<Enrollment> findAll();
    void delete(Long id);
}

