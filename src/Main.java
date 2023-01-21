import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int [] array1 = new int [3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        double [] array2 = {1.57, 7.654, 9.986};

        char [] array3 = {'a', 'b', 'c', 'd', 'e'};
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int [] array1 = new int [3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        double [] array2 = {1.57, 7.654, 9.986};

        char [] array3 = {'a', 'b', 'c', 'd', 'e'};

        int i;
        for (i=0; i<array1.length; i++){

            if (i<array1.length-1){
                System.out.print(array1[i]+", ");
            } else {
                System.out.print(array1[i]);
                System.out.println();
            }
        }

        for (i=0; i<array2.length; i++){

            if (i<array2.length-1){
                System.out.print(array2[i]+", ");
            } else {
                System.out.print(array2[i]);
                System.out.println();
            }
        }

        for (i=0; i<array3.length; i++){

            if (i<array3.length-1){
                System.out.print(array3[i]+", ");
            } else {
                System.out.print(array3[i]);
                System.out.println();
            }
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int [] array1 = new int [3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        double [] array2 = {1.57, 7.654, 9.986};

        char [] array3 = {'a', 'b', 'c', 'd', 'e'};

        int i;
        for (i=array1.length-1; i>=0;  i--){

            if (i>0){
                System.out.print(array1[i]+", ");
            } else {
                System.out.print(array1[i]);
                System.out.println();
            }
        }

        for (i=array2.length-1; i>=0;  i--){

            if (i>0){
                System.out.print(array2[i]+", ");
            } else {
                System.out.print(array2[i]);
                System.out.println();
            }
        }

        for (i=array3.length-1; i>=0;  i--){

            if (i>0){
                System.out.print(array3[i]+", ");
            } else {
                System.out.print(array3[i]);
                System.out.println();
            }
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int [] array1 = new int [3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        for(int i=0; i<array1.length; i++){
            if (array1[i] % 2 > 0){
                array1[i]++;
            }
        }

        System.out.println(Arrays.toString(array1));
    }
}