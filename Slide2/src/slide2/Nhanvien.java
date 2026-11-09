package slide2;

import java.util.Scanner;

public class Nhanvien extends Nguoi {
    private int snct;
    private double hsl;

    public Nhanvien() {
        super();
    }

    public Nhanvien(String hoTen, int tuoi, int snct, double hsl) {
        super(hoTen, tuoi);
        this.snct = snct;
        this.hsl = hsl;
    }

    public int getSnct() {
        return snct;
    }

    public void setSnct(int snct) {
        this.snct = snct;
    }

    public double getHsl() {
        return hsl;
    }

    public void setHsl(double hsl) {
        this.hsl = hsl;
    }

    public double tinhLuong() {
        double lcb = 1.5;
        double phucap = 0.2 * snct;
        return lcb * hsl + phucap;
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhap so nam cong tac: ");
        this.snct = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap he so luong: ");
        this.hsl = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf(" | SNCT: %-2d | HSL: %-4.2f | Tien luong: %-6.2f trieu\n", snct, hsl, tinhLuong());
    }
}

