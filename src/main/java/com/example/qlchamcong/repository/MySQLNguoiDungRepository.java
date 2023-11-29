package com.example.qlchamcong.repository;

import com.example.qlchamcong.database.DatabaseConnectorFactory;
import com.example.qlchamcong.entity.NguoiDung;

import java.sql.Connection;
import java.util.List;

public class MySQLNguoiDungRepository implements INguoiDungRepository {
    private static MySQLNguoiDungRepository instance;
    private final Connection connection;

    private MySQLNguoiDungRepository() {
        connection = DatabaseConnectorFactory.getInstance();
        System.out.println("Khoi tao repository");
    }

    public static MySQLNguoiDungRepository getInstance() {
        if (instance == null) {
            instance = new MySQLNguoiDungRepository();
        }
        return instance;
    }

    @Override
    public NguoiDung timKiemTheoTen(String name) {
        return null;
    }

    @Override
    public NguoiDung timKiemTheoTenDangNhap(String username) {
        return null;
    }

    @Override
    public void them(NguoiDung item) {

    }

    @Override
    public void xoa(NguoiDung item) {

    }

    @Override
    public void sua(NguoiDung item) {

    }

    @Override
    public void capNhat(NguoiDung item) {

    }

    @Override
    public List<NguoiDung> layTatCa() {
        return null;
    }
}
