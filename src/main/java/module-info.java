module com.dcpkg {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.rmi;

    opens com.dcpkg to javafx.fxml;
    exports com.dcpkg;
}
