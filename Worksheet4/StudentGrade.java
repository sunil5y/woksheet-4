import java.util.Scanner; 
// define a class StudentGrade
public class StudentGrade {
    //initializes the variable with appropriate datatypes
    String name;
    int studentId;
    int level;
    Scanner sc;
    //define a method with three parameters
    public StudentGrade(String s1, int s2, int s3){
        this.name = s1;
        this.studentId = s2;
        this.level = s3;
    }
    // define method getname and it returns name
    public String getName(){
        return name;
    }
    // define method getStudent and it return student Id
    public int getStudentId(){
        return studentId;
    }
    // define method getlevel and it returns level of student
    public int getLevel(){
        return level;
    }
    // illustrate method average
    public double average(){
        // create an object of scanner class
        Scanner sc = new Scanner(System.in);
        // print the first mark of student
        System.out.println("Enter the first mark:");
        double m1 = sc.nextDouble();
        //display the second mark of student
        System.out.println("Enter the second mark:");
        double m2 = sc.nextDouble();
        //display the third mark of student 
        System.out.println("Enter the third mark:");
        double m3 = sc.nextDouble();
        //display the fourth mark of stutent
        System.out.println("Enter the fourth mark:");
        double m4 = sc.nextDouble();
        // display the fifth mark of student
        System.out.println("Enter the fifth mark:");
        double m5 = sc.nextDouble();
        // find out the average of five marks 
        double average = (m1+m2+m3+m4+m5)/5;
        sc.close();
        return average;// it return average value after calculation
        
    }
    //illustrate main method
   
    public static void main(String[] str){
        // create an object of new scanner class
        Scanner sc = new Scanner(System.in);
       // display the name of student after enter
        System.out.print("Enter Name of Student: ");
        String name = sc.nextLine();
        // display the studentid
        System.out.print("Enter the StudentID: ");
        int studentId = sc.nextInt();
        // display the level of student
        System.out.print("Enter the Student Level: ");
        int level = sc.nextInt();
        // create an object sg with three parameters
        StudentGrade sg = new StudentGrade(name, studentId, level);
        String names = sg.getName();
        int id = sg.getStudentId();
        int levels = sg.getLevel();
        // call method to get average
        double averages = sg.average();
        sc.close();
        //display the name, id, levels and average
        System.out.println(names+" is reading in "+levels+" have student id "+id+" has scored "+averages+".");
    }
    
}
