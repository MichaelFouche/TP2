/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package michaelfouche.tp2.service.Impl;

import java.util.Arrays;
import michaelfouche.tp2.service.CalculatorService;

/**
 *
 * @author student
 */
public class CalculatorServiceImpl implements CalculatorService{
    
    public int add(int a, int b){
        return a+b;    
    }    
    public int subtract(int a, int b){
        return a-b;
    }
    public boolean sameValue(int a, int b){
        return a==b;
    }
    public boolean notSameValue(int a, int b){
        return a!=b;
    }
    public boolean valTrue(boolean a){
        return a;
    }
    public boolean valFalse(boolean a){
        return a;
    }
    public Integer valNull(Integer a){
        return a;
    }
    public boolean valNotNull(Integer a){
        return a!=null;
    }
    public boolean arrayEqualTest(String[] a, String[] b)
    {        
        return Arrays.equals(a,b);
    }
    public String getValueInArray(String[] a)
    {
        return a[5];
    }
    
    
    
            
}
