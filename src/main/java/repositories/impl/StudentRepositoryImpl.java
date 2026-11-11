package repositories.impl;

import data.DataStore;
import models.Student;
import repositories.StudentRepository;

import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {

    private final DataStore dataStore;

    public StudentRepositoryImpl(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    @Override
    public void save(Student student) {
        dataStore.addStudent(student);
    }

    @Override
    public Student findById(Long id) {
        return dataStore.findStudentById(id);
    }

    @Override
    public List<Student> findAll() {
        return dataStore.getStudents();
    }

    @Override
    public void delete(Long id) {
        Student student = findById(id);
        if (student != null) {
            dataStore.getStudents().remove(student);
        }
    }
}

