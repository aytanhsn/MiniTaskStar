import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.print("*");
            for (int k = 1; k < b - 1; k++) {
                if (i == a / 2 + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("*    ");
            System.out.print("*");
            for (int k = 1; k < b; k++) {
                if (i == 1 || i == a / 2 + 1 || i == a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("    ");


            System.out.print("*");
            for (int k = 1; k < b; k++) {
                if (i == a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("    ");


            System.out.print("*");
            for (int k = 1; k < b; k++) {
                if (i == a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("    ");


            System.out.print("*");
            for (int k = 1; k < b - 1; k++) {
                if (i == 1 || i == a) {
                    System.out.print("*");
                } else if (k == b - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("");

            System.out.println();
        }
    }
}
