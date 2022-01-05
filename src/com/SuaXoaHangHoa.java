package com;

import java.util.Scanner;

public class SuaXoaHangHoa {

    SuaXoaHangHoa() {
    };

    public DanhSachQuanLy suaHangHoa(DanhSachQuanLy dsql, Scanner sc) {
        String loai1 = "Dien Tu";
        String loai2 = "Thuc pham";
        String loai3 = "Sanh Su";
        System.out.println("\n===SuaHangHoa===");
        System.out.print("Nhap ma hang hoa: ");
        int id = sc.nextInt();
        sc.nextLine();
        HangHoa hh1 = new HangHoa(id);
        for (int i = 0; i < dsql.getDanhSachHangHoa().size(); i++) {
            {
                if (hh1.equals(dsql.getDanhSachHangHoa().get(i))) {
                    System.out.println();
                    // - count di 1, de thong ke chinh xac so luong o chuong trinh 4
                    if (dsql.getDanhSachHangHoa().get(i).getLoaiHangHoa().equalsIgnoreCase(loai1)) {
                        DienTu.count -= 1;
                    }
                    if (dsql.getDanhSachHangHoa().get(i).getLoaiHangHoa().equalsIgnoreCase(loai2)) {
                        ThucPham.count -= 1;
                    }
                    if (dsql.getDanhSachHangHoa().get(i).getLoaiHangHoa().equalsIgnoreCase(loai3)) {
                        SanhSu.count -= 1;
                    }
                    System.out.println("\nThong tin hang hoa se bi sua");
                    System.out.println(dsql.getDanhSachHangHoa().get(i));
                    System.out.print("Nhap lai loai hang hoa: ");
                    String loaiHang = sc.nextLine();
                    System.out.print("Nhap lai ten hang hoa: ");
                    String ten = sc.nextLine();
                    System.out.print("Nhap lai gia hang hoa: ");
                    int gia = sc.nextInt();
                    sc.nextLine();
                    LayNgayGioHienTai d = new LayNgayGioHienTai();
                    String ngay = d.layThoiGianHienTai();
                    System.out.print("Nhap lai so luong ton kho: ");
                    int soLuong = sc.nextInt();
                    dsql.getDanhSachHangHoa().get(i).setLoaiHangHoa(loaiHang);
                    dsql.getDanhSachHangHoa().get(i).setTenHangHoa(ten);
                    dsql.getDanhSachHangHoa().get(i).setGiaNhap(gia);
                    dsql.getDanhSachHangHoa().get(i).setNgayNhapKho(ngay);
                    dsql.getDanhSachHangHoa().get(i).setSoLuongTonKho(soLuong);
                    // + count len 1, de thong ke chinh xac so luong o chuong trinh 4
                    if (dsql.getDanhSachHangHoa().get(i).getLoaiHangHoa().equalsIgnoreCase(loai1)) {
                        DienTu.count += 1;
                        break;
                    }
                    if (dsql.getDanhSachHangHoa().get(i).getLoaiHangHoa().equalsIgnoreCase(loai2)) {
                        ThucPham.count += 1;
                        break;
                    }
                    if (dsql.getDanhSachHangHoa().get(i).getLoaiHangHoa().equalsIgnoreCase(loai3)) {
                        SanhSu.count += 1;
                        break;
                    }
                    System.out.println("\t\t\tHang hoa da duoc cap nhat");
                    System.out.println(dsql.getDanhSachHangHoa().get(i));

                    break;
                } else {
                    if (i + 1 == dsql.getDanhSachHangHoa().size()) {
                        System.out.println("Ma hang hoa khong ton tai");
                    }
                }
            }
        }
        return dsql;
    }

   

    public DanhSachQuanLy xoaHangHoa(DanhSachQuanLy dsql, Scanner sc) {
        System.out.println("\n===XoaHangHoa===");
        String loai1 = "Dien Tu";
        String loai2 = "Thuc pham";
        String loai3 = "Sanh Su";
        System.out.print("Nhap ma hang hoa muon xoa: ");
        int id = sc.nextInt();
        sc.nextLine();
        HangHoa hh2 = new HangHoa(id);
        for (int i = 0; i < dsql.getDanhSachHangHoa().size(); i++) {
            if (hh2.equals(dsql.getDanhSachHangHoa().get(i))) {
                System.out.println("\nThong tin hang hoa se bi xoa\n" + dsql.getDanhSachHangHoa().get(i));
                System.out.println("1. Xac nhan xoa hang");
                System.out.println("2. Huy");
                System.out.print("Lua chon cua ban: ");
                int choice = sc.nextInt();
                if (choice == 1) {
                    if (dsql.getDanhSachHangHoa().get(i).getLoaiHangHoa().equalsIgnoreCase(loai1)) {
                        DienTu.count -= 1;
                        // - count di 1, de thong ke chinh xac so luong o chuong trinh 4
                        // methods equalsIgnoreCase giup xac dinh loai hang hoa khong phan biet chu cai hoa hay thuong
                    }
                    if (dsql.getDanhSachHangHoa().get(i).getLoaiHangHoa().equalsIgnoreCase(loai2)) {
                        ThucPham.count -= 1;
                    }
                    if (dsql.getDanhSachHangHoa().get(i).getLoaiHangHoa().equalsIgnoreCase(loai3)) {
                        SanhSu.count -= 1;
                    }
                    dsql.getDanhSachHangHoa().remove(i);
                    System.out.println("\n===Da xoa hang===");
                    break;
                } else
                    break;
            } else {
                if (i + 1 == dsql.getDanhSachHangHoa().size()) {
                    System.out.println("Ma hang hoa khong ton tai");
                }
            }
        }
        return dsql;

    }

   

}
