package edu.aqa.lesson3.firsttask;
import edu.aqa.lesson3.firsttask.Manipulator;
import java.util.Random;
/* Написать программу выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру*/
public class MaxValue {
    public static void main(String[] args) {
        int max;
        int number;

        Manipulator manipulator = new Manipulator();
        number = Manipulator.generateNumber();
        System.out.println("Value = " + number);
        max = Manipulator.maxValue(Manipulator.parse(number));
        System.out.println("maxValue = " + max);
    }
}
