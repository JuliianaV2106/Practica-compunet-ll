package org.example.model;

public class Course {

    private int id;
    //Example: 35

    private String name;

    private String professorName;

    private String schedule;
    //Example: "MI 07:00 08:59, VI 15:00 16:59"

    //Constructors
    public Course() {

    }

    //Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Course){
            Course course = (Course) obj;
            return this.id == course.getId();
        }
        return false;
    }
}
