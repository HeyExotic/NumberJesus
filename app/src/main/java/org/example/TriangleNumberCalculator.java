package org.example;

public class TriangleNumberCalculator {

   
    public int value(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be a positive integer.");
        }
        return n * (n + 1) / 2; 
    }


    public int add(int n, int m) {
        return value(n) + value(m);
    }


    public int subtract(int n, int m) {
        return value(n) - value(m); 
    }
}