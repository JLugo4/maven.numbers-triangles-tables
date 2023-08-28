package com.github.curriculeon;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {

        String result = "";

        for (int i = start; i < stop; i++) {

            if(i % 2 == 0)

                result += i;

        }

        return result;

    }


    public static String getOddNumbers(int start, int stop) {

        String result = "";

        for (int i = start; i < stop; i++) {

            if(i % 2 == 1)

                result += i;

        }

        return result;
    }


    public static String getSquareNumbers(int start, int stop, int step) {

        String result = "";

        int currentNumber = start;

        while (currentNumber < stop){

            int square = currentNumber * currentNumber;

            result += square;

            currentNumber += step;
        }
        return result;
    }

    public static String getRange(int start) {

        String result = "";

        int currentNumber = 0;

        while (currentNumber < start){

            result += currentNumber;

            currentNumber += 1;

        }

        return result;

    }

    public static String getRange(int start, int stop) {

        String result = "";

        int currentNumber = start;

        while(currentNumber < stop) {

            result += currentNumber;

            currentNumber += 1;

            }

            return result;

    }


    public static String getRange(int start, int stop, int step) {

        String result = "";

        int currentNumber = start;

        while(currentNumber < stop) {

            result += currentNumber;

            currentNumber += step;

        }

        return result;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return null;
    }
}
