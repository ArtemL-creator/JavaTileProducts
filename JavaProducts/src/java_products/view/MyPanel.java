/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_products.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Observable;
import java.util.Observer;
import java_products.product.*;


/**
 *
 * @author User
 */
public class MyPanel extends JPanel implements Observer{
    JTextField text;
    JTextField text1;
    JTextField text2;
    JTextField text3;
    JLabel label = new JLabel("Высота изделия:");
    JLabel label1 = new JLabel("Ширина изделия:");
    JLabel label2 = new JLabel("Стоимость плитки:");
    JLabel label3 = new JLabel("Итоговая цена:");
    
 
    JButton b;
    JButton b2;
    BathFloor bf;
    Pavement p;
 
    public MyPanel(){        
        text = new JTextField("             ");
        text1 = new JTextField("             ");
        text2 = new JTextField("             ");
        text3 = new JTextField("                          ");
        b = new JButton("Рассчитать пол в ванной");
        b2 = new JButton("Рассчитать тротуар");
    
        
        
        b.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = text.getText();//высота
                int i = Integer.valueOf(s.trim());
                    bf.setHeightBF(i);
                String s1 = text1.getText();//ширина
                int j = Integer.valueOf(s1.trim());
                     bf.setWidhtBF(j);
                String s2 = text2.getText();//стоимость плитки
                int k = Integer.valueOf(s2.trim());
                bf.setCostBF(k);
                text3.setText(" "+bf.getCostAllBF());
            }
 
        });
        b2.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = text.getText();//высота
                int i = Integer.valueOf(s.trim());
                    p.setHeightP(i);
                String s1 = text1.getText();//ширина
                int j = Integer.valueOf(s1.trim());
                     p.setWidhtP(j);
                String s2 = text2.getText();//стоимость плитки
                int k = Integer.valueOf(s2.trim());
                      p.setCostP(k);
                    
                     text3.setText(" "+p.getCostAllP());
            }
        });
       
                
    }
 
    public void setBF(BathFloor bf) {
        this.bf = bf;
    }
 
    public void setP(Pavement p) {
        this.p = p;
    }
 
   
   public void update(Observable arg0, Object arg1) {
      BathFloor bf = (BathFloor)arg0;
      String s=""+bf.getCostAllBF();
                text1.setText(s);
                repaint();
    }
   
    public void update1(Observable arg0, Object arg1) {
      Pavement p = (Pavement)arg0;
      String s=""+p.getCostAllP();
                text1.setText(s);
                repaint();
    }
}
