package org.example;

public class Homework01 {

        public static void main(String[] args) {
            int max=getMax(10,12,13);
            System.out.println(max);
        }
        public static int getMax(int a ,int b ,int c){
            int max=a;
            if(b>max){
                max=b;
            }
            if(c>max){
                max=c;
            }
            return max;
        }
    }

