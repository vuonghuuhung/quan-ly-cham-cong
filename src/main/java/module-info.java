module com.example.qlchamcong {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.sql;

    opens com.example.qlchamcong to javafx.fxml;
    exports com.example.qlchamcong;
    exports com.example.qlchamcong.dangnhap;
//    exports com.example.qlchamcong.qlns;
    exports com.example.qlchamcong.qlns.manhinhchinh;
    exports com.example.qlchamcong.qlns.importdulieuchamcong;
    opens com.example.qlchamcong.dangnhap to javafx.fxml;
}