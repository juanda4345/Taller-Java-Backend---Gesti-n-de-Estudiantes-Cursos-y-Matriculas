package services;

import models.Student;

import java.util.Collection;

public interface StudentService {
    void save(Student student);
    Student findById(Long id);
    Collection<Object> findAll();
    void delete(Long id);

    void delete(String name, String lastName, String email);
}
