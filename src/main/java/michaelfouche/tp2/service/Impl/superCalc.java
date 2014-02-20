/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package michaelfouche.tp2.service.Impl;

import michaelfouche.tp2.service.CalculatorService;

/**
 *
 * @author student
 */
public class superCalc implements CalculatorService{
    
    public int add(int a, int b)
    {
        System.out.println("Super Calc Add");
        return a+b;
    }
    
    public int subtract(int a, int b){
        System.out.println("Super Calc Subtract");
        return a-b;
    }
   /* public boolean sameValue(int a, int b){
        System.out.println("Same Value");
        return a==b;
    }/*
}
