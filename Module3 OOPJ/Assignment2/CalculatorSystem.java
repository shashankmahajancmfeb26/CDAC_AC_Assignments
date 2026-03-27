class CalculatorSystem 
{
    int calculate(int a, int b) {
        return a + b;
    }

    double calculate(double a, double b) {
        return a + b;
    }

    int calculate(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        CalculatorSystem calc = new CalculatorSystem();

        int intsum = calc.calculate(14, 15);
        System.out.println("Addition of 2 integers: " + intsum);

        double doublesum = calc.calculate(26.3, 59.4);
        System.out.println("Addition of 2 doubles : " + doublesum);

        int sumint3 = calc.calculate(25, 5, 75);
        System.out.println("Addition of 3 integers : " + sumint3);
    }
}
