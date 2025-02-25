package org.example.repository;

import org.example.model.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseRepository {
    private List<Course> courses = new ArrayList<>();

    public List<Course> findAll() {
        return courses;
    }

    public void save(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
        System.out.println("Courses length" + courses.size());;
    }

    public boolean exists(Course course) {
        return courses.contains(course);
    }
}
