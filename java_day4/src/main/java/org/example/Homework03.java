package org.example;

public class Homework03 {
    public static void main(String[] args) {
        doGame();
    }
    public static void doGame(){
        for (int i = 1; i <=20 ; i++) {
            if(i%7==0 || i%10 == 7 || i/10==7){
                System.out.println("number "+i+" pass");
            }
        }
    }
}
