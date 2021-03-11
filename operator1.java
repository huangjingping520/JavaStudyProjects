public class operator1 {
    public static void main(String[] args) {
        //++ -- 自增  自减  一元运算符
        int a = 3;

        int b = a++;  //先给b赋值再给a自增
        int c = ++a;  //先自增在赋值给c

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
