/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator_msg_send;

/**
 *
 * @author Arafat
 */
public class ConcreteMediator implements Mediator {
    
    Collegues clg1, clg2;
    
    public void setCollegue(Collegues clg1, Collegues clg2) {
        this.clg1 = clg1;
        this.clg2 = clg2;
    }
    
    @Override
    public void sendMessage(Collegues clg, String message) {
        if (clg == clg1) {
            clg2.receiveMessage(message);
            
        } else if (clg == clg2) {
            clg2.receiveMessage(message);
        }
        
    }
    
}
