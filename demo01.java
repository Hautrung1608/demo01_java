import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        System.out.println("Giá trị lớn nhất là: " + max);
        System.out.println("Giá trị nhỏ nhất là: " + min);
    }
}