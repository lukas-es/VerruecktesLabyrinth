/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dasverruecktelabyrinth;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author lukas
 */
public class SpielFeldViewController implements Initializable {

    @FXML
    private ImageView playerRed;
    @FXML
    private ImageView playerYellow;
    @FXML
    private ImageView playerblue;
    @FXML
    private ImageView playerGreen;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnAburt(ActionEvent event) throws IOException {
        App.setRoot("HomeView");
    }

    @FXML
    private void btnTest(ActionEvent event) {
        playerRed.setX(playerRed.getX()+90);
    }

    @FXML
    private void btnStartGame(ActionEvent event) {
    }
    
}
