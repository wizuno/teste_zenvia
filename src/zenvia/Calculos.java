/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zenvia;

/**
 *
 * @author willhs
 */
public class Calculos {
    
    boolean MultiploDeTres(int numero){
        
        if(numero%3 ==0){
            return true;
        }
        else{
        return false;    
        } 
    }
    
    boolean MultiploDeCinco(int numero){
        
        if(numero%5 ==0){
            return true;
        }
        else{
        return false;    
        }
    }
    
    boolean MultiploDeTresECinco(int numero){
        
        if(numero%3 == 0 && numero%5 == 0){
            return true;
        }
        else{
        return false;    
        }
    }
    
}
