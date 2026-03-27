import java.util.Scanner;

class DailyExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] expense = new double[7];
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter expense for Day " + (i+1) + ": ");
            expense[i] = sc.nextInt();
        }

        double total = 0;
        double max = expense[0];
        double min = expense[0];
        int maxDayIndex = 0;

        for (int i = 0; i < expense.length; i++) {
            total += expense[i];

            if (expense[i] > max) {
                max = expense[i];
                maxDayIndex = i;
            }
            if (expense[i] < min) {
                min = expense[i];
            }
        }

        double average = total / 7;

        System.out.println("============Expense Report============");
        System.out.println("Total Weekly Expense: " + total);
        System.out.println("Average Daily Expense: " + average);
        System.out.println("Highest Expense: " + max);
        System.out.println("Lowest Expense: " + min);
        System.out.println("Highest Expense: " + max + " on " + days[maxDayIndex]);
    }
}
