package Tamgiac;
import java.util.Scanner;

public class Tamgiac {
    private double a;
    private double b;
    private double c;

    public Tamgiac(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean laTamGiac() {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public double tinhChuVi() {
        return a + b + c;
    }

    public double tinhDienTich() {
        double p = tinhChuVi() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public void hienThiThongTin() {
        if (laTamGiac()) {
            System.out.println("Chu vi của tam giác là: " + tinhChuVi());
            System.out.println("Diện tích của tam giác là: " + tinhDienTich());
        } else {
            System.out.println("Ba cạnh không tạo thành tam giác.");
        }
    }
}