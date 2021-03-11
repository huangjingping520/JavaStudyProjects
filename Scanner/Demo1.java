package Scanner;

import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        
        //创建一个扫描器对象，用于接收键盘数据。
        Scanner input = new Scanner(System.in);
        System.out.println("使用next方法接收： ");
        
        //判断用户有没有输入字符
        if (input.hasNext()){
            //使用next方法接收
            String str = input.next();
            System.out.println("输入内容为： "+ str);
        }

        //属于I/O的类如果不关闭会一直占用资源，要养成用完就关的习惯
        input.close();


    }
}