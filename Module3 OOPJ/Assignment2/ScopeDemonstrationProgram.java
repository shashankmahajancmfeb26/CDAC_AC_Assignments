class VariableScope {

    public void scopeExample() {
        int methodVar = 100;
        System.out.println("Method Variable Accessed: " + methodVar);

        for (int i = 1; i <= 1; i++) {
            int loopVar = 50;
            System.out.println("Loop variable accessed: " + loopVar);
            System.out.println("Loop index 'i' accessed: " + i);
        }
        // System.out.println(loopVar); // ERROR: Cannot access loopVar outside the loop
        // System.out.println(i);       // ERROR: Cannot access loop index outside the loop    
        
        {
            int blockVar = 25;
            System.out.println("Block variable accessed: " + blockVar);
            System.out.println("Method variable still accessible here: " + methodVar);

            // System.out.println(blockVar); // ERROR: Cannot access blockVar outside this block
        }
    }
}

class ScopeDemonstrationProgram
{
    public static void main(String[] args) {
        VariableScope d = new VariableScope();
        d.scopeExample();

        // System.out.println(methodVar); // ERROR: Cannot access methodVar outside its method
    }
}
