package com.example.qlchamcong.qlnhansusubsystem;

import com.example.qlchamcong.entity.NhanVien;

import java.util.List;

public interface INhanSuManagement {
    List<NhanVien> layTatCaNhanVien();
    List<NhanVien> layNhanVienTrongDonVi(String maDonVi);
    NhanVien timNhanVienTheoMa(String maNhanVien);
}
