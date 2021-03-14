package Array;

import java.util.Arrays;

public class ArrayDemo7 {
    public static void main(String[] args) {
        int[] a = {1,5,6,56,465,61,5156,51,65,651,65,165,15};
        int[] sort = sort(a);
        System.out.println(Arrays.toString(sort));
    }

    //冒泡排序
    public static int[] sort(int[] array){

        int temp = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j+1]>array[j]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }
}
