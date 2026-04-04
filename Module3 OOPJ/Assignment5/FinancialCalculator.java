import java.util.*;

class Calculator
{
    static <T extends Number> void process(String label, List<T> data) 
    {
        double sum = 0.0;
        
        for (T value : data) {
            sum += value.doubleValue();
        }

        double average = data.isEmpty() ? 0.0 : sum/data.size();

        System.out.println("======== " + label + " ========");
        System.out.println("Total Sum: "+ sum);
        System.out.println("Average: "+ average);
    }
}


class FinancialCalculator
{
    public static void main(String[] args)
    {
        
        List<Integer> transaction = Arrays.asList(1500, 1000, 500, 2000);
        Calculator.process("Transaction Report", transaction);

        List<Double> salary = Arrays.asList(4500.0, 5000.0, 4000.0);
        Calculator.process("Payroll Summary", salary);
    }
}
