package com.epam.java_basic.array_processor;

public class ArrayView {
    protected static final String ORIGINAL_ARRAY = "Original Array";
    // Description of ArrayProcessor methods
    protected static final String SWAP_MAX_NEGATIVE_AND_MIN_POSITIVE_ELEMENTS = "1) Exchange max negative and min positive elements:";
    protected static final String COUNT_SUM_OF_ELEMENTS_ON_EVEN_POSITIONS = "2) Sum of elements on even positions:";
    protected static final String REPLACE_EACH_NEGATIVE_ELEMENTS_WITH_ZERO = "3) Replace negative values with 0";
    protected static final String MULTIPLY_BY_THREE_EACH_POSITIVE_ELEMENT_STANDIN_GBEFORE_NEGATIVE = "4) Multiply by 3 each positive element " +
            "standing before negative one";
    protected static final String CALCULATE_DIFFERENCE_BETWEEN_AVERAGE_AND_MIN_ELEMENT = "5) Difference between average and min element in array:";
    protected static final String FIND_SAME_ELEMENTS_STANDING_ON_ODD_POSITIONS = "6) Elements which present more than one time and stay on odd index";

    private int processorMethodCallCounter = 0;

    public void printOriginalArray(int[] original) {
        System.out.printf("%s:%n%s", ORIGINAL_ARRAY, intArrayToString(original));
    }

    public void printResults(String methodDescription, int[] result) {
        processorMethodCallCounter++;
        System.out.printf("%d) %s:%n%s", processorMethodCallCounter, methodDescription, intArrayToString(result));
    }

    public void printResults(String methodDescription, int result) {
        processorMethodCallCounter++;
        System.out.printf("%d) %s:%n%d%n", processorMethodCallCounter, methodDescription, result);
    }

    public void printResults(String methodDescription, float result) {
        processorMethodCallCounter++;
        System.out.printf("%d) %s:%n%.1f%n", processorMethodCallCounter, methodDescription, result);
    }

    private String intArrayToString(int[] input) {
        StringBuilder resultStringBuilder = new StringBuilder();
        for (int i : input) {
            resultStringBuilder.append(String.format("%-7d", i));
        }
        resultStringBuilder.append(String.format("%n"));
        return resultStringBuilder.toString();
    }

}
