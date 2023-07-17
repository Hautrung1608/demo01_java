import java.text.DecimalFormat;
import java.util.Scanner;

public class demo05 {
    public static void main(String[] args) {
        double toan, ly, hoa, diemTrungBinh;
        String ketQuaXepLoai; 

        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.#");

        System.out.print("Nhap diem toan : ");
         toan = scanner.nextDouble();

        System.out.print("Nhap diem ly : ");
         ly = scanner.nextDouble();

        System.out.print("Nhap diem hoa : ");
         hoa = scanner.nextDouble();

        if ((toan < 0 || toan > 10) 
            || (ly < 0 || ly > 10) || (hoa < 0 || hoa > 10)) {
            System.out.println("Nhap diem khong hop le.");
        } else {
            diemTrungBinh = ((toan + ly + hoa) / 3);
                
            decimalFormat.format(diemTrungBinh);
            System.out.println("Diem trung binh la:"+ diemTrungBinh);
             
            // Tiến hành xếp loại điểm môn học của sinh viên.
            // Sử dụng cấu trúc if - else if - else
            if (diemTrungBinh >= 9) {
                ketQuaXepLoai = "Loại Xuat Sac";
            } else if ((diemTrungBinh >= 8) && (diemTrungBinh < 9)) {
                // toán tử AND: đúng khi cả hai biểu thức đều đúng
                ketQuaXepLoai = "Loai Gioi";
            } else if ((diemTrungBinh >= 6.5) && (diemTrungBinh < 8)) {
                ketQuaXepLoai = "Loai Kha";

            } else if ((diemTrungBinh > 5) && (diemTrungBinh < 6.5)) {
                ketQuaXepLoai = "Loai Trung Binh";
            } else if ((diemTrungBinh > 3.5) && (diemTrungBinh < 5)) {
                ketQuaXepLoai = "Loai Yeu";
            } else {
                ketQuaXepLoai = "Loai Kem";
            }
            System.out.println("Ket qua xep loai theo thang diem là " + ketQuaXepLoai);
        }


    }
}
