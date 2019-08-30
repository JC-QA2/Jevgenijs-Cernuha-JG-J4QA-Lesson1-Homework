package lv.javaguru.lessons.lesson1.homework;

import java.util.Random;

public class RandomNumberServiceTest {

    public static void main(String[] args) {
        Random randomGenerator = new Random();

        int firstRandomNumber = randomGenerator.nextInt(100);
        System.out.println("\nRandom Number 1 = " + firstRandomNumber);

        int secondRandomNumber = randomGenerator.nextInt(100);
        System.out.println("\nRandom Number 2 = " + secondRandomNumber);

        int thirdRandomNumber = randomGenerator.nextInt(100);
        System.out.println("\nRandom Number 3 = " + thirdRandomNumber);

        int sum = firstRandomNumber + secondRandomNumber + thirdRandomNumber;
        System.out.println("\nTotal Sum of Numbers = " + sum);

    }

}
