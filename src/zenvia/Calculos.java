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
    
    
    /*
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
    
    void Multiplos(int numero){
        int m3;
        int m5;
        int m35;
        
        m35 = numero%15;
        m3 = numero%3;
        m5 = numero%5;
        
        switch(m35){
            case 0:
                System.out.println("BuzzFizz");
                break;
            default:
                switch(m3){
                    case 0:
                        System.out.println("Buzz");
                        break;
                    default:
                        switch (m5){
                        case 0:
                            System.out.println("Fizz");
                            break;
                        default:
                            System.out.println(numero);
                            break;
                        }
                }
        }  
    } 
    
    void Teste (int numero){
        
        int m3;
        int m5;
        int m35;
        
        m35 = numero%15;
        m3 = numero%3;
        m5 = numero%5;
        
        if(m35 !=0 && m3 != 0 && m5 != 0){
           System.out.println(numero); 
        }
        if(m35 == 0){
            System.out.println("BuzzFizz");
        }
        if(m3 == 0){
            System.out.println("Buzz");
        }
        if(m5 == 0){
            System.out.println("Fizz");
        }
    } */
    
    int Mu3E5(int numero){
        int r = numero%15;
        
        if(r == 0){
            //System.out.println("BuzzFizz");
            resp=0;
        }
        return resp;
    }
    
    int Mu3(int numero){
        int r = numero%3;
        int r1 = numero%5;
        
        if(r == 0 && r1 != 0){
            //System.out.println("Buzz");
            resp=0;
        }
        return resp;
    }
    
    int Mu5(int numero){
        int r = numero%5;
        int r1 = numero%3;
        
        if(r == 0 && r1 != 0){
            //System.out.println("Fizz");
            resp=0;
        }
        return resp;
    }
    
    int MuN(int numero){
        int r = numero%15;
        int r1 = numero%3;
        int r2 = numero%5;
        
        if(r != 0 && r1 != 0 && r2 != 0){
            //System.out.println(numero);
            resp=0;
        }
        return resp;
    }
    
}
