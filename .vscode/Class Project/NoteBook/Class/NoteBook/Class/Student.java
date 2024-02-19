
import java.util.*;
public class Student {
    private String name;
    private int id;
    private int age;
    private char grade;

       public Student(final String name, final int id, final int age, final char grade){
        this.name = name;
        this.id = id;
        this.age = age;
        this.grade = grade;
       }

    public void displayDetails(){
        System.out.println("The Student ID is:" + id);
        System.out.println("The Student Name is:" + name);
        System.out.println("The Student age is:" + age);
        System.out.println("The Student Grade is:" + grade);
    }
    public int getId(){
        return id;
    }

    public void updateDetails(final String name, final int id, final int age, final char grade){
        this.name = name;
        this.id = id;
        this.age = age;
        this.grade = grade;

    }
}


/**
 * Student
 */
class StudentManagement {
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static int totalStudents = 0;
     
        public static void addStudent(final String name, final int id, final int age, final char grade){
            totalStudents++;
            studentList.add(new Student(name, totalStudents, age, grade));
            System.out.println("Student was added successfully");
        }

        public static void updatedStudentRecord(final String name, final int id, final int age, final char grade){
            for(final Student student: studentList){
                if(student.getId() == id ){
                    student.updateDetails(name, id, age, grade);
                    System.out.println("Student information is updated");
                    return;
                }
            }
            System.out.println("Student wiht the ID number:"  + id + "Is not found" );
        }
public static void viewStudentDetails( final int id){
    for(final Student student: studentList){
        if(student.getId() == id){
            student.displayDetails();
            return;
        }
    }
 System.out.println("Student wiht the ID number:"  + id + "Is not found" );

      }

}




   
