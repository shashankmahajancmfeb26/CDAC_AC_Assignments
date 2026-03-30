import java.util.Scanner;

class Student
{
    int roll;
    String name;
    int sub1, sub2, sub3;
    String mob, email;
    static int count = 0;
    int totalmarks;
    double average;

    Student()
    {

    }

    Student(int roll,String name, int sub1, int sub2, int sub3, String mob, String email)
    {
        this.roll = roll;
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.mob = mob;
        this.email = email;
        count++;
    }
    void calAverage(){
        totalmarks = this.sub1 + this.sub2 + this.sub3;
        average = totalmarks/3;
    }

    void display(){
        System.out.println("===============Student Report=================");
        System.out.println("Sudent's Roll No.: "+roll);
        System.out.println("Sudent's Name : "+name);
        System.out.println("Sudent's Mobile No.: "+mob);
        System.out.println("Sudent's Email ID : "+email);
        System.out.println("Sudent's Total Marks (out of 300): "+totalmarks);
        System.out.println("Sudent's Average Marks (out of 100): "+average);
        System.out.println("==============================================");
        System.out.println("Student Admitted: "+ count);
    }
}



class CollegeERP
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student(101,"Sumit",80,90,85,"9503867142","sumit@xyz.com");
        Student s2 = new Student(102,"Sanket",70,75,83,"9578945610","sanket@xyz.com");
        Student s3 = new Student(103,"pavan",55,74,92,"9876543210","pavan@xyz.com");
        s1.calAverage();
        s1.display();
        s2.calAverage();
        s2.display();
        s3.calAverage();
        s3.display();
    }
}