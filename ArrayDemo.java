import java.util.Arrays;

public class ArrayDemo {


    public static void main(String[] args) {

/*
        int[] intArray=new int[10];

        double[] doubleArray=new double[10];

        String[] array=new String[10];

        char[] carr=new char[10];

        float[] floatArray=new float[10];


        System.out.println(Arrays.toString(intArray));

        System.out.println(Arrays.toString(doubleArray));
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(carr));

        System.out.println(Arrays.toString(floatArray));


        int[] arr={484,4,4,4,44,5};

        System.out.println(arr.length);


        int[] ints = Arrays.copyOf(arr, 20);

        System.out.println(ints.length);
        System.out.println(Arrays.toString(ints));

    */

//        int rows=4;
//
//        int cols=4;
//
//        int[][] array=new int[rows][cols];
//
//
//        int val=1;
//
//        for (int i = 0; i < rows; i++) {
//
//            for (int j = 0; j < cols; j++) {
//
//                array[i][j]=val;
//                val++;
//            }
//        }
//
//
//        System.out.println("displaying an two dimesional array ");
//
//
//        for (int i = 0; i <array.length ; i++) {
//
//            for (int j = 0; j < array[i].length; j++) {
//
//                System.out.print(array[i][j]+" ");
//            }
//
//            System.out.println();
//        }
//    }


        final int[] array = {1, 4, 5, 6, 7, 8};

        array[3] = 10;

        System.out.println(Arrays.toString(array));

    }
}
