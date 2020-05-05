package edu.aqa.lesson3.firsttask;
import java.util.Random;
/* Написать программу выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру*/
public class MaxValue {
    public static int generateNumber(){
        return new Random().nextInt(899) + 100;
    }

    public static int[] parse(int number){
        int[] arrayOfNumbers = new int [3];
        for (int i = 0; i < 3; i++){
            arrayOfNumbers[i] = number % 10;
            number = number / 10;
        }
        return  arrayOfNumbers;
    }

    public static int maxValue (int [] array){
        int max = 0;
        for (int i = 0; i < 3; i++){
            if (array[i] > max) {
                max = array[i];
            }
        }
        return  max;
    }

    public static void main(String[] args) {
        int number = generateNumber();
        System.out.println("Value = " + number);
        int max;
        max = maxValue(parse(number));
        System.out.println("maxValue = " + max);
    }
}
