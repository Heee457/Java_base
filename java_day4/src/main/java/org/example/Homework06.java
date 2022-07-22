package org.example;

public class Homework06 {
    public static void main(String[] args) {
        int arr[]={68,27,95,88,171,996,51,210};
        int sum=sum(arr);
        System.out.println("result: "+sum);
    }

    public static int sum(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            int data=arr[i];
            if(data%10!=7 && data/10%10 !=7 && data%2==0) {
                sum += data;
            }
        }
        return sum;
    }
}
