package com.kalomiris;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

public class LargestCombinationTest extends TestCase {

    public void testSort() {
        LargestCombination largestCombination = new LargestCombination();
        List<Integer> inputList1 = Arrays.asList(2, 57, 21, 54);
        List<Integer> inputList2 = Arrays.asList(11, 22, 33, 44, 55);

        assertEquals("5754221", largestCombination.sort(inputList1));
        assertEquals("5544332211", largestCombination.sort(inputList2));
    }
}