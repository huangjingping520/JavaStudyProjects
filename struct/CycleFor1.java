package struct;

public class CycleFor1{
    public static void main(String[] args) {
        //计算1~100 之间奇数与偶数的和

        int oddSum = 0; //奇数
        int evenSum = 0; // 偶数

        for(int i = 0;i <= 100;i++){
            if (i % 2 != 0){
                oddSum+=i;
            }else{
                evenSum+=i;
            }
        }

        System.out.println("奇数的和为："+oddSum);
        System.out.println("偶数的和为："+evenSum);
    }
}
