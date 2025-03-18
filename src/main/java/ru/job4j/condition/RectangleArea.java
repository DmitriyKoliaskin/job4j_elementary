package ru.job4j.condition;

public class RectangleArea {
    public static double square(int p, double k) {
        double b = p / (2.0 * (k + 1));
        double a = k * b;
        return a * b;
    }

    public static void main(String[] args) {
        double result = RectangleArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result);
    }
}
