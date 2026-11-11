package controllers;

import services.EnrollmentService;

public class EnrollmentController {

    private final EnrollmentService enrollmentService;

    public EnrollmentController(EnrollmentService enrollmentService) {
        this.enrollmentService = enrollmentService;
    }

    public void createEnrollment(String studentId, String courseId, String email) {
        this.enrollmentService.save(studentId, courseId, email);
    }
}
