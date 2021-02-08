package Interview_question_review;

public class CompileError {
    public static void main(String[] args) {
        int var1 = 15; 
        int var2 = 5; 
        int var3 = 0; 
        int ans1 = var1 / var2; 
  
        // This statement causes a runtime error, 
        // as 15 is getting divided by 0 here 
        int ans2 = var1 / var3; 
  
        System.out.println( 
            "Division of va1"
            + " by var2 is: "
            + ans1); 
        System.out.println( 
            "Division of va1"
            + " by var3 is: "
            + ans2); 


            int a = 40, b = 60; 
  
            // Declared variable Sum with Capital S 
            int Sum = a + b; 
      
            // Trying to call variable Sum 
            // with a small s ie. sum 
            System.out.println( 
                "Sum of variables is "
                // + sum); //Compile-Error
                + Sum); 
    }
}
