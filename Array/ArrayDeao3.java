package Array;

public class ArrayDeao3 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};

        // 打印全部的数组元素
        for(int i = 0;i < arrays.length;i++){
            System.out.println(arrays[i]);
        }
        System.out.println("=======================");

        //计算所有元素的和
        int sum = 0;
        for (int i = 0;i < arrays.length;i++){
            sum += arrays[i];
        }
        System.out.println("sum is:"+sum);
        System.out.println("=======================");

        //查找最大元素
        int max = arrays[0];
        for(int i = 1;i < arrays.length;i++){
            if (arrays[i] > max){
                max = arrays[i];
            }
        }
        System.out.println("The max number is:"+max);
    }
}