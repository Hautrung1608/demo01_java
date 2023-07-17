import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        System.out.print("Nhập số nguyên c: ");
        int c = scanner.nextInt();
        
        if (a >= b && a >= c) {
            System.out.println("Giá trị lớn nhất là: " + a);
        } else if (b >= c) {
            System.out.println("Giá trị lớn nhất là: " + b);
        } else {
            System.out.println("Giá trị lớn nhất là: " + c);
        }
        if (a <= b && a <= c) {
            System.out.println("Giá trị nhỏ nhất là: " + a);
        } else if (b <= c) {
            System.out.println("Giá trị nhở nhất là: " + b);
        } else {
            System.out.println("Giá trị nhở nhất là: " + c);
        }

    }
}