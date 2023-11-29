package com.example.qlchamcong.entity;

public class NhanVien {
    private String maNhanVien;
    private String hoTen;
    private String donVi;
    private String chucVu;

    public NhanVien(String maNhanVien, String hoTen, String donVi, String chucVu) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.donVi = donVi;
        this.chucVu = chucVu;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
}
