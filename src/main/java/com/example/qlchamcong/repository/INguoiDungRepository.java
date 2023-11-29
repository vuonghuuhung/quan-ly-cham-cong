package com.example.qlchamcong.repository;

import com.example.qlchamcong.entity.NguoiDung;

public interface INguoiDungRepository extends IRepository<NguoiDung> {
    // method rieng cua nguoi dung
    NguoiDung timKiemTheoTen(String name);
    NguoiDung timKiemTheoTenDangNhap(String username);
}
