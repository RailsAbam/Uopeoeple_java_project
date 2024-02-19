import java.util.Scanner;

package .vscode.Class Project;

public class StudentManagementRecords {
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
    
    
    
    
