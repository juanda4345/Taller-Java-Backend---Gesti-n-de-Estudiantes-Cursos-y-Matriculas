package services.impl;

import models.Student;
import repositories.StudentRepository;
import services.StudentService;

import java.util.Collection;

public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findStudentById(id);
    }

    @Override
    public Collection<Object> findAll() {
        return studentRepository.getStudents();
    }

    @Override
    public void delete(Long id) {
        Student student = findById(id);
        if (student != null) {
            studentRepository.getStudents().remove(student);
        }
    }

    @Override
    public void delete(String name, String lastName, String email) {

    }
}

