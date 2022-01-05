package com;

import java.util.ArrayList;

public class DanhSachQuanLy {
    private ArrayList<HangHoa> danhSachHangHoa;

    DanhSachQuanLy() {
        danhSachHangHoa = new ArrayList<HangHoa>();
    }

    // lay danh sach
    public ArrayList<HangHoa> getDanhSachHangHoa() {
        return this.danhSachHangHoa;
    }

    //them hang hoa vao danh sach
    public void themVaoDanhSach(HangHoa hh) {
        this.danhSachHangHoa.add(hh);
    }

    // in danh sach
    public void inDanhSach() {
        for (HangHoa hangHoa : danhSachHangHoa) {
            System.out.println(hangHoa);
        }
    }

}
