package Uopeoeple_java_project.Student;

import java.util.ArrayList;

public class Courses {
    private String name;
    private int id;
    private List<Student> enrolledStudents;
    private int credits;
  
    public Courses(String name, int id, int credits) {
    this.name = name;
    this.id = id;
    this.credits = credits;
    this.enrolledStudents = new ArrayList<>();
    }
  
    public void addStudent(Student student) {
    enrolledStudents.add(student);
    }
  
    public void viewEnrolledStudents() {
    for (Student student : enrolledStudents) {
    System.out.println(student.getName());
    }
    }
  
    public double calculateStudentGrade(Student student) {
    // Calculate and return the grade for the student in this course
    }
  
    public int getCredits() {
    return credits;
    }
  }
  



