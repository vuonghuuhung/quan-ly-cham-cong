package com.example.qlchamcong.qlns.manhinhchinh;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TrangChuViewManager implements Initializable {

    @FXML
    public Pane contentPane;
    @FXML
    public Button homePage;
    @FXML
    public Button importDLCC;
    @FXML
    public Button dangXuat;

    @FXML
    public void handleImportDLCCButtonAction(ActionEvent event) throws IOException {
        // Tải file FXML của trang Page 1
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/qlchamcong/qlns/importdulieuchamcong/import-dlcc.fxml"));
        Parent importDlcc = loader.load();

        // Đặt nội dung mới cho contentPane
        contentPane.getChildren().setAll(importDlcc);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
