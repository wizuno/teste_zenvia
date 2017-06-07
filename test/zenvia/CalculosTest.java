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
    public void testMultiplos3E5() {
        
        assertEquals("Multiplo de 3 e 5",0,c.Mu3E5(15));
        
    }

    @Test
    public void testNaoMultiplos3E5() {
        
        assertEquals("Nao multiplo de 3 e 5",1,c.Mu3E5(16));

    }
    
    @Test
    public void testMultiplos3() {
        
        assertEquals("Multiplo de 3",0,c.Mu3(3));  
    }
    
    @Test
    public void testNaoMultiplos3() {
        
        assertEquals("Nao multiplo de 3",1,c.Mu3(4));
        
    }
    
    @Test
    public void testMultiplos5() {
        
        assertEquals("Multiplo 5",0,c.Mu5(5));    
    }
    
    @Test
    public void testNaoMultiplos5() {
        
        assertEquals("Nao multiplo 5",1,c.Mu5(6));
    }
    
    @Test
    public void NaoMultiplo(){
        
        assertEquals("Nao multiplo",0,c.MuN(7));
    }
    
}
