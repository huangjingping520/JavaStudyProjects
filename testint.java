public class testint {
    public static void main(String[] args) {
        byte b1 = 10;
        short s1 = 20;

        System.out.println("b1 = "+b1);
        System.out.println("s1 = "+s1);

        System.out.println("-------------------");
        //自动类型转换  byte => short
        s1 = b1;
        System.out.println("b1 = "+b1);
        System.out.println("s1 = "+s1);

        System.out.println("-------------------");
        //强制类型转换  short => byte
        s1 = 20;
        /* 
        b1 = s1;
        编译不通过
        */
        b1 = (byte)s1;

        System.out.println("b1 = "+b1);
        System.out.println("s1 = "+s1);
    }
}
