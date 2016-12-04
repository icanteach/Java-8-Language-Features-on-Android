package co.icanteach.java8languagefeatures;


public interface Mathematica {

    int add(int a, int b);

    default int multiply(int a, int b) {
        return a * b;
    }

    static int minus(int a, int b) {
        return a - b;
    }
}
