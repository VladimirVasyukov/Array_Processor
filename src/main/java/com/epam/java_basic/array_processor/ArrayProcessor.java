package com.epam.java_basic.array_processor;


import java.util.Arrays;

/**
 * Useful methods for array processing
 */
public class ArrayProcessor {


    // Task №1. Exchange max negative and min positive elements:

    public int[] swapMaxNegativeAndMinPositiveElements(int[] originalArray) {
        int[] resultArray = originalArray.clone();
        int maxNegative = Integer.MIN_VALUE;
        int minPositive = Integer.MAX_VALUE;
        int positive = 0;
        int negative = 0;

        for (int i = 0; i < originalArray.length; i++) {
            if ((originalArray[i] < 0) && (maxNegative < originalArray[i])) {
                maxNegative = originalArray[i];
                negative = i;
            }
            if ((originalArray[i] > 0) && (minPositive > originalArray[i])) {
                minPositive = originalArray[i];
                positive = i;
            }
        }
        resultArray[negative] = originalArray[positive];
        resultArray[positive] = originalArray[negative];

        return resultArray;
    }


    // Task №2. Sum of elements on even positions:

    public int countSumOfElementsOnEvenPositions(int[] originalArray) {

        final int HALF = 2;
        int sum = 0;
        for (int i = 0; i < originalArray.length; i++) {
            if (i % HALF == 0) {
                sum += originalArray[i];
            }
        }
        return sum;
    }


    // Task №3. Replace negative values with 0:

    public int[] replaceEachNegativeElementsWithZero(int[] originalArray) {
        int[] resultArray = originalArray.clone();
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] < 0) {
                resultArray[i] = 0;
            }
        }
        return resultArray;
    }


    // Task №4. Multiply by 3 each positive element standing before negative one:

    public int[] multiplyByThreeEachPositiveElementStandingBeforeNegative(int[] originalArray) {
        int[] resultArray = originalArray.clone();
        final int MULTIPLY_THIRD = 3;
        for (int i = 1; i < originalArray.length; i++) {
            if (resultArray[i] < 0 && resultArray[i - 1] > 0)
                resultArray[i - 1] *= MULTIPLY_THIRD;
        }
        return resultArray;
    }


    // Task №5. Difference between average and min element in array:

    public float calculateDifferenceBetweenAverageAndMinElement(int[] originalArray) {

        float average;
        float sum = 0;
        float difference;
        for (int k : originalArray) {
            sum += k;
        }
        average = sum / originalArray.length;

        int min = originalArray[0];
        for (int i : originalArray) {
            if (i < min) {
                min = i;
            }
        }
        difference = average - min;
        return difference;
    }


    // Task №6. Elements which present more than one time and stay on odd index:

    public int[] findSameElementsStandingOnOddPositions(int[] originalArray) {
        int inputArrayLength = originalArray.length;
        int[] sameElementsOnOddPositionsArray = new int[inputArrayLength / 2];
        boolean inSameElementsOnOddPositionsArray;
        int inSameElementsOnOddPositionsArrayIndex = 0;
        int inSameElementsOnOddPositionsArrayLength = 0;
        for (int i = 0; i < inputArrayLength - 1; i++) {
            inSameElementsOnOddPositionsArray = false;

            for (int j = 0; j < inSameElementsOnOddPositionsArrayLength; j++) {
                if (originalArray[i] == sameElementsOnOddPositionsArray[j]) {
                    inSameElementsOnOddPositionsArray = true;
                    break;
                }
            }
            if (inSameElementsOnOddPositionsArray) {
                continue;
            }
            for (int j = i + 1; j < inputArrayLength; j++) {
                if (originalArray[i] == originalArray[j] && (i % 2 != 0 || j % 2 != 0)) {
                    sameElementsOnOddPositionsArray[inSameElementsOnOddPositionsArrayIndex] = originalArray[i];
                    inSameElementsOnOddPositionsArrayIndex++;
                    inSameElementsOnOddPositionsArrayLength++;
                    break;
                }
            }

        }
        return Arrays.copyOf(sameElementsOnOddPositionsArray, inSameElementsOnOddPositionsArrayLength);
    }
}
