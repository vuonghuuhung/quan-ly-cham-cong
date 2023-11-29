package com.example.qlchamcong.service;

import com.example.qlchamcong.entity.NguoiDung;
import com.example.qlchamcong.entity.VaiTro;
import com.example.qlchamcong.repository.INguoiDungRepository;
import com.example.qlchamcong.repository.MySQLNguoiDungRepository;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class XacThucService implements IXacThucService {
    private static XacThucService instance;
    private final INguoiDungRepository nguoiDungRepository;

    private XacThucService() {
        nguoiDungRepository = MySQLNguoiDungRepository.getInstance();
        System.out.println("Khoi tao service");
    }

    public static XacThucService getInstance() {
        if (instance == null) {
            instance = new XacThucService();
        }
        return instance;
    }

    public VaiTro dangNhap(String username, String password) {
        NguoiDung nguoiDung = nguoiDungRepository.timKiemTheoTenDangNhap(username);
        if (nguoiDung != null && xacThucMatKhau(password, nguoiDung.getSalt(), nguoiDung.getMatKhau())) {
            return nguoiDung.getVaiTro();
        }
        return null;
    }

    private boolean xacThucMatKhau(String password, String salt, String hashedPassword) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(salt.getBytes());
            byte[] hashedBytes = md.digest(password.getBytes());
            String hashedPasswordToCompare = bytesToHex(hashedBytes);

            return hashedPassword.equals(hashedPasswordToCompare);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return false;
    }

    private String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
