import java.util.Scanner;

class WeeklyWorkHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] workHrs = new int[3][];

        for (int i = 0; i < workHrs.length; i++) {
            System.out.print("Enter Number of days worked by Employee "+(i+1)+": ");
            int days = sc.nextInt();
            
            workHrs[i] = new int[days];
            for (int j = 0; j < days; j++) {
                System.out.print("  Hours for Day " + (j+1) + ": ");
                workHrs[i][j] = sc.nextInt();
            }
        }

        System.out.println("==========Employee Work Hours==========");
        for (int i = 0; i < workHrs.length; i++) {
            int totalHrs = 0;
            System.out.print("Employee "+ (i+1) + " - " +workHrs[i].length+ " days: ");
            for (int j = 0; j < workHrs[i].length; j++) {
                System.out.print(workHrs[i][j] + "hrs ");
                totalHrs += workHrs[i][j];
            }
            System.out.println("| Total: " + totalHrs + " hours");
        }
    }
}
