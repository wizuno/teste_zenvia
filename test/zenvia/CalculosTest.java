/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zenvia;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author willhs
 */
public class CalculosTest {
    
    Calculos c = new Calculos();
    
    @Test
    public void testMultiploDeTres() {
        
        assertEquals("Multiplo de 3", true, c.MultiploDeTres(3));
    }
    
    @Test
    public void testNaoMultiploDeTres() {
        
        assertEquals("Não é Multiplo de 3", false, c.MultiploDeTres(4));
    }

    @Test
    public void testMultiploDeCinco() {
        
        assertEquals("Multiplo de 5", true, c.MultiploDeCinco(5));
    }
    
    @Test
    public void testNaoMultiploDeCinco() {
        
        assertEquals("Não é Multiplo de 5", false, c.MultiploDeTres(5));
    }   
     @Test
    public void testMultiploDeTresECinco() {
       assertEquals("Multiplo de 3 e 5 ", true, c.MultiploDeTresECinco(15));
    }
    
    @Test
    public void testNaoMultiploDeTresECinco() {
       assertEquals("Não é Multiplo de 3 e 5 ", false, c.MultiploDeTresECinco(14));
    }
    
}
