/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_products;

import java_products.product.BathFloor;
import java_products.product.Pavement;
import java_products.product.Tile;
import java_products.view.MyFrame;
import java_products.view.MyPanel;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 

    {
        MyFrame frame;
        Tile t = new Tile(0, 0, 0);
        BathFloor bf = new BathFloor(0, 0, 0);
        Pavement pav = new Pavement(0, 0, 0);
        MyPanel panel = new MyPanel();
        panel.setBF(bf);
        panel.setP(pav);
        bf.addObserver(panel);
        pav.addObserver(panel);
        frame = new MyFrame(panel);
    }
    
}
