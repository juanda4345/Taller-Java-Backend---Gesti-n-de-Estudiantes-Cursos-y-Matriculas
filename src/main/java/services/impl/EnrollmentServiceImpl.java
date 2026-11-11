package services.impl;

import models.Enrollment;
import repositories.EnrollmentRepository;
import services.EnrollmentService;
import java.util.List;

public class EnrollmentServiceImpl implements EnrollmentService {

    private final EnrollmentRepository enrollmentRepository;

    public EnrollmentServiceImpl(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }

    @Override
    public void save(Enrollment enrollment) {
        enrollmentRepository.save(enrollment);
    }

    @Override
    public Enrollment findById(Long id) {
        return enrollmentRepository.findEnrollmentById(id);
    }

    @Override
    public List<Enrollment> findAll() {
        return enrollmentRepository.getEnrollments();
    }

    @Override
    public void delete(Long id) {
        Enrollment enrollment = findById(id);
        if (enrollment != null) {
            enrollmentRepository.getEnrollments().remove(enrollment);
        }
    }
}

