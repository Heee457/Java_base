package org.example;

public class Homework02 {
    public static void main(String[] args) {
        double num1=1;
        double num2=-1;

        double abs1=getnum(num1);
        double abs2=getnum(num2);

        System.out.println(abs1);
        System.out.println(abs2);
    }

    public static double getnum(double num){
        if(num>=0){
            return num;
        } else {
            return num*-1;
        }
    }
}
