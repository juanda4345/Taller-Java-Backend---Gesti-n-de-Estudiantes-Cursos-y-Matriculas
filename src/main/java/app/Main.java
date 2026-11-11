package app;

import data.DataStore;
import models.Student;
import models.Course;
import models.Enrollment;

public class Main {
    public static void main(String[] args) {

        DataStore dataStore = new DataStore();

        dataStore.addStudent(new Student(1L, "John", "Doe", "jhon.doe@email.com", "123456789"));
        dataStore.addStudent(new Student(2L, "Jane", "Smith", "jane.smith@email.com", "987654321"));
        dataStore.addStudent(new Student(3L, "Carlos", "Gomez", "carlos.gomez@email.com", "456123789"));
        dataStore.addStudent(new Student(4L, "Ana", "Perez", "ana.perez@email.com", "789456123"));
        dataStore.addStudent(new Student(5L, "Lucia", "Torres", "lucia.torres@email.com", "321654987"));

        dataStore.addCourse(new Course(101L, "Introducción a Java", "CS101", 4));
        dataStore.addCourse(new Course(102L, "Estructuras de Datos", "CS201", 5));
        dataStore.addCourse(new Course(103L, "Base de Datos I", "DB101", 4));
        dataStore.addCourse(new Course(104L, "Desarrollo Web", "WEB101", 3));
        dataStore.addCourse(new Course(105L, "Algoritmos Avanzados", "CS301", 5));

        dataStore.addEnrollment(new Enrollment(1001L, 1L, 101L, "2023-08-01"));
        dataStore.addEnrollment(new Enrollment(1002L, 1L, 102L, "2023-08-01"));
        dataStore.addEnrollment(new Enrollment(1003L, 2L, 102L, "2023-08-02"));
        dataStore.addEnrollment(new Enrollment(1004L, 2L, 103L, "2023-08-02"));
        dataStore.addEnrollment(new Enrollment(1005L, 3L, 104L, "2023-08-03"));

        System.out.println("--- LISTA DE ESTUDIANTES ---");
        for (Student s : dataStore.getStudents()) {
            System.out.println("ID: " + s.getId() +
                    ", Nombre: " + s.getFirstName() + " " + s.getLastName() +
                    ", Email: " + s.getEmail());
        }

        System.out.println("\n--- LISTA DE CURSOS ---");
        for (Course c : dataStore.getCourses()) {
            System.out.println("ID Curso: " + c.getId() +
                    ", Materia: " + c.getCourseName() +
                    ", Código: " + c.getCourseCode() +
                    ", Créditos: " + c.getCredits());
        }

        System.out.println("\n--- LISTA DE INSCRIPCIONES ---");
        for (Enrollment e : dataStore.getEnrollments()) {
            System.out.println("ID Inscripción: " + e.getEnrollmentId() +
                    ", ID Estudiante: " + e.getStudentId() +
                    ", ID Curso: " + e.getCourseId() +
                    ", Fecha: " + e.getEnrollmentDate());
        }
    }
}
