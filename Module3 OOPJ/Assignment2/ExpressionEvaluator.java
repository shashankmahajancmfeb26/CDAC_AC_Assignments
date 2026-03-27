import java.util.Scanner;

class ExpressionEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        int a = sc.nextInt();
        System.out.print("Enter value for b: ");
        int b = sc.nextInt();
        System.out.print("Enter value for c: ");
        int c = sc.nextInt();

        // (a + b) * c
        int res1 = (a + b) * c;
        System.out.println("Result of (a + b) * c: " + res1);
        System.out.println("Explanation: First Addition inside brackets will take place and then multiplication.");

        // a > b && b > c
        boolean res2 = (a > b) && (b > c);
        System.out.println("Result of a > b && b > c: " + res2);
        System.out.println("Explanation: Returns true only if Both conditions are satidfies.");

        // 3. a % b
        int res3 = a % b;
        System.out.println("Result of a % b: " + res3);
        System.out.println("Explanation: It Gives the Remainder after division.");
    }
}
