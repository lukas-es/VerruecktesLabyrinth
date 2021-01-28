/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dasverruecktelabyrinth;

/**
 *
 * @author lukas
 */
public class SpielerModel {
    private int id; //von 1 bis 4
    private int punkte; //Gesammelte Karten
    //private imageView img;

    public SpielerModel(int id, int punkte) {
        this.id = id;
        this.punkte = punkte;
    }
    
}
