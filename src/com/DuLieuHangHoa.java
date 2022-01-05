package com;

public class DuLieuHangHoa {

    DuLieuHangHoa() {
    };

    public DanhSachQuanLy danhSach() {
            DanhSachQuanLy qlhh = new DanhSachQuanLy();
            HangHoa stt1 = new DienTu(100, "Dien Tu", "Tivi", 20000000, "10-01-2021 ", 10);
            HangHoa stt2 = new SanhSu(50, "Sanh Su", "Chen thuy tinh", 30000, "15-01-2021 ", 50);
            HangHoa stt3 = new ThucPham(20,"Thuc Pham", "Gao, nep", 20000, "20-01-2021", 1000);
            HangHoa stt4 = new DienTu(120, "Dien Tu", "May lanh", 30000000, "25-01-2021", 5);
            HangHoa stt5 = new SanhSu(023, "Sanh Su", "Ly thuy tinh", 45000, "30-01-2021", 150);
            HangHoa stt6 = new ThucPham(012,"Thuc Pham", "Mi goi", 130000, "04-02-2021", 150);
            HangHoa stt7 = new DienTu(509, "Dien Tu", "May giat", 25000000, "09-02-2021", 15);
            HangHoa stt8 = new SanhSu(456, "Sanh Su", "Noi bang gom", 350000, "14-02-2021", 55);
            HangHoa stt9 = new ThucPham(789,"Thuc Pham", "Sua tuoi", 45000, "19-02-2021", 100);
            HangHoa stt10 = new DienTu(563, "Dien Tu", "May anh", 15000000, "24-02-2021", 15);

            HangHoa stt11 = new SanhSu(145, "Sanh Su", "Binh hoa", 250000,
                            "25-02-2021", 10);
            HangHoa stt12 = new ThucPham(234, "Thuc Pham", "Banh keo", 20000,
                            "2-03-2021", 300);
            HangHoa stt13 = new DienTu(287, "Dien Tu", "Dien thoai",
                            10000000,
                            "07- 03-2021", 20);
            HangHoa stt14 = new SanhSu(753, "Sanh Su", "Dia thuy tinh", 50000,
                            "12-03-2021", 50);
            HangHoa stt15 = new ThucPham(752, "Thuc Pham", "Nuoc ngot", 10000,
                            "17-03-2021", 1000);
            HangHoa stt16 = new DienTu(017, "Dien Tu", "May tinh", 35000000,
                            "22-03-2021", 15);
            HangHoa stt17 = new SanhSu(259, "Sanh Su", "Ly thuy tinh",
                            35000, "27-03-2021", 100);
            HangHoa stt18 = new ThucPham(769, "Thuc Pham", "Gia vi", 20000,
                            "01-04-2021", 150);
            HangHoa stt19 = new DienTu(112, "Dien Tu", "Tai nghe", 650000,
                            "6-04-2021", 35);
            HangHoa stt20 = new SanhSu(045, "Sanh Su", "Binh gom trang tri", 75000,
                            "11-04-2021", 25);

            qlhh.themVaoDanhSach(stt1);
            qlhh.themVaoDanhSach(stt2);
            qlhh.themVaoDanhSach(stt3);
            qlhh.themVaoDanhSach(stt4);
            qlhh.themVaoDanhSach(stt5);
            qlhh.themVaoDanhSach(stt6);
            qlhh.themVaoDanhSach(stt7);
            qlhh.themVaoDanhSach(stt8);
            qlhh.themVaoDanhSach(stt9);
            qlhh.themVaoDanhSach(stt10);
            qlhh.themVaoDanhSach(stt11);
            qlhh.themVaoDanhSach(stt12);
            qlhh.themVaoDanhSach(stt13);
            qlhh.themVaoDanhSach(stt14);
            qlhh.themVaoDanhSach(stt15);
            qlhh.themVaoDanhSach(stt16);
            qlhh.themVaoDanhSach(stt17);
            qlhh.themVaoDanhSach(stt18);
            qlhh.themVaoDanhSach(stt19);
            qlhh.themVaoDanhSach(stt20);

            return qlhh;

    }

}
