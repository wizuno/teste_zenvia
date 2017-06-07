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
public class Zenvia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculos c = new Calculos();
        
        for(int i=1; i <101; i++){
            c.Mu3E5(i);
            c.Mu3(i);
            c.Mu5(i);
            c.MuN(i);
        }
    }
    
}
