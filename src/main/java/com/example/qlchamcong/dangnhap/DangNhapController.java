package com.example.qlchamcong.dangnhap;

import com.example.qlchamcong.entity.VaiTro;
import com.example.qlchamcong.service.IXacThucService;
import com.example.qlchamcong.service.XacThucService;

public class DangNhapController implements IDangNhapController {
    private static DangNhapController instance;
    private static IXacThucService xacThucService;

    public DangNhapController() {
        this.xacThucService = XacThucService.getInstance();
        System.out.println("Khoi tao controller");
    }

    public static DangNhapController getInstance() {
        if (instance == null) {
            instance = new DangNhapController();
        }
        return instance;
    }

    @Override
    public VaiTro dangNhap(String username, String password) {
        return null;
    }
}
