package capgemini;

import java.util.Scanner;

public class SingleArray {
    static void Method(int a[]){
        for (int i :a){
            System.out.println(i);
        }
    }

    static void method(){
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i=0;i<size;i++){
            System.out.println("Enter the elements in Array :");
            arr[i]=sc.nextInt();

        }
        System.out.println("The array elements is :");
        for (int i=0;i<arr.length;i++){

            System.out.println(arr[i]);
        }

    }



    public static void main(String[] args) {
        int a[] = new int[5];
        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;

        Method(a);
        method();


    }
}
