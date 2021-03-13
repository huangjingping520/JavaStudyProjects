package Array;

public class ArrayDemo5 {
    public static void main(String[] args) {
        int[][] array  = {{1,2},{2,3},{3,4},{4,5},{5,6}};

        // System.out.println(array[0][0]);
        // System.out.println(array[0][1]);

        //遍历
        for(int i = 0;i < array.length;i++){
            for (int j = 0;j < array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
        }
    }
}
