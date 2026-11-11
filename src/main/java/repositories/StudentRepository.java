package repositories;

import models.Student;
import java.util.List;

public interface StudentRepository {
    void save(Student student);
    Student findById(Long id);
    List<Student> findAll();
    void delete(Long id);
}

