module csc325assignment5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens csc325assignment5 to javafx.fxml;
    exports csc325assignment5;
}