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
public class Collegue2 extends Collegues{

    public Collegue2(Mediator mdt) {
        super(mdt);
    }

    @Override
    public void sendMessage(String messsage) {
        mdt.sendMessage(this, messsage);
    }
    

    @Override
    public void receiveMessage(String message) {
        System.out.println("message from clg1: "+message);
    }
    
}
