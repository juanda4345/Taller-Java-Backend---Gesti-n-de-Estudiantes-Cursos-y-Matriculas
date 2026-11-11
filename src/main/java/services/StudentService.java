package services;

import models.Student;
import java.util.List;

public interface StudentService {
    void save(Student student);
    Student findById(Long id);
    List<Student> findAll();
    void delete(Long id);

    void delete(String name, String lastName, String email);
}
