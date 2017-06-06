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
    
    public int resp =1;
    
    void Multiplos3E5 (int numero){
     
          if(numero%3 == 0 && numero%5 == 0){
                System.out.println("FizzBuzz");
                resp = 0;
            }
            else{
              Multiplos3(numero);
          }
                 
    }
    
    void Multiplos3 (int numero){
        
        if(numero%3 == 0){
            System.out.println("Fizz");
            resp = 0;
        }
        else{
            Multiplos5(numero);
        }
        
    }
    
    void Multiplos5(int numero){
        
        if(numero%5 == 0){
            System.out.println("Buzz");
            resp =0;
        }
        else{
            resp = 4;
            System.out.println(numero);
        }    
    }
    
}
