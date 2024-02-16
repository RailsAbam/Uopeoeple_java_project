package NoteBook;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
  private static List<Student> students = new ArrayList<>();
  private static int totalStudents = 0;

  // Addin a new student to the database
  public static void addStudent(Student student) {
  students.add(student);
  totalStudents++; //Increasementing the each student
  }

  // Updatiing the student information
  public static void updateStudent(int id, Student updatedStudent) {
  for (int i = 0; i < students.size(); i++) {
  if (students.get(i).getId() == id) {
  students.set(i, updatedStudent);
  break;
  }
  }
  }

  // Getting the student detail if they exist
  public static Student getStudent(int id) {
  for (Student student : students) {
  if (student.getId() == id) {
  return student;
  }
  }
  return null;
  }

  // Get total number of students
  public static int getTotalStudents() {
  return totalStudents;
  }
}