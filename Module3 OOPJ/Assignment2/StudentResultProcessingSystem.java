import java.util.Scanner;
class StudentResultProcessingSystem 
{
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Student Roll No.");
			int roll = sc.nextInt();
			System.out.println("Enter Student Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			int marks[] = new int[5];
			for(int i=0;i<5;i++)
			{
				System.out.println("Enter the marks of "+(i+1)+" Subject: ");
				marks[i]=sc.nextInt();
			}

			int totalmarks = 0;
			for(int mark : marks){
				totalmarks += mark;
			}

			double per = totalmarks/5;
			String grade;
			if(per>=90)
				grade = "A";
			else if (per>=75 && per<90)
				grade = "B";
			else if (per>=75 && per<90)
				grade = "C";
			else if (per>=75 && per<90)
				grade = "D";
			else 
				grade = "Fail";	

			String prom;
			if(grade=="A" || grade=="B" || grade=="B" || grade=="B")
				prom = "Student is Promoted";
			else
				prom = "Student is not Promoted";

			System.out.println("=============Result=================");
			System.out.println("Student's Name: " + name);
			System.out.println("Student's Roll Number: " + roll);
			System.out.println("Student's Total Marks: " + totalmarks);
			System.out.println("Student's Percentage: "+ per);
			System.out.println("Student's Grade: " + grade);
			System.out.println(prom);
			System.out.println("--------------------------");
		}
}