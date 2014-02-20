/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package michaelfouche.tp2.config;

import michaelfouche.tp2.service.CalculatorService;
import michaelfouche.tp2.service.Impl.CalculatorServiceImpl;
import michaelfouche.tp2.service.Impl.superCalc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author student
 */
@Configuration
public class appConfig {
    @Bean(name = "calc")
            public CalculatorService GetService()
            {
                return new CalculatorServiceImpl();
            }
  /*  @Bean(name = "calc")
            public CalculatorService GetServiceNew()
            {
                return new superCalc();
            }*/
    
}
