package com;

import java.util.Date;

import java.text.SimpleDateFormat;

public class LayNgayGioHienTai {

    LayNgayGioHienTai() {
    };

    // Lay thoi gian thuc
    public String layThoiGianHienTai() {

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        Date today = new Date();
        String ngay = formatter.format(today);

        return ngay;

    }

}
