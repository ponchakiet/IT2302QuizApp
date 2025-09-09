module com.ntk.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens com.ntk.quizapp to javafx.fxml;
    exports com.ntk.quizapp;
}
