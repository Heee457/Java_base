package org.example;

public class Homework09 {
    public static void main(String[] args) {
        int[] arr={19,28,37,46,50};
        System.out.print("before reverse: ");
        print(arr);

        reverse(arr);
        System.out.print("after reverse: ");
        print(arr);
    }

    public static void print(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++){
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        System.out.println("]");
    }

    public static int[] reverse(int[] arr){
        for (int i = 0,j=arr.length-1; i<j ; i++,j--) {
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}
