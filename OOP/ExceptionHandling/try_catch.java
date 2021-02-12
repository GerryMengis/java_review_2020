package OOP.ExceptionHandling;

public class try_catch {
    public static void main(String[] args) {
        
        // ArithmeticException
        System.out.println("printing ...try-catch exception handling");
        try{
            int data = 100 / 0;
            System.out.println(data);
        } catch (ArithmeticException e) {
            System.out.println("Error excuting due to " + e);
        }
        
       try{
           String s = null;
           System.out.println(s.length());
       } catch (NullPointerException e) {
           System.out.println("Error excuting due to " + e);
       }
       
       try{
           int a[] = new int[5];
           a[5] = 3;
       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Error excuting due to " + e);
       }

        // Multiple try-catch
        try{
            int data = 100 / 0;
            System.out.println(data);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        }catch(ArrayIndexOutOfBoundsException e)  
        {  
         System.out.println("ArrayIndexOutOfBounds Exception occurs");  
        }    
        catch(Exception e)  
        {  
         System.out.println("Parent Exception occurs");  
        }             
        
       System.out.println("rest code of the program");
    }
    
}
