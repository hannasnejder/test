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
import java.util.Random;

public class Printer implements Runnable{
    private int sleepTime;
    private String threadName;
    private static Random generator = new Random();
    private MultiUI mui;
  
    
    public Printer(String name, MultiUI mui){
        threadName = name;
        this.mui = mui;
        sleepTime = generator.nextInt(20000);
    }
    
    
    
    @Override
    public void run(){
      
        try{
            
            mui.addText(threadName + " kommer att köra i " + sleepTime + " millisekunder. \n");
            int i = 1;
            while(i<=20){
                Thread.sleep(sleepTime / 20);
                mui.addText("Jag är  " + threadName + "\n");
                i++;
            }
        }catch (InterruptedException exception){
    }
       
    mui.addText(threadName + " är nu klar. \n");
        
    }
}
