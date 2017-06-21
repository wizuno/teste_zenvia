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
    public void testMultiplosDe3E5(){
        
        assertEquals("Multiplo de 3 e 5","FizzBuzz", c.calculoMultiplos(15, 3, 5));
        
    }
    
    @Test
    public void testNaoMultiplosDe3E5(){
        
        assertEquals("Não Multiplo de 3 e 5","16", c.calculoMultiplos(16, 3, 5));
        
    }
    
    @Test
    public void testMultiplosDe3(){
        
        assertEquals("Multiplo de 3","Fizz", c.calculoMultiplos(3, 3, 5));
        
    }
    
    @Test
    public void testNaoMultiplosDe3(){
        
        assertEquals("Não Multiplo de 3","4", c.calculoMultiplos(4, 3, 5));
        
    }
    
    @Test
    public void testMultiplosDe5(){
        
        assertEquals("Multiplo de 5","Buzz", c.calculoMultiplos(5, 3, 5));
        
    } 
    
    @Test
    public void testNaoMultiplosDe5(){
        
        assertEquals("Não Multiplo de 5","7", c.calculoMultiplos(7, 3, 5));
        
    } 
      
}
