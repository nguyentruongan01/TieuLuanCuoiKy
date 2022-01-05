package com;

import java.util.Scanner;

public class ThemHangHoa {

    ThemHangHoa() {
    };

    public DanhSachQuanLy themHangDienTu(DanhSachQuanLy dsql, Scanner sc) {
        System.out.println("===ThemHangDienTu===");
        String loaiHang = "Dien Tu";
        System.out.print("Nhap ma hang hoa: ");
        int maHangHoa = sc.nextInt();
        {
            for (int i = 0; i < dsql.getDanhSachHangHoa().size(); i++) {
                // xem ma hang hoa duoc them vao co trung voi ma da ton tai khong
                if (maHangHoa == (dsql.getDanhSachHangHoa().get(i)).getMaHangHoa()) {
                    System.out.println("\nMa hang hoa da ton tai");
                    System.out.println("Nhap lai ma khac...\n");
                     break;
                } else {
                    // neu den cuoi danh sach khong thay trung ma hang hoa thi duoc phep them ma do vao danh sach
                    if (i + 1 == dsql.getDanhSachHangHoa().size()) {
                        sc.nextLine();
                        System.out.print("Nhap ten hang hoa: ");
                        String t = sc.nextLine();
                        System.out.print("Nhap gia hang hoa: ");
                        int g = sc.nextInt();
                        sc.nextLine();
                        // cap nhap lai time theo thoi gian thuc
                        LayNgayGioHienTai d = new LayNgayGioHienTai();
                        String ngay = d.layThoiGianHienTai();
                        System.out.print("Nhap so luong ton kho: ");
                        int sl = sc.nextInt();
                        HangHoa hangHoa = new SanhSu(maHangHoa, loaiHang, t, g, ngay, sl);
                        dsql.themVaoDanhSach(hangHoa);
                        break;
                    }
                }
            }
            return dsql;
        }      

    }


    public DanhSachQuanLy themHangThucPham(DanhSachQuanLy dsql, Scanner sc) {
        System.out.println("===ThemHangThucPham===");
        String loaiHang = "Thuc Pham";
        System.out.print("Nhap ma hang hoa: ");
        int m = sc.nextInt();
        {
            for (int i = 0; i < dsql.getDanhSachHangHoa().size(); i++) {
                // xem ma hang hoa duoc them vao co trung voi ma da ton tai khong
                if (m == (dsql.getDanhSachHangHoa().get(i)).getMaHangHoa()) {
                    System.out.println("\nMa hang hoa da ton tai");
                    System.out.println("Nhap lai ma khac...\n");
                     break;
                } else {
                    // neu den cuoi danh sach khong thay trung ma hang hoa thi duoc phep them ma do vao danh sach
                    if (i + 1 == dsql.getDanhSachHangHoa().size()) {
                        sc.nextLine();
                        System.out.print("Nhap ten hang hoa: ");
                        String t = sc.nextLine();
                        System.out.print("Nhap gia hang hoa: ");
                        int g = sc.nextInt();
                        sc.nextLine();
                        // cap nhap lai time theo thoi gian thuc
                        LayNgayGioHienTai d = new LayNgayGioHienTai();
                        String ngay = d.layThoiGianHienTai();
                        System.out.print("Nhap so luong ton kho: ");
                        int sl = sc.nextInt();
                        HangHoa hangHoa = new ThucPham(m, loaiHang, t, g, ngay, sl);
                        dsql.themVaoDanhSach(hangHoa);
                        break;
                    }
                }
            }
            return dsql;
        }      

    }


    public DanhSachQuanLy themHangSanhSu(DanhSachQuanLy dsql, Scanner sc) {
        System.out.println("===ThemHangSanhSu===");
        String loaiHang = "Sanh Su";
        System.out.print("Nhap ma hang hoa: ");
        int m = sc.nextInt();
        {
            for (int i = 0; i < dsql.getDanhSachHangHoa().size(); i++) {
                // xem ma hang hoa duoc them vao co trung voi ma da ton tai khong
                if (m == (dsql.getDanhSachHangHoa().get(i)).getMaHangHoa()) {
                    System.out.println("\nMa hang hoa da ton tai");
                    System.out.println("Nhap lai ma khac...\n");
                     break;
                } else {
                    // neu den cuoi danh sach khong thay trung ma hang hoa thi duoc phep them ma do vao danh sach
                    if (i + 1 == dsql.getDanhSachHangHoa().size()) {
                        sc.nextLine();
                        System.out.print("Nhap ten hang hoa: ");
                        String t = sc.nextLine();
                        System.out.print("Nhap gia hang hoa: ");
                        int g = sc.nextInt();
                        sc.nextLine();
                        // cap nhap lai time theo thoi gian thuc
                        LayNgayGioHienTai d = new LayNgayGioHienTai();
                        String ngay = d.layThoiGianHienTai();
                        System.out.print("Nhap so luong ton kho: ");
                        int sl = sc.nextInt();
                        HangHoa hangHoa = new SanhSu(m, loaiHang, t, g, ngay, sl);
                        dsql.themVaoDanhSach(hangHoa);
                        break;
                    }
                }
            }
            return dsql;
        }      

    }


    
}
