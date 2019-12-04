package com.lomaevaav;

public class Main {

    public static void main(String[] args) {
	    int i = 15;
	    byte by = 107;
	    short s = 15000;
	    long lo = 35000021151515L;
	    float f = 5.223225F;
	    double dou = 75.54556146;
	    char ch ='h';
	    boolean bo = false;

        int a = 2, b = 7,c = 10, d = 5;

        int fe=calculate(a, b, c, d);
        System.out.println(fe);
        boolean resultCheck=check(10,5);
        System.out.println(resultCheck);
        boolean resultCheck2=check(10,15);
        System.out.println(resultCheck2);
        valueNumber(15);
        boolean min=trueMinus(-7);
        System.out.println(min);
        nameResult("учитель");


    }
    public static int calculate(int a, int b, int c, int d){
        int e = a * (b + (c / d));
        return e;
    }
    public static boolean check(int a, int b){
        int c=a+b;
        if (c>=10 && c<=20)
            return true;
        else return false;

    }
    public static void valueNumber(int n) {

        if (n>=0)
            System.out.println("положительное");
        else System.out.println("отрицательное");
    }
    public static boolean trueMinus(int a) {
        if (a<0)
           return true;
        else return false;

    }
    public static void nameResult(String name){
        System.out.println("Привет,"+ name+"!");
    }
}
