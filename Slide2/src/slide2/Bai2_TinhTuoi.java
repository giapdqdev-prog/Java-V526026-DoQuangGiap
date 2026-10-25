package slide2;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Bài 2: Nhập năm sinh trong khoảng [1900, 2010].
 * Lấy năm hiện tại bằng Calendar và in ra tuổi.
 */
public class Bai2_TinhTuoi {
    public static void main(String[] args) {
        // Bước 1: Nhập năm sinh, lặp lại nếu nằm ngoài [1900, 2010]
        int birthYear, age; // Năm sinh, tuổi
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Nhap nam sinh trong khoang [1900, 2010]: ");
            birthYear = sc.nextInt();

            if (birthYear < 1900 || birthYear > 2010){
                System.out.println("Nam sinh khong hop le!!!");
            }else{
                break;
            }
        }while (true);

        // Bước 2: Lấy năm hiện tại: Calendar.getInstance() rồi .get(Calendar.YEAR)
        age = Calendar.getInstance().get(Calendar.YEAR) - birthYear;

        System.out.println("Tuoi hien tại la: " + age);

        // Bước 3: Tuổi = năm hiện tại - năm sinh, rồi in ra
    }
}
