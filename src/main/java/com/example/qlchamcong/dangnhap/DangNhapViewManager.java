package com.example.qlchamcong.dangnhap;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class DangNhapViewManager implements Initializable {
    private IDangNhapController controller;

    @FXML
    protected Button dangNhap;
    @FXML
    protected TextField tenDangNhap;
    @FXML
    protected PasswordField matKhau;

    @FXML
    protected void onDangNhapButtonClick() throws IOException {
        System.out.println("Dang nhap thanh cong");
        Stage stage = (Stage) dangNhap.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/qlchamcong/qlns/manhinhchinh/home-view.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println(1);
        controller = DangNhapController.getInstance();
    }
}