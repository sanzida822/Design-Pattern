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
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ConcreteMediator mdt=new ConcreteMediator();
     Collengue1 Sanzida=new Collengue1(mdt);
     Collegue2 Nitu =new Collegue2(mdt);
     
     mdt.setCollegue(Sanzida, Nitu);
     Sanzida.sendMessage("I am sanzida.sending msg to clg2");
     Nitu.sendMessage("I am Nitu.Sending msg to clg1");
     
    }
    
}
