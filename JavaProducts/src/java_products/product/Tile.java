/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_products.product;

import java.util.Observable;
/**
 *
 * @author User
 */
public class Tile extends Observable{
    private int height;
    private int width;
    private int cost;
    
    public Tile(int height, int width, int cost)
    {
        this.height = height;
        this.width = width;
        this.cost = cost;
        notifyObservers();
    }
    
    public Tile(){}
    
    public int getHeight(){
        return height;
    }
    
    public void setHeight(int height){
        this.height = height;
    }
    
    
    public int getWidth(){
        return width;
    }
    
    public void setWidht(int width){
        this.width = width;
    }
    
    
    public int getCost(){
        return cost;
    }
    public void setCost(int cost){
        this.cost = cost;
    }
    
    
    @Override
    public String toString(){
        return "cost: "+cost+" height: "+height+" widht "+width;
    }
}
