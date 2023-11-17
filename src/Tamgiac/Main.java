package Tamgiac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập độ dài cạnh a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập độ dài cạnh b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập độ dài cạnh c: ");
        double c = scanner.nextDouble();

        Tamgiac tamGiac = new Tamgiac(a, b, c);
        tamGiac.hienThiThongTin();
    }
}