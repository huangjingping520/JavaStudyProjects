package method;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(d(5)); 
    }
    //递归
    public static int d(int n){
        if (n == 1){
            return 1;
        }else{
            return n*d(n - 1);
        }
    }
}
