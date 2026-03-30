class Course {
    int courseId;
    String name;
    double fees;

    Course(int id, String name, double fees) {
        this.courseId = id;
        this.name = name;
        this.fees = fees;
    }
}

class Student {
    int studentId;
    String name;
    Course[] enrolledCourses;
    int count;

    Student(int id, String name) {
        this.studentId = id;
        this.name = name;
        this.enrolledCourses = new Course[5]; // Max 5 courses per student
        this.count = 0;
    }

    void enroll(Course c) {
        if (count < enrolledCourses.length) {
            enrolledCourses[count] = c;
            count++;
            System.out.println(name + " enrolled in " + c.name);
        } else {
            System.out.println("Enrollment limit reached....");
        }
    }

    void displayDetails() {
        double totalFees = 0;
        System.out.println("===========Student Enrollment Details==========");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + name);
        System.out.println("Courses Taken:");
        
        for (int i = 0; i < count; i++) {
            System.out.println((i+1)+ ". " + enrolledCourses[i].name + " (Fees: " + enrolledCourses[i].fees + ")");
            totalFees += enrolledCourses[i].fees;
        }
        System.out.println("Total Fees to Pay: " + totalFees);
    }
}

class CourseManagementSystem {
    public static void main(String[] args) {
        // 1. Create and Store Courses
        Course c1 = new Course(1, "Java", 5000);
        Course c2 = new Course(2, "Python", 4500);
        Course c3 = new Course(3, "Full Stack Development", 7000);
        
        int totalAvailableCourses = 3;
        System.out.println("Total Courses Available: " + totalAvailableCourses);

        Student s1 = new Student(101, "Shashank");
        Student s2 = new Student(102, "Kunal");

        s1.enroll(c1);
        s1.enroll(c3);
        
        s2.enroll(c2);

        s1.displayDetails();
        s2.displayDetails();
    }
}
