module com.mycompany.dasverruecktelabyrinth {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.dasverruecktelabyrinth to javafx.fxml;
    exports com.mycompany.dasverruecktelabyrinth;
}
