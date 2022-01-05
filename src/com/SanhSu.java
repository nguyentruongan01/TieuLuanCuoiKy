package com;

public class SanhSu extends HangHoa {
    static int count = 0; // de thong ke so luong tung loai hang hoa


    SanhSu(int maHangHoa, String loaiHangHoa, String tenHangHoa, int giaNhap, String ngayNhapKho,
            int soLuongTonKho) {
        super(maHangHoa, loaiHangHoa, tenHangHoa, giaNhap, ngayNhapKho, soLuongTonKho);
        count++;
    }

}
