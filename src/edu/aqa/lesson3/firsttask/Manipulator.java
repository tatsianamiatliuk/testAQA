package edu.aqa.lesson3.firsttask;

import java.util.Random;

public class Manipulator {
    static int generateNumber(){
        return new Random().nextInt(899) + 100;
    }

    static int[] parse(int number){
        int[] arrayOfNumbers = new int [3];
        for (int i = 0; i < 3; i++){
            arrayOfNumbers[i] = number % 10;
            number = number / 10;
        }
        return  arrayOfNumbers;
    }

    static int maxValue(int[] array){
        int max = 0;
        for (int i = 0; i < 3; i++){
            if (array[i] > max) {
                max = array[i];
            }
        }
        return  max;
    }
}
