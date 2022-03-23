package capgemini;

import java.util.Scanner;

public class ProblemArray {
    static int size;
    static int findAverage(int arr[]){

        int sum = 0;
        for (int i : arr){
            sum = sum + arr[i];
        }
        int avg = sum/size;
        System.out.println("Average is :"+avg);
        return avg;
    }


    static  int[]  getArrayValues(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter number of values :");
        int size = sc.nextInt();
        System.out.println("Enter"+size+" the values :");
        int arr[] = new int[size];
        for (int i=0;i<size;i++) {
            System.out.println("Enter");
            arr[i] = sc.nextInt();
        }
        System.out.println("The array elements is :");
        for (int i=0;i<arr.length;i++){

            System.out.println(arr[i]);
        }
        return arr;
    }



    public static void main(String[] args) {
        int[] arr = getArrayValues();
        findAverage(arr);





    }
}
