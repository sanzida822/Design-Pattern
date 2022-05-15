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
public class Collengue1 extends Collegues {

    public Collengue1(Mediator mdt) {
        super(mdt);
    }

   

    @Override
    public void sendMessage(String message) {
        mdt.sendMessage(this, message);
       
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("thw message from clg2: "+message);
    }
    
}
