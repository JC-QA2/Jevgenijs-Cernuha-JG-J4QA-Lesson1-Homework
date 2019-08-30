package lv.javaguru.lessons.lesson1.homework;

public class NumberSquared {
    static int square(int a) {
        int result = a * a;
        return result;
    }

    public static void main(String[] args) {
        int squaredNumber = square(10);
        System.out.println("\nResult = " + squaredNumber);

    }
}
