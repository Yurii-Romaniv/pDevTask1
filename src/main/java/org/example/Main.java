package org.example;


import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        String[] words = {"ard", "aef", "erf", "fews", "aef", "erf", "qwer" , "tyuio", "pas", "dfgh"};
        System.out.println("Hello world!");

        Character[] charapters = myLib.GetChars(words);


        for(int i=0 ; i< charapters.length; i++) {
            System.out.println(charapters[i]);
        }

    }
}