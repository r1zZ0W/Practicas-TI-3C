module utez.edu.mx.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens utez.edu.mx.javafx to javafx.fxml;
    exports utez.edu.mx.javafx;
}