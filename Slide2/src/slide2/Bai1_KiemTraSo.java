package slide2;

import java.util.Scanner;

/**
 * Bài 1: Nhập 1 số nguyên trong khoảng [0, 100].
 * Nếu sai khoảng thì yêu cầu nhập lại cho tới khi đúng, rồi in số đã nhập.
 */
public class Bai1_KiemTraSo {
    public static void main(String[] args) {
        // Bước 1: Tạo đối tượng Scanner để đọc từ bàn phím
        Scanner sc = new Scanner(System.in);
        int n;

        // Bước 2: Dùng vòng lặp (do-while hoặc while) để nhập số
        //         Điều kiện phải nhập lại: số < 0 hoặc số > 100
        do {
            System.out.print("Nhap 1 so trong khoang [0, 100]: ");
            n = sc.nextInt();

            if (n < 0 || n > 100){
                System.out.println("So khong hop le nhap lai!!!");
            }
        }while (n < 0 || n > 100);

        // Bước 3: In số hợp lệ ra màn hình

        System.out.println("So vua nhap la: " + n);
    }
}
