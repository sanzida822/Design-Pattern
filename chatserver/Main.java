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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       chatServerMediator chat=new ConcreteMediator();
       Participant p1=new Participant(chat);
       Participant p2=new Participant(chat);
       Participant p3=new Participant(chat);
       p1.setName("sanzida");
       p2.setName("sultana");
       p3.setName("nitu");
       p1.joinChatRoom();
       
       p2.joinChatRoom();
       p3.joinChatRoom();
       p1.sendMessage("hi");
       
       
    }
    
}
