/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multi;

/**
 *
 * @author HannaSnejder
 */
public class Multi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MultiUI mui = new MultiUI();
        mui.setVisible(true);
        
        //gör de nya trådarna 
        Printer p1 = new Printer("Tråd nummer 1 ", mui);
        Thread t1 = new Thread(p1);
        Printer p2 = new Printer("Tråd nummer 2 ", mui);
        Thread t2 = new Thread(p2);
        Printer p3 = new Printer("Tråd nummer 3", mui);
        Thread t3 = new Thread(p3);
        
        System.out.println("Startar 3 trådar...");
        
        //startar trådarna här
        t1.start();
        t2.start();
        t3.start(); 
        
        System.out.println("Trådar startade, main avslutas");
    }
    
}
