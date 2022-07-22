package org.example;

public class Homework04 {
    public static void main(String[] args) {
        getNumber();
    }

    public  static void getNumber(){
        int[] arr=new int[20];
        arr[0]=arr[1]=1;
        for (int i = 2; i <arr.length ; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println("The number of rabbits in the 20th month is "+ arr[19]);
    }
}
