package com.epam.java_basic;

import com.epam.java_basic.array_processor.ArrayController;
import com.epam.java_basic.array_processor.ArrayProcessor;
import com.epam.java_basic.array_processor.ArrayView;


/**
 * 01_Java_Basic - Vladimir_Vasyukov
 * Application's entry point, use it to demonstrate your code execution
 */
public class Application {

    public void run() {
        ArrayController arrayController = new ArrayController(
                new ArrayProcessor(),
                new ArrayView());
        arrayController.setOriginalArray();
        arrayController.swapMaxNegativeAndMinPositiveElements();
        arrayController.countSumOfElementsOnEvenPositions();
        arrayController.replaceEachNegativeElementsWithZero();
        arrayController.multiplyByThreeEachPositiveElementStandingBeforeNegative();
        arrayController.calculateDifferenceBetweenAverageAndMinElement();
        arrayController.findSameElementsStandingOnOddPositions();
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.run();
    }
}
