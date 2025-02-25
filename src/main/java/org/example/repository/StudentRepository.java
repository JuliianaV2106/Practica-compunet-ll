package org.example.repository;

import org.example.model.Course;
import org.example.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private List<Student> students = new ArrayList<>();

    public List<Student> findAll() {
        return students;
    }


    //public StudentRepository(CourseRepository courseRepository) {
        //this.courseRepository = courseRepository;
    //}

    public void save(Student student) {
        students.add(student);
    }

    public boolean exists(Student student) {
        return students.contains(student);
    }
}