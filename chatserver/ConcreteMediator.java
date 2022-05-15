/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver;

import java.util.ArrayList;

/**
 *
 * @author Arafat
 */
public class ConcreteMediator implements chatServerMediator {

    ArrayList<Participant> participant;

    public ConcreteMediator() {
        participant = new ArrayList<>();
    }

    @Override
    public void sendMessage(Participant user, String message) {
        for (Participant p1 : participant) {
            if (p1 != user) {
                p1.receivemsg(message,user);
            }
        }
    }

    @Override
    public void addUser(Participant p) {
        participant.add(p);

    }

}
