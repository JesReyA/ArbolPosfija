module fes.aragon.arbolposfija {
    requires javafx.controls;
    requires javafx.fxml;


    opens fes.aragon.arbolposfija to javafx.fxml;
    exports fes.aragon.arbolposfija;
}