package org.example.services;

import org.example.model.Course;
import org.example.model.Student;
import org.example.repository.CourseRepository;
import org.example.repository.StudentRepository;

import java.util.Arrays;

public class StudentService {

    private StudentRepository studentRepository;
    private CourseRepository courseRepository;

    public StudentService(StudentRepository studentRepository, CourseRepository courseRepository) {

        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    public void createStudent(Student student) {
        if(!studentRepository.exists(student)){
            studentRepository.save(student);
            //añadir cursos
            student.getCourses().forEach(course -> {
               if (!courseRepository.exists(course)) courseRepository.save(course);
            });
        }
        else{
            System.out.println("Student already exists");
        }
    }

    public void initializeData(){
        //crear los objetos
        var student1 = new Student();
        student1.setCode("A00111111");
        student1.setName("Andrea Rodriguez");
        student1.setProgram("Ingeniería de Sistemas");

        var student2 = new Student();
        student2.setCode("A00222222");
        student2.setName("Blanca Gutierrez");
        student2.setProgram("Ingeniería de Sistemas");

        var student3 = new Student();
        student3.setCode("A00111111");
        student3.setName("Carlos Zapata");
        student3.setProgram("Psicología");


        var course1 = new Course();
        course1.setId(59);
        course1.setName("Compunet 2");
        course1.setProfessorName("Alejandro Muñoz");
        course1.setSchedule("MA 14:00 15:59, JU 14:00 15:59");

        var course2 = new Course();
        course2.setId(24);
        course2.setName("COE2");
        course2.setProfessorName("Andres Garcia");
        course2.setSchedule("MI 14:00 15:59");

        var course3 = new Course();
        course3.setId(17);
        course3.setName("Ingesoft 4");
        course3.setProfessorName("Gabriel Tamura");
        course3.setSchedule("MA 07:00 08:59, JU 07:00 08:59");

        var course4 = new Course();
        course4.setId(12);
        course4.setName("Psicología Organizacional");
        course4.setProfessorName("Saryth Valencia");
        course4.setSchedule("MI 14:00 15:59");

        student1.getCourses().addAll(Arrays.asList(course1,course2,course3,course4));
        student2.getCourses().addAll(Arrays.asList(course2,course3));
        student3.getCourses().addAll(Arrays.asList(course2,course4));

        createStudent(student1);
        createStudent(student2);
        createStudent(student3);

    }
}
