package org.example;

public class Homework12 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int a =1;
        int b=2;
        System.out.println("before exchange: ");
        print(arr);
        System.out.println("after exchange: ");
        print(arr);
    }

    public static void print(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i== arr.length-1 ? arr[i] : arr[i] + ",");
        }
        System.out.println("]");
    }

    public static void exchange(int[] arr,int a,int b){
        int temp=arr[b];
        arr[b]=arr[a];
        arr[a]=temp;
    }
}
