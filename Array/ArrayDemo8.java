package Array;


public class ArrayDemo8 {
    public static void main(String[] args) {

        //创建棋盘  0--没有棋子   1--黑棋   2--白棋
        int[][] array = new int [11][11];
        array[1][2] = 1;
        array[2][3] = 2;

        System.out.println("原始数组：");
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }


        //稀疏数组
        //1. 获取有效值个数
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (array[i][j] != 0){
                    sum++;
                }
            }
        }
        System.out.println("有效值个数为：" + sum);

        //2. 创建稀疏数组
        int[][] sparseArray = new int[sum + 1][3];
        sparseArray[0][0] = 11;
        sparseArray[0][1] = 11;
        sparseArray[0][2] = sum;

        //3. 遍历二维数组，将非零的值，放入稀疏数组中
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] != 0){
                    count++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = array[i][j];
                }
            }
        }

        //4. 输出稀疏数组
        System.out.println("稀疏数组：");
        for (int i = 0; i < sparseArray.length; i++) {
            System.out.println(sparseArray[i][0] + "\t" + sparseArray[i][1] + "\t" + sparseArray[i][2] + "\t");
        }
    }    
}