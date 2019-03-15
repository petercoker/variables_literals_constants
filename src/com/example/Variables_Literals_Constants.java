package com.example;

public class Variables_Literals_Constants {

    public static void main(String[] args) {

      //int fNum;
        final int fNum; //Makes the variable unchange able
        int sNum;
        double average;

        fNum = 11;
        sNum = 20;

        average = (double) (fNum + sNum) / 2; //casting to double

        System.out.println("Average: " + average);

        String fname = "Peter";
        String surname = "Coker";

        System.out.println(fname + " "+ surname);

        boolean value;
        value = false;

        System.out.println(value);

        char letter, num;
        letter = 'j';
        num = '1';

        System.out.println(letter);
        System.out.println(num);


    }

}
