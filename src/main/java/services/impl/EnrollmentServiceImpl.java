package services.impl;

import models.Enrollment;
import repositories.EnrollmentRepository;
import services.EnrollmentService;

import java.util.Collection;

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
    public Collection<Object> findAll() {
        return enrollmentRepository.getEnrollments();
    }

    @Override
    public void delete(Long id) {
        Enrollment enrollment = findById(id);
        if (enrollment != null) {
            enrollmentRepository.getEnrollments().remove(enrollment);
        }
    }

    @Override
    public void save(String studentId, String courseId, String email) {

    }
}

