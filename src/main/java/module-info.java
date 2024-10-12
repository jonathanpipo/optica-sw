module org.appoptica.jota {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.appoptica.jota to javafx.fxml;
    exports org.appoptica.jota;
}