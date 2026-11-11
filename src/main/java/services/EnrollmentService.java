package services;

import models.Enrollment;
import java.util.List;

public interface EnrollmentService {
    void save(Enrollment enrollment);
    Enrollment findById(Long id);
    List<Enrollment> findAll();
    void delete(Long id);

    void save(String studentId, String courseId, String email);
}
