package org.example;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {
        int[] arr={19,28,37,46,50};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter int: ");
        int a=sc.nextInt();
        int dataIndex=getDataIndex(arr,a);
        System.out.println(dataIndex);
    }

    public  static  int getDataIndex(int[] arr,int a){
        for (int i = 0; i < arr.length; i++) {
            if(a==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
