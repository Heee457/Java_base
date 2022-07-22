package org.example;
import java.util.Random;
public class Homework10 {
    public static void main(String[] args) {
        int[] arr=new int[6];
        grade(arr);
        print(arr);
        int avg=average(arr);
        System.out.println("result: "+ avg);
    }
    public static void print(int [] arr){
        System.out.print("score: [");
        for(int i = 0;i < arr.length;i++){
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }
    public static void grade(int [] arr){
        Random  random = new Random();
        for(int i = 0; i < arr.length;i++){
            arr[i] = random.nextInt(101);
        }
    }
    public static int average(int [] arr){
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for(int i = 0;i < arr.length;i++){
            int data = arr[i];
            if(data > max) max = data;
            if(data < min) min = data;

            sum += data;
        }
        int avg = (sum - max - min)/(arr.length - 2);
        return avg;
    }
}
