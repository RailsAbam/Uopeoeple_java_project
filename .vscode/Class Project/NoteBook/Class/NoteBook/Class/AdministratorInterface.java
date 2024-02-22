import java.util.Scanner;

public class AdministratorInterface {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            while (true){
                    System.out.println("Main Menu:");
                    System.out.println("1. Add a new student");
                    System.out.println("2. Update your student information");
                    System.out.println("3. View student details");
                    System.out.println("4. Exit");
                    System.out.print("Enter your choice: ");
                    int choice = scanner.nextInt();

                  //  final int choice = scanner.nextInt();
                   // scanner.nextInt();

            switch (choice){
   case 1: // Add a new student
            System.out.print("Enter student Name: ");
            String name = scanner.next();
            System.out.print("Enter student ID: ");
            int id = scanner.nextInt();
            System.out.print("Enter student Age: ");
            int age = scanner.nextInt();
            System.out.print("Enter student Grade: ");
            double grade = scanner.nextDouble();


            Student newStudent = new Student(name,  id, age, grade);
            StudentManagement.addStudent(newStudent);
            System.out.println("Student added successfully!");
            break;

   case 2: // Update student information
            System.out.print("Enter student ID You want to update: ");
            int updateId = scanner.nextInt();
            Student studentToUpdate = StudentManagement.getStudent(updateId);


            if (studentToUpdate != null){
            System.out.print("Enter updated student name: ");
            String updatedName = scanner.next();
            System.out.print("Enter updated student age: ");
            int updatedAge = scanner.nextInt();
            System.out.print("Enter updated student grade: ");
            double updatedGrade = scanner.nextDouble();

            Student updatedStudent = new Student(updatedName, updateId, updatedAge, updatedGrade); 
            StudentManagement.updateStudent(updateId, updatedStudent);
    } else {
            System.out.println("Student not found!");
    } break;


    case 3: // View student details
            System.out.print("Enter student ID to view details: ");
            int viewId = scanner.nextInt();
            Student studentToView = StudentManagement.getStudent(viewId);
            if (studentToView != null){
                    System.out.println("Student Details:");
                    System.out.println("Name: " + studentToView.getName());
                    System.out.println("ID: " + studentToView.getId());
                    System.out.println("Age: " + studentToView.getAge());
                    System.out.println("Grade: " + studentToView.getGrade());
            } else { System.out.println("Student not found!");
            } break;
    case 4:
                    System.out.println("Exiting the system, Goodbye!!!!");
                    System.exit(0);

    default:
    System.out.println("You have entered invalid option!!!!!! ");

}


        }


        }
    }
}




