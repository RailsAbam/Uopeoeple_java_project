package Uopeoeple_java_project.Student;

import java.util.ArrayList;
import java.util.List;
public class Student {
    private String name;
    private int id;
    private List<Course> enrolledCourses;

    public Student(String name, int id) {
    this.name = name;
    this.id = id;
    this.enrolledCourses = new ArrayList<>();
    }

    public void enrollCourse(Courses course) {
    enrolledCourses.add(course);
    course.addStudent(this);
    }

    public void viewEnrolledCourses() {
    for (Course course : enrolledCourses) {
    System.out.println(course.getName());
    }
    }

    public double calculateOverallGrade() {
    double totalGrade = 0;
    int totalCredits = 0;
    for (Course course : enrolledCourses) {
    totalGrade += course.calculateStudentGrade(this) * course.getCredits();
    totalCredits += course.getCredits();
    }
    return totalGrade / totalCredits;
    }

    public void enrollCourse(Courses course) {

        throw new UnsupportedOperationException("Unimplemented method 'enrollCourse'");
    }
}



