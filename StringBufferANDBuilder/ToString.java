package StringBufferANDBuilder;

class Student {
    int rollno;
    String name;
    String city;

    public Student(int rollno, String name, String city) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }

    public String toString() {
        return rollno + " " + name + " " + city;
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    // Check palindrome
    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();
        if (str.equals(rev)) {
            return true;
        } else {
            return false;
        }
    }
}

public class ToString {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Bayarea", "San Franco");
        Student s2 = new Student(102, "estbay", "Okland");

        System.out.println(s1.toString());
        System.out.println(s2);

        // reverse() string using StringBUffer
        System.out.println(Student.reverseString("Gerry"));
        
        // Check palindrome
        System.out.println(Student.isPalindrome("nitin"));
        System.out.println(Student.isPalindrome("jatin"));
    }
}