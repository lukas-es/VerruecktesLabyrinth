package com.mycompany.dasverruecktelabyrinth;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

/**
 * JavaFX App
 */
public class App extends Application {
    
    private static ArrayList<SpielerModel> spieler;

    public static ArrayList<SpielerModel> getSpieler() {
        return spieler;
    }

    public static void setSpieler(ArrayList<SpielerModel> spieler) {
        App.spieler = spieler;
    }

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("HomeView"), 700, 780);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        SpielerModel Spieler1 = new SpielerModel(1,0);
        SpielerModel Spieler2 = new SpielerModel(2,0);
        SpielerModel Spieler3 = new SpielerModel(3,0);
        SpielerModel Spieler4 = new SpielerModel(4,0);
        launch();
    }

}