package com;

import java.util.Scanner;

public class testDrive {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        DanhSachQuanLy qlhh = new DanhSachQuanLy(); 
        DuLieuHangHoa dlhh = new DuLieuHangHoa(); // 20 Du lieu hang hoa co san
        MenuSmall menu = new MenuSmall();
        qlhh = dlhh.danhSach(); // Tiep nhan 20 du lieu hang hoa
        int luaChon = 0;

        do {
            menu.menuBig(input);
            luaChon = input.nextInt();
            switch (luaChon) {
                 // Chuong trinh 1
                case 1:
                    int luaChonBai1 = 0;
                    do {
                        menu.menuBai1ThemHangHoa();
                        luaChonBai1 = input.nextInt();
                        input.nextLine();
                        switch (luaChonBai1) {
                                        // Begin code Them hang hoa //
                                        case 1: // Them hang hoa Dien tu
                                            System.out.println();
                                            ThemHangHoa th1 = new ThemHangHoa();
                                            qlhh = th1.themHangDienTu(qlhh, input);
                                            break;
                                        case 2: // Them hang hoa Thuc pham
                                            System.out.println();
                                            ThemHangHoa th2 = new ThemHangHoa();
                                            qlhh = th2.themHangThucPham(qlhh, input);
                                            break;
                                        case 3: // Them hang hoa Sanh Su
                                            System.out.println();
                                            ThemHangHoa th3 = new ThemHangHoa();
                                            qlhh = th3.themHangSanhSu(qlhh, input);
                                            break;
                                        case 4: // Cap nhap lai danh sach
                                            System.out.println();
                                            qlhh.inDanhSach();
                                        case 5:
                                            break;
                                        default :   System.out.println("Chon tu 1 - 5");

                                    }
                            
                    } while (luaChonBai1 >= 1 && luaChonBai1 <= 3);
                    // END CHUONG TRINH 1
                    break;


                // Chuong trinh 2
                case 2: 
                int luaChonBaii = 0;
                do {
                    menu.menuBai2SuaXoaHangHoa();
                    SuaXoaHangHoa suaXoa = new SuaXoaHangHoa();
                    luaChonBaii = input.nextInt();
                    input.nextLine();
                    switch(luaChonBaii) {
                        case 1  :     // PHAN SUA HANG HOA
                        suaXoa.suaHangHoa(qlhh, input);
                        break;
                    case 2: // PHAN XOA HANG HOA
                        System.out.println();   
                        suaXoa.xoaHangHoa(qlhh, input);
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Chon tu 1 - 2");

                } 
                }while(luaChonBaii >= 1 && luaChonBaii <=2);
                // END CHUONG TRINH 2
                break;


                // Chuong trinh 3
                case 3:
                    int luaChonBai3 = 0;
                    do {
                        menu.menuBai3TimKiemHangHoa();
                        TimKiemHangHoa timKiem = new TimKiemHangHoa();
                        luaChonBai3 = input.nextInt();
                        input.nextLine();
                        switch (luaChonBai3) {
                            case 1: // Tim Kiem Theo Loaa
                                System.out.println(); 
                                timKiem.timKiemTheoLoai(qlhh, input);
                                break;
                            case 2: // Tim Kiem Theo Gia
                                System.out.println();
                                timKiem.timKiemTheoGia(qlhh, input);
                                break;
                            case 3: // Tim Kiem Theo Ngay
                                System.out.println();
                                timKiem.timKiemTheoNgay(qlhh, input);
                                break;
                            case 4:
                                break;
                            default:
                                System.out.print("Chon tu 1 - 4");
                                break;
                        }

                    } while (luaChonBai3 >= 1 && luaChonBai3 <= 3);
                    // END CHUONG TRINH 3
                    break;

                // Chuong trinh 4
                case 4:
                    int luaChonBai4 = 0;
                    do {
                        menu.menuBai4SapXepHangHoa();
                        SapXepHangHoa sapXep = new SapXepHangHoa();
                        luaChonBai4 = input.nextInt();
                        input.nextLine();
                        switch (luaChonBai4) {
                            case 1: // Sap Xep Theo Gia
                                System.out.println();
                                sapXep.sapXepTheoGia(qlhh, input);
                                break;
                            case 2: // Sap Xep Theo Ngay
                                System.out.println();
                                sapXep.sapXepTheoNgay(qlhh, input);
                                break;
                            case 3: // Sap Xep Theo Loai Hang Hoa va Theo Gia
                                System.out.println();
                                sapXep.sapXepTheoLoaiVaGia(qlhh, input);
                                break;
                            case 4: // Sap Xep Theo Loai Hang Hoa Va Theo Ngay
                                System.out.println();
                                sapXep.sapXepTheoLoaiVaNgay(qlhh, input);
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Chon tu 1 - 5");
                        }
                    } while (luaChonBai4 >= 1 && luaChonBai4 <= 4);
                    // END CHUONG TRINH 4

                    break;


                // Chuong trinh 5
                case 5:
                    int luaChonBai5 = 0;
                    do {
                        menu.menuBai5ThongKeHangHoa();
                        ThongKeHangHoa thongKe = new ThongKeHangHoa();
                        luaChonBai5 = input.nextInt();
                        input.nextLine();
                        switch (luaChonBai5) {
                            case 1: // Thong ke so luong hang hoa    
                                System.out.println();
                                thongKe.tongSoLuongPhanTu(qlhh);
                                break;
                            case 2: // Thong ke gia tri hang hoa trong kho
                                System.out.println();
                                thongKe.tongGiaTriNhapKho(qlhh);
                                break;
                            case 3: // Thong ke so luong hang hoa tung loai
                                System.out.println();
                                thongKe.soLuongHangDienTu(qlhh);
                                thongKe.soLuongHangThucPham(qlhh);
                                thongKe.soLuongHangSanhSu(qlhh);
                                break;
                            case 4:
                                break;
                        }
                    } while (luaChonBai5 >= 1 && luaChonBai5 <= 3);
                    // END CHUONG TRINH 5

                    break;

                // Chuong trinh 6
                case 6: // In danh sach hang hoa
                    System.out.println();
                    qlhh.inDanhSach();
                    break;
                case 7: // Thoat Chuong Trinh
                    break;
                default:
                    System.out.println("Chon tu 1 den 7");
                    break;

            }

        } while (luaChon >= 1 && luaChon <= 6);
        System.out.println("Thoat chuong trinh....");

    }

}
