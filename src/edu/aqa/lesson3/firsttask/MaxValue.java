package edu.aqa.lesson3.firsttask;

public class MaxValue {
    public static void main(String[] args) {
        int number = (new java.util.Random()).nextInt(1000);
        int addParameter, maxValue = 0;
        System.out.println("Generated value = " + number);
        while (number > 0) {
            addParameter = number % 10;
            number = number / 10;
            if (maxValue < addParameter) maxValue = addParameter;
        }
        System.out.println("maxValue = " + maxValue);
    }
}
