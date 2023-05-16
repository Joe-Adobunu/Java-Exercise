package codeworld;

import static codeworld.MinimumNumberInArray.getMinimumNum;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class MinimumNumberInArrayTest {

        @Test
        public void test() {
            int[] arr1 = {5, 2, 9, 1, 7};
            assertEquals(1, getMinimumNum(arr1));
            int[] arr2 = {-5, -2, -9, -1, -7};
            assertEquals(-9, getMinimumNum(arr2));
            int[] arr3 = {3};
            assertEquals(3, getMinimumNum(arr3));
            int[] arr4 = {4, 4, 4, 4};
            assertEquals(4, getMinimumNum(arr4));
            int[] arr5 = {};
            assertEquals(Integer.MAX_VALUE, getMinimumNum(arr5));
        }





}