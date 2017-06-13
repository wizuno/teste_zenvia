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
    
    public String msg = "";
    private int resto;
    private int resto1;
    
    /* O problema com esse código ao meu ver, é que uma hora vou ter que validar o resultado, 
       e recebendo também a mensagem que quer que seja exibida*/
    String Calculo1 (int dividendo, int divisor, String mensagem){
   
        resto = dividendo % divisor;
        
        if(resto != 0){
            mensagem = Integer.toString(dividendo);
        }
        
        return mensagem;
        
    }
    
     /* O problema com esse código ao meu ver, é que uma hora vou ter que validar o resultado*/
    String Calculo1_2 (int dividendo, int divisor){
   
        switch (divisor){
            case 3:
                msg = "Fizz";
                break;
            case 5:
                msg = "Buzz";
                break;
            case 15:
                msg = "FizzBuzz";
                break;
        }
        
        resto = dividendo % divisor;
        
        if(resto != 0){
            msg = Integer.toString(dividendo);
        }
        
        return msg;
        
    }
    
    /* Ao meu ver o problema seriam os 4 ifs */
    String Calculo2 (int dividendo){
        
        
        resto = dividendo % 3;
        resto1 = dividendo % 5;
        
        msg = Integer.toString(dividendo);
        
        if(resto == 0 && resto1 == 0){
            msg = "FizzBuzz";
        }
        
        if(resto == 0 && resto1 != 0){
            msg = "Fizzz";
        }
        
        if(resto != 0 && resto1 == 0){
            msg = "Buzz";
        }

        return msg;
    }
    
    /* Nesse caso, eu deixei mais generico para receber dois números quaisquer */
    String Calculo2_1 (int dividendo, int divisor, int divisor2){
        
        resto = dividendo % divisor;
        resto1 = dividendo % divisor2;
        
        msg = Integer.toString(dividendo);
        if(resto1 == 0 && resto == 0){
            msg = "FizzBuzz";
        }
        if(resto == 0 && resto1 != 0){
            msg = "Fizz";
        }
        if(resto != 0 && resto1 == 0){
            msg = "Buzz";
        }

        return msg;
    }

}
