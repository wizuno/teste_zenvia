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
        
        assertEquals(1, c.resp);
        c.Multiplos3E5(15);
        assertEquals(0, c.resp);
        
    }

    @Test
    public void testNaoMultiplos3E5() {
        
        assertEquals(1, c.resp);
        c.Multiplos3E5(16);
        assertEquals(4, c.resp);

    }
    
    @Test
    public void testMultiplos3() {
        
        assertEquals(1, c.resp);
        c.Multiplos3(3);
        assertEquals(0, c.resp);  
    }
    
    @Test
    public void testNaoMultiplos3() {
        
        assertEquals(1, c.resp);
        c.Multiplos3(4);
        assertEquals(4, c.resp);
        
    }
    
    @Test
    public void testMultiplos5() {
        
        assertEquals(1, c.resp);
        c.Multiplos5(5);
        assertEquals(0, c.resp);    }
    
    @Test
    public void testNaoMultiplos5() {
        
        assertEquals(1, c.resp);
        c.Multiplos5(6);
        assertEquals(4, c.resp);
    }
    
}
