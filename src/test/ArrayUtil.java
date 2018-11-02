//5810450261   Dusit     Siri
package test;

public class ArrayUtil {

    private int[] array;

    public ArrayUtil(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public int countBetween(int[] a, int start, int end){
        int count = 0;
        for (int i = 0; i < a.length; i++){
            if (start <= a[i] && a[i] <= end){
                count++;
            }
        }
        return count;
    }
}
