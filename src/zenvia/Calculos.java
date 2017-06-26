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
public class Calculos implements Multiplos {
    
    String msgFinal;
    String msgMultiplos;
    
    @Override
    public String calculoMultiplos(int dividendo, int numeroFizz, int numeroBuzz) {
         
        if(dividendo % numeroFizz == 0 && dividendo % numeroBuzz == 0){
            return "FizzBuzz";
        }
        if(dividendo % numeroFizz == 0){
            return "Fizz";
        }
        if(dividendo % numeroBuzz == 0){
            return "Buzz";
        }
        return Integer.toString(dividendo);
    }   
    
    @Override
    public String calculoMultiplos2(int dividendo, int numeroFizz, int numeroBuzz) {
         
        msgFinal = Integer.toString(dividendo);
        msgMultiplos = "";
        
        if(dividendo % numeroFizz == 0){
            msgFinal = "";
            msgMultiplos = "Fizz";
        }
        if(dividendo % numeroBuzz == 0){
            msgFinal = "";
            msgMultiplos = msgMultiplos + "Buzz";
        }
        msgFinal = msgFinal + msgMultiplos;
        
        return msgFinal;
    }  
}
