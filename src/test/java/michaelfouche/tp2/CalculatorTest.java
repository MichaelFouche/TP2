/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package michaelfouche.tp2;

import java.util.regex.Matcher;
import michaelfouche.tp2.config.appConfig;
import michaelfouche.tp2.service.CalculatorService;
import michaelfouche.tp2.service.Impl.CalculatorServiceImpl;
import org.junit.Ignore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
/**
 *
 * @author student
 */
public class CalculatorTest   {
    
    public static CalculatorService service;
    public CalculatorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test //1
    public void add() {
        Assert.assertEquals(service.add(5,2),7);        
    }
    @Test 
    public void subtract() {
        Assert.assertEquals(service.subtract(5,2),3);        
    }
    @Test //2
    public void sameValue(){
        Assert.assertSame(true, service.sameValue(12,12));
    }
    @Test //3
    public void notSameValue(){
        Assert.assertNotSame(true, service.notSameValue(12,12));
    }
    @Test //4
    public void valTrue(){
        Assert.assertTrue(service.valTrue(true),"true");  
    } 
    @Test //5
    public void valFalse(){
        Assert.assertFalse(service.valFalse(false),"false");  
    } 
    @Test //6
    public void valNull(){
        Integer obj = null;
        Assert.assertNull(service.valNull(obj));        
    }
    @Test //7
    public void valNotNull(){
        Integer obj = 10;
        Assert.assertNotNull(service.valNotNull(obj));
    }
    
    @Ignore("Ignore deliberate fail test")     //According to a website i read, ignore works with JUnit test, and then'enabled = false' in TestNG
    @Test (enabled = false) //8       
    public void failedTest(){
        Assert.fail();
    }
    
    @Test (timeOut = 10)//9 &10
    public void verifyArrayContents()throws Exception{
        String[] arrayCars ={"Toyota","Subaru"};
        String[] arrayContent ={"Toyota","Subaru"};
        Assert.assertTrue(service.arrayEqualTest(arrayCars,arrayContent));        
        //Assert.assertArrayEquals(arrayCars,arrayContent, ""); 
        Thread.sleep(0);
    }
     @Test(expectedExceptions = IndexOutOfBoundsException.class) //11
    public void verifyArrayAtPosition() throws Exception{
        String[] arrayCars ={"Toyota","Subaru"};
        Assert.assertEquals(service.getValueInArray(arrayCars),"Toyota");
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
