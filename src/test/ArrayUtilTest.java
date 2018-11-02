//5810450261   Dusit     Siri
package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilTest {
    @org.junit.jupiter.api.Test
    void countBetween() {
        int[] array = new int[]{1,2,3,4};
        int start = 2;
        int end = 5;
        ArrayUtil arrayUtil = new ArrayUtil(array);
        arrayUtil.countBetween(array, start, end);
        assertEquals(3, arrayUtil.getArray());
    }

}