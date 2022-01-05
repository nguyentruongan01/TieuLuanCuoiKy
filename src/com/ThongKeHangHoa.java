package com;

public class ThongKeHangHoa {

    ThongKeHangHoa() {
    };

    // tinh tong so luong hang hoa
    public void tongSoLuongPhanTu(DanhSachQuanLy dsql) {
        int sum = 0;
        for (int i = 0; i < dsql.getDanhSachHangHoa().size(); i++) {
            sum += 1;
        }
        System.out.println("====Tong so luong hang hoa trong kho " + sum);
    }


    // tinh tong gia tri hang hoa
    public void tongGiaTriNhapKho(DanhSachQuanLy dsql) {
        int sum = 0;
        for (int i = 0; i < dsql.getDanhSachHangHoa().size(); i++) {
            sum += dsql.getDanhSachHangHoa().get(i).getGiaNhap();
        }
        System.out.println("====Tong gia tri cua kho la: " + sum + " VND");

    }

    // tong so luong hang thuc pham
    public void soLuongHangThucPham(DanhSachQuanLy dsql) {
        System.out.println("====So luong hang thuc pham: " + ThucPham.count);
    }

    // tong so luong hang dien tu
    public void soLuongHangDienTu(DanhSachQuanLy dsql) {
        System.out.println("====So luong hang dien tu " + DienTu.count);
    }

    // tong so luong hang sanh su
    public void soLuongHangSanhSu(DanhSachQuanLy dsql) {
        System.out.println("====So luong hang sanh su: " + SanhSu.count);
    }

}
