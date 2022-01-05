package com;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SapXepHangHoa {

    SapXepHangHoa() {
    };

    // gia tang dan
    public void giaTangDan(DanhSachQuanLy dsql) {
        Collections.sort(dsql.getDanhSachHangHoa(), new Comparator<HangHoa>() {

            @Override
            public int compare(HangHoa h1, HangHoa h2) {
                if (h1.getGiaNhap() > h2.getGiaNhap()) {
                    return 1;
                } else if (h1.getGiaNhap() < h2.getGiaNhap()) {
                    return -1;
                } else
                    return 0;

            }
        });
    }


    // gia giam dan
    public void giaGiamDan(DanhSachQuanLy dsql) {
        Collections.sort(dsql.getDanhSachHangHoa(), new Comparator<HangHoa>() {

            @Override
            public int compare(HangHoa h1, HangHoa h2) {
                if (h1.getGiaNhap() < h2.getGiaNhap()) {
                    return 1;
                } else if (h1.getGiaNhap() > h2.getGiaNhap()) {
                    return -1;
                } else
                    return 0;
            }

        });
    }

    // ngay giam dan
    public void ngayGiamDan(DanhSachQuanLy dsql) {
        Collections.sort(dsql.getDanhSachHangHoa(), new Comparator<HangHoa>() {

            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if (o1.stringToDate().before(o2.stringToDate())) {
                    return 1;
                } else if (o1.stringToDate().after(o2.stringToDate())) {
                    return -1;
                } else
                    return 0;
            }

        });
    }


    // ngay tang dan
    public void ngayTangDan(DanhSachQuanLy dsql) {
        Collections.sort(dsql.getDanhSachHangHoa(), new Comparator<HangHoa>() {

            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                if (o1.stringToDate().after(o2.stringToDate())) {
                    return 1;
                } else if (o1.stringToDate().before(o2.stringToDate())) {
                    return -1;
                } else
                    return 0;
            }

        });
    }


    // theo loai va gia
    public void sapXepTheoLoaiVaGia(DanhSachQuanLy dsql, Scanner sc) {
        SapXepHangHoa sapXep = new SapXepHangHoa();
        System.out.print("\nNhap loai hang hoa muon tim kiem: ");
        String loai = sc.nextLine();
        System.out.println("1. Sap Xep Theo Gia Tang Dan");
        System.out.println("2. Sap Xep Theo Gia Giam Dan");
        System.out.print("Nhap lua chon cua ban: ");
        int luaChon = sc.nextInt();
        if (luaChon == 1) {
            System.out.println("\n===SapXepLoaiTangDanTheoGia===");
            sapXep.giaTangDan(dsql);
        } else if (luaChon == 2) {
            System.out.println("\n===SapXepLoaiGiamDanTheoGia===");
            sapXep.giaGiamDan(dsql);
        } else {
            System.out.println("Chon 1 den 2");
        }
        sc.nextLine();

        for (HangHoa hh : dsql.getDanhSachHangHoa()) {
            if (hh.getLoaiHangHoa().equalsIgnoreCase(loai)) {
                System.out.println(hh);
            }
        }

    }


    // theo loai va ngay
    public void sapXepTheoLoaiVaNgay(DanhSachQuanLy dsql, Scanner sc) {
        SapXepHangHoa sapXep = new SapXepHangHoa();
        System.out.print("\nNhap loai hang hoa muon tim kiem: ");
        String loai = sc.nextLine();
        System.out.println("1. Tu ngay cu nhat den moi nhat");
        System.out.println("2. Tu ngay moi nhat den cu nhat");
        System.out.print("Nhap lua chon cua ban: ");
        int luaChon = sc.nextInt();
        if (luaChon == 1) {
            System.out.println("\n===SapXepLoaiNgayTangDan===");
            sapXep.ngayTangDan(dsql);
        } else if (luaChon == 2) {
            System.out.println("\n===SapXepLoaiNgayGiamDan===");
            sapXep.ngayGiamDan(dsql);
        } else {
            System.out.println("Chon 1 den 2");
        }
        sc.nextLine();

        for (HangHoa hh : dsql.getDanhSachHangHoa()) {
            if (hh.getLoaiHangHoa().equalsIgnoreCase(loai)) {
                System.out.println(hh);
            }
        }

    }

    // sap xep theo ngay
    public void sapXepTheoNgay(DanhSachQuanLy dsql, Scanner sc) {
        SapXepHangHoa sp = new SapXepHangHoa();
        System.out.println("\n===SapXepTheoNgay===");
        System.out.println("1. Tu ngay cu nhat den moi nhat");
        System.out.println("2. Tu ngay moi nhat den cu nhat");
        System.out.print("Lua chon: ");
        int luaChon = sc.nextInt();
        if (luaChon == 1) {
            sp.ngayTangDan(dsql);
            dsql.inDanhSach();
        }
        if (luaChon == 2) {
            sp.ngayGiamDan(dsql);
            dsql.inDanhSach();
        }
    }

    // sap xep theo gia
    public void sapXepTheoGia(DanhSachQuanLy dsql, Scanner sc) {
        SapXepHangHoa sp = new SapXepHangHoa();
        System.out.println("\n===SapXepTheoGia===");
        System.out.println("1. Gia tang dan");
        System.out.println("2. Gia giam dan");
        System.out.print("Lua chon: ");
        int luaChon = sc.nextInt();
        if (luaChon == 1) {
            sp.giaTangDan(dsql);
            dsql.inDanhSach();
        }
        if (luaChon == 2) {
            sp.giaGiamDan(dsql);
            dsql.inDanhSach();
        }
    }

   

  
}
