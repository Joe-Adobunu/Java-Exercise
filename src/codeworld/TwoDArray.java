package codeworld;

import java.util.Arrays;

public class TwoDArray {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int SECOND = 2;
    private static final int FOURTH = 3;
    public static void main(String[] args) {

        int[][] arr = new int[5][];
        arr[0] = new int[5];
        arr[1] = new int[3];
        arr[2] = new int[10];
        arr[3] = new int[]{400, 500};
        arr[4] = new int[5];

        int[] firstRow = arr[ZERO];
        int lengthOfFirstRow = firstRow.length;

        for(int index = ZERO; index < lengthOfFirstRow; index++){
            populatedFirstRow(firstRow, index);
        }
        System.out.println(Arrays.deepToString(arr));

        int[] secondRow = arr[ONE];
        int lengthOfSecondRow = secondRow.length;

        for(int index = ZERO; index < lengthOfSecondRow; index++){
            populateSecondRow(secondRow, index);
        }
        System.out.println(Arrays.deepToString(arr));

        int[] thirdRow = arr[SECOND];
        int lengthOfThirdRow = thirdRow.length;

        for(int index = ZERO; index < lengthOfThirdRow; index++){
            populatedThirdRow(thirdRow, index);
        }
        System.out.println(Arrays.deepToString(arr));

        int[] fourthRow = arr[FOURTH];
        int lengthOfFourthRow = fourthRow.length;

        for(int index = ZERO; index < lengthOfFourthRow; index++){
            populatedFourthRow(fourthRow, index);

        }
        System.out.println(Arrays.deepToString(arr));



    }

    private static void populatedFourthRow(int[] fourthRow, int index) {
        fourthRow[index] = index * 100;
    }

    private static void populatedThirdRow(int[] thirdRow, int index) {
        thirdRow[index] = index + 1;
    }

    private static void populateSecondRow(int[] secondRow, int index) {
        secondRow[index] = index + 1;
    }

    private static void populatedFirstRow(int[] firstRow, int index) {
        firstRow[index] = index;
    }


}
