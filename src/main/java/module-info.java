module de.layla.jdbcgui {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens de.layla.jdbcgui to javafx.fxml;
    opens de.layla.jdbcgui.mainWindow.scenes to javafx.fxml;
    exports de.layla.jdbcgui;
    exports de.layla.jdbcgui.mainWindow;
    exports de.layla.jdbcgui.mainWindow.scenes;
}