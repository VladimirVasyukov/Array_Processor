package com.epam.java_basic.array_processor;

public class ArrayController {

    private static final int[] ORIGINAL_ARRAY =
            new int[]{-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, -1, -7, -6, -2, 9};
    private final ArrayProcessor arrayProcessor;
    private final ArrayView arrayView;
    private int[] originalArray;

    public ArrayController(ArrayProcessor arrayProcessor, ArrayView arrayView) {
        this.arrayProcessor = arrayProcessor;
        this.arrayView = arrayView;
    }

    public void setOriginalArray() {
        this.originalArray = ORIGINAL_ARRAY;
        arrayView.printOriginalArray(originalArray);
    }

    public void swapMaxNegativeAndMinPositiveElements() {
        arrayView.printResults(ArrayView.SWAP_MAX_NEGATIVE_AND_MIN_POSITIVE_ELEMENTS,
                arrayProcessor.swapMaxNegativeAndMinPositiveElements(originalArray));
    }

    public void countSumOfElementsOnEvenPositions() {
        arrayView.printResults(ArrayView.COUNT_SUM_OF_ELEMENTS_ON_EVEN_POSITIONS,
                arrayProcessor.countSumOfElementsOnEvenPositions(originalArray));
    }

    public void replaceEachNegativeElementsWithZero() {
        arrayView.printResults(ArrayView.REPLACE_EACH_NEGATIVE_ELEMENTS_WITH_ZERO,
                arrayProcessor.replaceEachNegativeElementsWithZero(originalArray));
    }

    public void multiplyByThreeEachPositiveElementStandingBeforeNegative() {
        arrayView.printResults(ArrayView.MULTIPLY_BY_THREE_EACH_POSITIVE_ELEMENT_STANDIN_GBEFORE_NEGATIVE,
                arrayProcessor.multiplyByThreeEachPositiveElementStandingBeforeNegative(originalArray));
    }

    public void calculateDifferenceBetweenAverageAndMinElement() {
         arrayView.printResults(ArrayView.CALCULATE_DIFFERENCE_BETWEEN_AVERAGE_AND_MIN_ELEMENT,
         arrayProcessor.calculateDifferenceBetweenAverageAndMinElement(originalArray));
    }

    public void findSameElementsStandingOnOddPositions() {
        arrayView.printResults(ArrayView.FIND_SAME_ELEMENTS_STANDING_ON_ODD_POSITIONS,
                arrayProcessor.findSameElementsStandingOnOddPositions(originalArray));
    }
}
