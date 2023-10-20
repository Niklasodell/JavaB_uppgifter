package com.niklas.demo.lektion_1.uppgift_2;

public class Counter {

    static int countValue;

    public void counter() {
        System.out.println(countValue);
        countValue++;
        System.out.println(countValue);
    }
    public void counterStatic() {
        System.out.println(countValue);
        countValue++;
        System.out.println(countValue);
    }

}
