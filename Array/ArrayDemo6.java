package Array;

import java.util.Arrays;

public class ArrayDemo6 {
    public static void main(String[] args) {
        int[] a = {1,59,41,64,5,41,6};
        //?System.out.println(a);

        //*打印数组元素Arrays.toString()
        System.out.println(Arrays.toString(a));

        //对数组进行排序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
