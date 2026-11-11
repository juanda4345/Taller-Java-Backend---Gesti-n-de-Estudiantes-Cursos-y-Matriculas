package repositories.impl;

import data.DataStore;
import models.Enrollment;
import repositories.EnrollmentRepository;

import java.util.Collection;
import java.util.List;

public class EnrollmentRepositoryImpl implements EnrollmentRepository {

    private final DataStore dataStore;

    public EnrollmentRepositoryImpl(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    @Override
    public void save(Enrollment enrollment) {
        dataStore.addEnrollment(enrollment);
    }

    @Override
    public Enrollment findById(Long id) {
        return dataStore.findEnrollmentById(id);
    }

    @Override
    public List<Enrollment> findAll() {
        return dataStore.getEnrollments();
    }

    @Override
    public void delete(Long id) {
        Enrollment enrollment = findById(id);
        if (enrollment != null) {
            dataStore.getEnrollments().remove(enrollment);
        }
    }

    @Override
    public Collection<Object> getEnrollments() {
        return List.of();
    }

    @Override
    public Enrollment findEnrollmentById(Long id) {
        return null;
    }
}

