package com;

import java.util.Scanner;

public class TimKiemHangHoa {
    TimKiemHangHoa() {
    };

    public void timKiemTheoLoai(DanhSachQuanLy dsql, Scanner sc) {
        System.out.print("Nhap loai hang hoa muon tim kiem: ");
        String loai = sc.nextLine();
        for (int i = 0; i < dsql.getDanhSachHangHoa().size(); i++) {
            // Tim kiem loai hang hoa khong phan biet chu hoa, chu thuong bang methods equalsIgnoreCase
            if (dsql.getDanhSachHangHoa().get(i).getLoaiHangHoa().equalsIgnoreCase(loai)) {
                System.out.println(dsql.getDanhSachHangHoa().get(i));
            }
        }
    }

    public void timKiemTheoGia(DanhSachQuanLy dsql, Scanner sc) {
        System.out.println("Nhap khoang gia muon tim kiem");
        System.out.print("Gia tu: ");
        int gia1 = sc.nextInt();
        System.out.print("Den: ");
        int gia2 = sc.nextInt();
        for (int i = 0; i <dsql.getDanhSachHangHoa().size(); i++) {
            if (dsql.getDanhSachHangHoa().get(i).getGiaNhap() >= gia1 && dsql.getDanhSachHangHoa().get(i).getGiaNhap() <= gia2) {
                System.out.println(dsql.getDanhSachHangHoa().get(i));
            }
        }
    }

    public void timKiemTheoNgay(DanhSachQuanLy dsql, Scanner sc) {
        System.out.print("Tim tu ngay: ");
        String ngay1 = sc.nextLine();
        System.out.print("Den ngay: ");
        String ngay2 = sc.nextLine();
        HangHoa h1 = new HangHoa(ngay1);
        HangHoa h2 = new HangHoa(ngay2);
        System.out.println();
        System.out.println(h1.stringToDate());
        System.out.println(h2.stringToDate());
        for (int i = 0; i < dsql.getDanhSachHangHoa().size(); i++) {
            // tìm các phần tử nằm trong khoảng 2 mốc thời gian đã nhập
            if ((dsql.getDanhSachHangHoa().get(i).stringToDate().compareTo(h1.stringToDate()) >= 0)

                    && (dsql.getDanhSachHangHoa().get(i).stringToDate().compareTo(h2.stringToDate()) <= 0)
            ) {
                System.out.print(dsql.getDanhSachHangHoa().get(i));
                System.out.println();

            }

        }
    }


}
