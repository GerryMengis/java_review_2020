package DataStructure;

public class Arrays {
    public static void sum(int[] array2){
        int sum = 0;

        for (int i = 0; i < array2.length; i++) {
            sum += array2[i];
        }
        System.out.println("sum of arr2 = "+ sum);
    }

    public static void main(String[] args) {

        // one way of assign Array
        // one Dimensional Array
        int[] array1 = new int[3];
        array1[0] = 10;
        array1[1] = 30;
        array1[2] = 30;

        for (int i = 0; i < array1.length; i++) {
            System.out.println("element of arr1[" + i+"] = "+ array1[i]);
        }
        System.out.println("----------------------------");
        
        // other way of assign Array
        // one Dimensional Array
        int[] array2 = {10, 20, 30};
        for (int i = 0; i < array2.length; i++) {
            System.out.println("element of arr2[" + i+"] = "+ array2[i]);
        }
        System.out.println("----------------------------");

        // copy single dimensional Arrays
        int[] copy_array2 = array2.clone();
        for (int i = 0; i < copy_array2.length; i++) {
            System.out.println("element of copy_array2[" + i+"] = "+ copy_array2[i]);
        }
        array2[2] = 40;//cloning single dimensional Array doesn't get affected
        for (int i = 0; i < copy_array2.length; i++) {
            System.out.println("Updated element of copy_array2[" + i+"] = "+ copy_array2[i]);
        }
        System.out.println("----------------------------");

        // 2D-Dimensional Array
        int[][] array2D = {{1, 2, 3},{10, 20, 30}}; //2*3 dimensions
        System.out.println("2D Array size " + array2D.length);

        for (int i = 0; i < 2 /*array2D.length*/; i++) {
            for (int j = 0; j < 3 /*array2D.length*/; j++) {
                System.out.println("arry2D["+i+"]"+"["+j+"] = " + array2D[i][j]);
            }          
        } 
        System.out.println("----------------------------");

        // Cloning 2D array is a Shallow copy
        int[][] copyarry2D = array2D.clone();
        for (int i = 0; i < 2 /*arry2D.length*/; i++) {
            for (int j = 0; j < 3 /*arry2D.length*/; j++) {
                System.out.println("copyarry2D["+i+"]"+"["+j+"] = " + copyarry2D[i][j]);
            }          
        } 
        System.out.println("----------------------------");

        // now updating Arry2D
        array2D[0][2] = 4;
        array2D[1][2] = 40;
        for (int i = 0; i < 2 /*arry2D.length*/; i++) {
            for (int j = 0; j < 3 /*arry2D.length*/; j++) {
                System.out.println(" Updated arry2D["+i+"]"+"["+j+"] = " + array2D[i][j]);
            }          
        }
        System.out.println("----------------------------");

         // now check copyarry2D get Affected by changing arry2D 
         for (int i = 0; i < 2 /*arry2D.length*/; i++) {
            for (int j = 0; j < 3 /*arry2D.length*/; j++) {
                System.out.println("copyarry2D["+i+"]"+"["+j+"] = " + copyarry2D[i][j]);
            }          
        } 
        System.out.println("----------------------------");

        // passing array to method sum
        sum(array2);
        System.out.println("----------------------------");

        // // Array of object
        // Student[] stObj = new Student[3]; 

        // stObj[0] = new Student(1, "Gerry");
        // stObj[1] = new Student(2, "Sam");
        // stObj[2] = new Student(3, "Bob");
        // for (int i = 0; i < stObj.length; i++) {
        //     System.out.println("element of stObj[" + i+"] = "+ 
        //                             stObj[i].st_role + " " + stObj[i].st_name); 
        // }
        System.out.println("----------------------------");
        int a[][] = { { 1, 3, 4 }, { 3, 4, 5 } };
        int b[][] = { { 1, 3, 4 }, { 3, 4, 5 } };
        int c[][] = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] * b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}

class Student{
    public int st_role;
    public String st_name;

    Student(int role, String name){
        st_role = role;
        st_name = name;
    }
}