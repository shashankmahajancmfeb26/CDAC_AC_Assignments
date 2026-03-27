import java.util.Scanner;

class StudentMarksTable 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] marks = new int[3][3];
        String[] subjects = {"Maths", "Science", "English"};

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        System.out.println("---------------------------------------------------------------------");
        System.out.println("Student"+"\t\tMaths"+"\tScience"+"\tEnglish"+"\tTotal"+"\tAverage");
        System.out.println("------------------------------------------------------------------");

        for (int i = 0; i < 3; i++) 
        {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            int average = total / 3;

            System.out.println("Student "+(i + 1)+"\t"+marks[i][0]+"\t"+marks[i][1]+"\t"+marks[i][2]+"\t"+total+"\t"+average);
        }
        System.out.println("-------------------------------------------------------------");
    }
}
