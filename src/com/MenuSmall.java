package com;

import java.util.Scanner;

public class MenuSmall {

    // Tong hop tat ca Menu cua chuong trinh

    MenuSmall() {
    };

    public void menuBig(Scanner sc) {
        System.out.println();
        System.out.println("PHAN MEN BAN HANG");
        System.out.println("1. Them hang hoa");
        System.out.println("2. Sua, xoa hang hoa");
        System.out.println("3. Tim kiem hang hoa");
        System.out.println("4. Sap xep hang hoa");
        System.out.println("5. Thong ke hang hoa");
        System.out.println("6. In Danh sach");
        System.out.println("7. Thoat chuong trinh");
        System.out.print("Nhap lua chon: ");
    }



    public void menuBai1ThemHangHoa() {
        System.out.println();
        System.out.println("===ThemHangHoa===");
        System.out.println("1. Them hang dien tu");
        System.out.println("2. Them hang thuc pham");
        System.out.println("3. Them hang sanh su");
        System.out.println("4. Cap nhat lai danh sach");
        System.out.println("5. Quay lai menu chinh");
        System.out.print("Nhap lua chon cua ban: ");

    }

    public void menuBai2SuaXoaHangHoa() {
        System.out.println();
        System.out.println("===SuaXoaHangHoa===");
        System.out.println("1. Sua hang hoa");
        System.out.println("2. Xoa hang hoa");
        System.out.println("3. Quay lai menu chinh");
        System.out.print("Nhap lua chon cua ban: ");
    }

    public void menuBai3TimKiemHangHoa() {
        System.out.println();
        System.out.println("===TimKiemHangHoa===");
        System.out.println("1. Tim Kiem theo loai");
        System.out.println("2. Tim kiem theo gia");
        System.out.println("3. Tim kiem theo ngay");
        System.out.println("4. Quay lai Menu chinh");
        System.out.print("Nhap lua chon cua ban: ");

    }

    public void menuBai4SapXepHangHoa() {
        System.out.println();
        System.out.println("===SapXepHangHoa===");
        System.out.println("1. Sap Xep theo gia");
        System.out.println("2. Sap Xep theo ngay");
        System.out.println("3. Sap Xep gia theo loai");
        System.out.println("4. Sap Xep ngay theo loai");
        System.out.println("5. Quay lai menu chinh");
        System.out.print("Nhap lua chon cua ban: ");

    }

    public void menuBai5ThongKeHangHoa() {
        System.out.println();
        System.out.println("===ThongKeHangHoa===");
        System.out.println("1. Tong so luong hang hoa");
        System.out.println("2. Tong gia tri nhap kho");
        System.out.println("3. So luong tung loai");
        System.out.println("4. Quay lai menu chinh");
        System.out.print("Nhap lua chon cua ban: ");

    }

}
