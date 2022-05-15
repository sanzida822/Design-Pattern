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
public abstract class Collegues {

    Mediator mdt;

    public Collegues(Mediator mdt) {
        this.mdt = mdt;
    }

    public abstract void sendMessage(String messsage);

    public abstract void receiveMessage(String message);

}
