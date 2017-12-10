/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.util;

import java.util.ArrayList;

/**
 *
 * @author yagoz
 */
public abstract class Observavel {
    private ArrayList<Observer> observers = new ArrayList<>();
    public void addObserver(Observer ob){
        this.observers.add(ob);
    }
    
    public void removeObserver(Observer ob){
        this.observers.remove(ob);
    }
    
    public void notificarObservadores(){
        for(Observer ob: observers)
            ob.update(this);
    }
}
