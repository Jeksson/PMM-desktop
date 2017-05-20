/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Map;



/**
 *
 * @author Acer
 */
public class Value {
    private double procent;

    public double procentPro(boolean radio1, boolean radio2, boolean radio3, boolean checkBox){
        
        if (radio1 == true && radio2 == true && radio3 == true) {
            procent = 0.3;
            if(checkBox != false){
            procent = procent*-1;}
        } else if (radio1 == true && radio2 == true && radio3 == false) {
            procent = 0.15;
            if(checkBox != false){
            procent = procent*-1;}
        } else if (radio1 == true && radio2 == false && radio3 == true) {
            procent = 0.20;
            if(checkBox != false){
            procent = procent*-1;}
        } else if (radio1 == true && radio2 == false && radio3 == false) {
            procent = 0.05;
            if(checkBox != false){
            procent = procent*-1;}
        } else if (radio1 == false && radio2 == true && radio3 == false) {
            procent = 0.1;
            if(checkBox != false){
            procent = procent*-1;}
        } else if (radio1 == false && radio2 == false && radio3 == true) {
            procent = 0.15;
            if(checkBox != false){
            procent = procent*-1;}
        } else if(radio1 == false && radio2 == true && radio3 == true){
            procent = 0.25;
            if(checkBox != false){
            procent = procent*-1;}
        } else if (radio1 == false && radio2 == false && radio3 == false){
            procent = 0;
            if(checkBox != false){
            procent = procent*-1;}
        } 
        System.out.println(procent);
        return procent;        
    }

    public double dobavka(String nameAvto, Map<String, Double> map, boolean radio1, boolean radio2, boolean radio3, boolean checkbox){
        double rash = 0;
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (nameAvto.equals(entry.getKey())) {
                rash = procentPro(radio1, radio2, radio3, checkbox)* entry.getValue();
            }
        }
        return rash;
    }
    
    public double kmOtvet(String nameAvto, Map<String, Double> map, double litr, double kolHod, boolean radio1, boolean radio2, boolean radio3, boolean checkbox){
        double km = 0;
        
        km = ((litr - 0.25*kolHod) * 100) / rashodDl(nameAvto, map, radio1, radio2,radio3, checkbox);
        
        return km;
        
    }
    
    public double rashodDl(String nameAvto, Map<String, Double> map, boolean radio1, boolean radio2, boolean radio3, boolean checkbox){
        double rash = 0;
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (nameAvto.equals(entry.getKey())) {
                rash = entry.getValue() + (procentPro(radio1, radio2, radio3, checkbox)* entry.getValue());
            }
        }
        return rash;
    }
 
    public double litrOtvet(String nameAvto, Map<String, Double> map, double km, double kolHod, boolean radio1, boolean radio2, boolean radio3, boolean checkbox){
        double litr = 0;
        
        litr = ((km*rashodDl(nameAvto, map, radio1, radio2, radio3, checkbox))/100) + 0.25*kolHod;
        
        return litr;
    }
    
    
}
