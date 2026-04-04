class Report
{
    static <T> void display(String title, T[] data)
    {
        System.out.println("======= "+ title + " ======");
        if (data == null || data.length == 0)
        {
            System.out.println("No data available.");
        } 
        else 
        {
            for (T item : data) 
            {
                System.out.println(item);
            }
        }
        System.out.println();
    }
}
class ReportGenerator 
{
    public static void main(String[] args)
    {
        Double[] sales = { 1500.0, 3500.0, 4500.0, 6000.0 };
        Report.display("Sales Report", sales);

        String[] emp = { "Sanket", "Saurabh", "Shreya" };
        Report.display("Employee Details", emp);

        Integer[] prodid = {101, 102, 103, 104, 105};
        Report.display("Product IDs", prodid);
    }
}
