package com.javaleson.hello;

public class Main {
    public static void main(String[] args) {
        byte b = 10;
        short c = 200;
        int a = b + 23;
        long myLongValue = 123_456_789_876L;
        float myFloatValue = 23.56f;
        double muDoubleValue = 56.45d;
        double sum = a + b + c + myLongValue + muDoubleValue + myFloatValue;

        System.out.println("Sum " + sum);


        float floatResult = myFloatValue / 3;
        System.out.println("floatResult = " + floatResult);
        double myNewDouble = 23.56;

        System.out.println("myDoubleResult = " + myNewDouble / 3);

        char char1 = 'A';
        char char2 = 'b';
        char char3 = '\n';
        char char4 = '^';
        char char5 = '\u00B6';

        System.out.println("char1 = " + char1);
        System.out.println("char2 = " + char2);
        System.out.println("char3 = " + char3);
        System.out.println("char4 = " + char4);
        System.out.println("char5 = " + char5);

        System.out.println("SUM CHARS = ");
        System.out.println(char1 + char2 + char3 + char4 + char5);

        System.out.println("byte b = " + b);
        System.out.println("int c = " + c);
        System.out.println("short a = " + a);
        System.out.println("myLongValue = " + myLongValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("muDoubleValue = " + muDoubleValue);

        boolean b1 = true;
        boolean b2 = false;

        String s = "some string" + " some other string";
        System.out.println(s);

        short someShort = b;
        int someInt = someShort;


        System.out.println("Someshort " + someShort);


        System.out.println("myLongValue = " + myLongValue);
        someInt = (int) myLongValue;
        System.out.println("someInt = " + someInt);

        double someDouble = myFloatValue;
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("someDouble = " + someDouble);

        double someIntToDOuble = someInt;
        System.out.println("someIntToDOuble = "+someIntToDOuble);


    }
}