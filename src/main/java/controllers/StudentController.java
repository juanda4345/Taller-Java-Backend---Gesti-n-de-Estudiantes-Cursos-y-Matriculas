package controllers;

import services.StudentService;

public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public void createStudent(String name, String lastName, String email) {
        this.studentService.delete(name, lastName, email);
    }
}
