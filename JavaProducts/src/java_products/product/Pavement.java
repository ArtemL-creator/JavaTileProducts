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
public class Pavement extends Observable{

private int costP;
private int heightP;
private int widhtP;

private int k;
private Tile[]arr;

public Pavement(){}

public Pavement(int heightP, int widthP, int costP){
this.heightP = heightP;
this.widhtP = widthP;
this.costP = costP;
k=10;
arr = new Tile[k];
for(int i = 0; i < k; i++)
{arr[i]=new Tile(this.heightP-2,this.widhtP-2,this.costP);}
}

public void changeTile(int i, Tile t){
    arr[i]=t;
}
void changeSize(Tile t, int h, int w){
    t.setHeight(h);
    t.setWidht(w);
}

public int getCostP(){
    return costP;
}
public void setCostP(int costP){
this.costP = costP;    
}

public Tile[] getArr(){
    return arr;
}
public void setArr(Tile[] arr){
    this.arr = arr;
}

public int getCostAllP(){
    return this.costP*this.k;
}    

public int getHeightP(){
    return heightP;
}
public void setHeightP(int heightP){
    this.heightP = heightP;
}

public int getWidhtP(){
    return widhtP;
}
public void setWidhtP(int widhtP){
    this.widhtP = widhtP;
}

public void setNumber(int k){
    this.k = k;
    setChanged();
    notifyObservers();
}

@Override
protected synchronized void setChanged(){
super.setChanged();
}

public int getPrice(){
    return this.getCostAllP();
}
}

