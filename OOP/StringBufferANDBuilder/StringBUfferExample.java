package OOP.StringBufferANDBuilder;

public class StringBUfferExample {
    public static void main(String[] args) {

        String s = new String("Hello");
        String s1 = new String("Hello Jave");
        System.out.println(s.equals(s1));

        // append()
        StringBuffer strbuffer = new StringBuffer("Hello");
         // capacity()
        System.out.println(strbuffer.capacity());     
        strbuffer.append("Java");
        System.out.println(strbuffer);
        // inser()
        strbuffer.insert(5, "c++");
        System.out.println(strbuffer);
        // replace()
        strbuffer.replace(5, 8, "python");
        System.out.println(strbuffer);
        // delete()
        strbuffer.delete(5, 11);
        System.out.println(strbuffer);
        // reverse()
        strbuffer.reverse();
        System.out.println(strbuffer);

        // reverse()
        strbuffer.reverse();   
        // append()
        strbuffer.append(" ,this is my favourite language ");
        System.out.println(strbuffer);
        System.out.println(strbuffer.capacity());

        //Java Program to demonstrate the performance of StringBuffer and StringBuilder classes.  
        long startTime = System.currentTimeMillis();  
        StringBuffer sb = new StringBuffer("Java");  
        for (int i=0; i<10000; i++){  
            sb.append("Tpoint");  
        }  
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
        startTime = System.currentTimeMillis();  
        StringBuilder sb2 = new StringBuilder("Java");  
        for (int i=0; i<10000; i++){  
            sb2.append("Tpoint");  
        }  
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  

        // String vs StringBuffer Hashcode Test
        System.out.println("Hashcode test of String:");  
        String str="java";  
        System.out.println(str.hashCode());  
        str=str+"tpoint";  
        System.out.println(str.hashCode());  
   
        System.out.println("Hashcode test of StringBuffer:");  
        StringBuffer strb=new StringBuffer("java");  
        System.out.println(strb.hashCode());  
        strb.append("tpoint");  
        System.out.println(strb.hashCode());  
        
    }
}
