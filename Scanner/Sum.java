package Scanner;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int m = 0;

        while (scanner.hasNextDouble()) {
            double x = scanner.nextDouble();
            m = m + 1;
            sum = sum + x;
        }
        System.out.println(m + "个数字的和是：" + sum);
        System.out.println("其平均数是： " + (sum / m));
        scanner.close();
    }
}
