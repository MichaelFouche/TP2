/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package michaelfouche.tp2.service;

/**
 *
 * @author student
 */
public interface CalculatorService {
    int add(int a, int b);
    int subtract(int a, int b);
    boolean sameValue(int a, int b);
    boolean notSameValue(int a, int b);
    boolean valTrue(boolean a);
    boolean valFalse(boolean a);
    Integer valNull(Integer a);
    boolean valNotNull(Integer a);
    public boolean arrayEqualTest(String[] a, String[] b);
    public String getValueInArray(String[] a);
}
