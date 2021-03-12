package struct;

import java.util.Scanner;

public class ChooseIf3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please ipnput your score: ");
        int score = scanner.nextInt();

        if (score == 100){
            System.out.println("Full Score!");
        }else if (score < 100 && score >= 90){
            System.out.println("A");
        }else if (score < 90 && score >= 80){
            System.out.println("B");
        }else if (score < 80 && score >=60){
            System.out.println("C");
        }else {
            System.out.println("You Failed!");
        }


        scanner.close();
    }
}
