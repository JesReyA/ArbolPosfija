module fes.aragon.arbolposfija {
    requires javafx.controls;
    requires javafx.fxml;


    opens fes.aragon.arbolposfija to javafx.fxml;
    exports fes.aragon.arbolposfija;
    exports fes.aragon.arbolposfija.controller;
    opens fes.aragon.arbolposfija.controller to javafx.fxml;
    exports fes.aragon.arbolposfija.inicio;
    opens fes.aragon.arbolposfija.inicio to javafx.fxml;
}