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
    
    public String msg = "";
    private int restoFizz;
    private int restoBuzz;

    @Override
    public String calculoMultiplos(int dividendo, int numeroFizz, int numeroBuzz) {
     
        restoFizz = dividendo % numeroFizz;
        restoBuzz = dividendo % numeroBuzz;
        
        msg = Integer.toString(dividendo);
        
        if(restoFizz == 0 && restoBuzz == 0){
            msg = "FizzBuzz";
            return msg;
        }
        if(restoFizz == 0){
            msg = "Fizz";
            return msg;
        }
        if(restoBuzz == 0){
            msg = "Buzz";
            return msg;
        }

        return msg;
    }
    
}
