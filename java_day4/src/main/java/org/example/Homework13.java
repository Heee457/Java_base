package org.example;

public class Homework13 {
    public static void main(String[] args) {
        compare((byte)1,(byte)1);
        compare((short)1,(short)1);
        compare(1,1);
        compare(1L,1L);
    }
    public static boolean compare(byte a , byte b){
        System.out.println("byte");
        return a == b;
    }
    public static boolean compare(short a , short b){
        System.out.println("short");
        return a == b ;
    }
    public static boolean compare(int a , int b){
        System.out.println("int");
        return a == b ;
    }
    public static boolean compare(long a , long b) {
        System.out.println("long");
        return a == b;
    }
}
