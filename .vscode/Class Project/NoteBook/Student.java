


public class Student {
    private String name;
    private int id;
    private int age;
    private double grade;
    // Constructor
    public Student(final String name,final int id, final int age, final double grade) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.grade = grade;
}

    public void displayDetails(){
    System.out.println("StudentID: "+ name);
    System.out.println("StudentID: "+ id);
    System.out.println("StudentID: "+ age);
    System.out.println("StudentID: "+ grade);
    System.out.println("..........😀😀😀 ");
}
    public String getName(){
        return name;
}
public int getId(){
        return id;
    }
    public int getAge(){
        return age;
}

public double getGrade(){
    return grade;
}

}



