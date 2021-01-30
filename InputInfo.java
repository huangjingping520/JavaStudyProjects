import java.util.Scanner;

public class InputInfo {
    public static void main(String[] args) {
        System.out.println("**********欢迎进入商品管理系统**********");
        System.out.println("1.用户登录 2.用户注册 3.查询商品");
        System.out.println("4.添加商品 5.订单查询 6.购物查询");
        System.out.println("7.退出系统");
        System.out.println("请选择：");

        //创建Scanner对象
        Scanner scan = new Scanner(System.in);

        //读取内容，调用Scanner对象的方法，实现读取
        String str1 = scan.next();
        String str2 = scan.next();
        System.out.println("用户输入的是："+str1);
        System.out.println("用户输入的是："+str2);
        
        System.out.println("用户名：");
        String username = scan.next();

        scan.nextLine();// 解决nextLine吞掉Enter键的问题
        
        System.out.println("密码：");
        String password = scan.nextLine();

        System.out.println("用户名："+username);
        System.out.println("密码："+password);
    }
}