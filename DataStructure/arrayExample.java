package DataStructure;

// Array of Object
class Student
{
	int rollno, Age;
	String name;
	Student(int rollno, String name, int age)
	{
        this.rollno = rollno;
        this.Age = age;
		this.name = name;
	}
}

public class arrayExample {

    public static void main(String[] args) {

        int[] a = { 1, 2, 3 };
        try {
        a[3] = 5;
        System.out.println(a[3]);
        } catch (RuntimeException e) {
        System.out.println("error IndexOutOfBounds");

        }
        for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
        }

        // Add to empty array
        int b[] = new int[4];
        b[0] = 1;
        b[1] = 2;
        b[2] = 3;

        try {
        b[3] = 5;
        } catch (RuntimeException e) {
        System.out.println("error");

        }
        for (int i = 0; i < b.length; i++) {
        System.out.println(b[i]);
        }
        // Array of Object
        Student[] arr = new Student[3];
        arr[0] = new Student(101, "dha", 25);
        arr[1] = new Student(102, "hjsd", 30);
        arr[2] = new Student(103, "yewyi", 37);

        // System.out.println(arr[2]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].rollno + " " + arr[i].name + " " + arr[i].Age);

        }

    }

}

