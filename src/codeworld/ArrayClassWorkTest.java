package codeworld;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class ArrayClassWorkTest {
    @Test


    public void test(){
        int[] actual = ArrayClassWork.insertElementsCheck(new int[10]);
        int[] expected = {1,2,3,4,5,6,7,8,9,10,11,12};

        for(int i = 0; i < actual.length; i++){
            assertEquals(i+1, actual[i]);
        }
    }
}