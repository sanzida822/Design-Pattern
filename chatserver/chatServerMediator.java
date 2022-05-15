/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver;

/**
 *
 * @author Arafat
 */
public interface chatServerMediator {
    public void sendMessage(Participant p,String message);
    public void addUser(Participant p);
}
