package Uopeoeple_java_project.Student;

public class Main {
    public static void main(String[] args) {
    Student student = new Student("John Doe", 12345);
    Courses course = new Courses("Math", 101, 3);

    student.enrollCourse(course);

    }
}