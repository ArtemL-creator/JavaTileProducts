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
public class BathFloor extends Observable{

private int costBF;
private int heightBF;
private int widhtBF;

private int k;
private Tile[]arr;

public BathFloor(){}

public BathFloor(int heightBF, int widthBF, int costBF){
this.heightBF = heightBF;
this.widhtBF = widthBF;
this.costBF = costBF;
k=10;
arr = new Tile[k];
for(int i = 0; i < k; i++)
{arr[i]=new Tile(this.heightBF-2,this.widhtBF-2,this.costBF);}
}

public void changeTile(int i, Tile t){
    arr[i]=t;
}
void changeSize(Tile t, int h, int w){
    t.setHeight(h);
    t.setWidht(w);
}

public int getCostBF(){
    return costBF;
}
public void setCostBF(int costBF){
this.costBF = costBF;    
}

public Tile[] getArr(){
    return arr;
}
public void setArr(Tile[] arr){
    this.arr = arr;
}

public int getCostAllBF(){
    return this.costBF*this.k;
}    

public int getHeightBF(){
    return heightBF;
}
public void setHeightBF(int heightBF){
    this.heightBF = heightBF;
}

public int getWidhtBF(){
    return widhtBF;
}
public void setWidhtBF(int widhtBF){
    this.widhtBF = widhtBF;
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
    return this.getCostAllBF();
}
}
