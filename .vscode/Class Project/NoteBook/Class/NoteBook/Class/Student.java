
package NoteBook.Class Project;

import java.util.*;
public class Student {
    private String name;
    private final int id;
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



public class StudentmanagementRecords{
    public static void main(final String[] args, int id){
        final Scanner scanner = new Scanner(System.in);
           
        while (true){//check 
            System.out.println("Student management records system");
            System.out.println("1. Please add Student");
            System.out.println("2. Please update Student Information");
            System.out.println("3. Please View Student details");
            System.out.println("1. Please Exit");
            System.out.println("1. Please Enter your Option");


            final int Option = scanner.nextInt();
            scanner.nextLine();

            switch (Option) {
            case 1:
                System.out.println("Please enter your Student Name: ");
                final String name = scanner.nextLine();
                System.out.println("Please enter student age: ");
                final int age = scanner.nextInt();
                System.out.println("Please enter Student grade: "); 
                final char grade = scanner.next().charAt(0);
                StudentManagement.addStudent(name,id, age, grade);
                    break;
            
            case 2:
                 System.out.println("Please enter Student ID you want to update: ");
                 final int idToUpdate = scanner.nextInt();
                 scanner.nextLine();
                 System.out.println("Please enter your Student Name: ");
                 final String updatedName = scanner.nextLine();
                 System.out.println("Please enter your Student age: ");
                 final int updatedAge = scanner.nextInt();
                 System.out.println("Please enter your Student Grade: ");
                 final char updatedGrade = scanner.next().charAt(0);
                 StudentManagement.updatedStudentRecord(updatedName, idToUpdate, updatedAge, updatedGrade);
                 break;

            case 3:
                 System.out.println("Please enter Student ID you want to view: ");
                 final int idToView = scanner.nextInt();
                 StudentManagement.viewStudentDetails(idToView);
                 break;
            case 4:
                 System.out.println("You are about exiting the Program, Goodbye!!!");
                 System.exit(0);
            default:
            System.out.println("Please Ypur Options is not valid!!");


            }
        }
    }

}



