class SalaryConversionSystem {
    public static void main(String[] args) {
        
        double sal = 59876.2596;

        int salInt = (int) sal;
        float salFloat = (float) sal;
        
        System.out.println("Original Salary in Double : " + sal);
        System.out.println("Salary in Float : " + salFloat);
        System.out.println("Precision Loss in Float   : " + (sal - salFloat));
        System.out.println("Salary in Integer : " + salInt);
        System.out.println("Precision Loss in Integer : " + (sal - salInt));
    }
}
