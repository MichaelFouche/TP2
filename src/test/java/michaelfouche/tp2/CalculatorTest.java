/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package michaelfouche.tp2;

import michaelfouche.tp2.config.appConfig;
import michaelfouche.tp2.service.CalculatorService;
import michaelfouche.tp2.service.Impl.CalculatorServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class CalculatorTest {
    
    public static CalculatorService service;
    public CalculatorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test 
    public void add() {
        Assert.assertEquals(service.add(5,2),7);        
    }
    @Test 
    public void subtract() {
        Assert.assertEquals(service.subtract(5,2),3);        
    }
    @Test 
    public void sameValue(){
        Assert.assertSame(true, service.sameValue(12,12));
    }
    @Test 
    public void valTrue(){
        Assert.assertTrue(service.valTrue(true),"true");    
        Assert.assertTrue(true); 
    }
    @Test 
    public void valNull(){
        Integer obj = 10;
        Assert.assertNotNull(service.valNotNull(obj));
    }
    
    
    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(appConfig.class);
        service = (CalculatorService)ctx.getBean("calc");
       // service = new CalculatorServiceImpl();        
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
        
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
