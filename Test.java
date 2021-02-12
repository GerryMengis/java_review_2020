import java.util.regex.*;
// import java.util.regex.Matcher;

public class Test {
    public static void main(String[] args) {

        // regax macher and pattern
        Pattern p = Pattern.compile("..xx..");
        Matcher m = p.matcher("SZxxZZ");
        System.out.println(m.matches()); //true

        System.out.println("Regex charctor class ");
        System.out.println(Pattern.matches("[xyz]", "abc")); // false
        System.out.println(Pattern.matches("[vxyz]", "x")); // true
        System.out.println(Pattern.matches("[xyz]", "xz")); //false
        System.out.println(Pattern.matches("[abxyzc]", "ac")); // false
        System.out.println(Pattern.matches("[xyabcz]", "abc")); //false

        // Regex quantifiers
        System.out.println("Regex quantifiers");
        System.out.println("? quantifiers");
        System.out.println(Pattern.matches("[xyz]?", "x")); // false
        System.out.println(Pattern.matches("[vxyz]?", "xxxxy")); // true
        System.out.println(Pattern.matches("[xyz]?", "xz")); //false
 
        System.out.println("+ quantifiers");
        System.out.println(Pattern.matches("[xyz]+", "x")); // true
        System.out.println(Pattern.matches("[vxyz]+", "xxxxy")); // true
        System.out.println(Pattern.matches("[xyz]+", "xyyzzz")); //true
        System.out.println(Pattern.matches("[abxyzc]+", "acmnta")); // false

        System.out.println("* quantifiers");
        System.out.println(Pattern.matches("[xyabcz]*", "abc")); //false

        System.out.println("{n} quantifiers");
        System.out.println(Pattern.matches("[xyabcz]{2}", "xx")); //true
        System.out.println(Pattern.matches("[xyabcz]{2}", "xy")); //true
        System.out.println(Pattern.matches("[xyabcz]{2}", "xyab")); //true




    }
    
}
