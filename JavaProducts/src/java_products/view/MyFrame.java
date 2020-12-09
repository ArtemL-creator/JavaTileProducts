/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_products.view;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author User
 */
public class MyFrame extends JFrame{
MyPanel panel;   

public MyFrame(MyPanel p){
    super("JavaProducts");
    setBounds(100, 100, 250, 100);
    panel = p;
    
    Container cont = this.getContentPane();
    cont.setLayout((new GridLayout(3,2,2,2)));
    JTextField text = panel.text;
    JTextField text1 = panel.text1;
    JTextField text2 = panel.text2;
    JTextField text3 = panel.text3;
    JLabel label = panel.label;
    JLabel label1 = panel.label1;
    JLabel label2 = panel.label2;
    JLabel label3 = panel.label3;
    JButton b = panel.b;
    JButton b2 = panel.b2;
    
    cont.add(label);
    cont.add(text);
    cont.add(label1);
    cont.add(text1);
    cont.add(label2);
    cont.add(text2);
    cont.add(b);
    cont.add(b2);
    cont.add(label3);
    cont.add(text3);
    
    add(panel);
    pack();
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
}
}
