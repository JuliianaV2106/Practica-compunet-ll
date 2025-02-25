package org.example.services;
import org.example.repository.CourseRepository;

public class CourseService {

    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
}
