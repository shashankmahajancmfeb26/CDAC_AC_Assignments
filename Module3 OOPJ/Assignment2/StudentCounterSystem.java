class Student 
{
    String name;
    int rollNo;
    static int totalStudents = 0;

    Student(String name, int rollNo) 
    {
        this.name = name;
        this.rollNo = rollNo;
        totalStudents++;
    }

    public static void totalCount() {
        System.out.println("Total Students Count: " + totalStudents);
    }

    public void display() {
        System.out.println("Roll No: " + rollNo); 
        System.out.println("Name: " + name);
    }
}

class StudentCounterSystem {
    public static void main(String[] args) 
    {    
        Student s1 = new Student("Sanket", 101);
        Student s2 = new Student("Sumit", 102);
        Student s3 = new Student("Ishwar", 103);

        s1.display();
        s2.display();
        s3.display();
        
        Student.totalCount();
    }
}
