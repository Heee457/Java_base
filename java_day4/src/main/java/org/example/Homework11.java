package org.example;

public class Homework11 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        print(arr);
    }

    public static void print(int arr[]){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i== arr.length-1 ? arr[i] : arr[i] + ",");
        }
        System.out.print("]");
    }

}
