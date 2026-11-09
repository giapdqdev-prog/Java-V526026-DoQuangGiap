package slide2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Bài 1. Xây dựng lớp Nguoi:
 * - Thuộc tính: họ tên, tuổi
 * - Phương thức: Nhập, xuất và các phương thức khác
 * 
 * Xây dựng lớp Nhanvien (Nhân viên) dẫn xuất từ lớp Nguoi:
 * - Thuộc tính: bổ sung thêm snct (số năm công tác), hsl (hệ số lương)
 * - Phương thức: tính tiền lương, biết: tienluong = lcb * hsl + phucap,
 *   trong đó: lcb là 1.5 triệu, phucap = 0.2 triệu * snct.
 * 
 * Viết hàm main() thực hiện:
 * - Nhập vào n nhân viên.
 * - Tìm nhân viên có số năm công tác nhiều nhất.
 * - In danh sách nhân viên theo thứ tự lương từ cao đến thấp.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Nhanvien> ds = new ArrayList<>();

        System.out.print("Nhap so luong nhan vien n = ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap thong tin nhan vien thu " + (i + 1) + ":");
            Nhanvien nv = new Nhanvien();
            nv.nhap(sc);
            ds.add(nv);
        }

        if (!ds.isEmpty()) {
            int maxSnct = ds.get(0).getSnct();
            for (Nhanvien nv : ds) {
                if (nv.getSnct() > maxSnct) {
                    maxSnct = nv.getSnct();
                }
            }

            System.out.println("\n--- Nhan vien co so nam cong tac nhieu nhat (" + maxSnct + " nam) ---");
            for (Nhanvien nv : ds) {
                if (nv.getSnct() == maxSnct) {
                    nv.xuat();
                }
            }
        }

        Collections.sort(ds, new Comparator<Nhanvien>() {
            @Override
            public int compare(Nhanvien nv1, Nhanvien nv2) {
                return Double.compare(nv2.tinhLuong(), nv1.tinhLuong());
            }
        });

        System.out.println("\n--- Danh sach nhan vien theo thu tu luong tu cao den thap ---");
        for (Nhanvien nv : ds) {
            nv.xuat();
        }
    }
}

