/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command_computer_shut_restart;

/**
 *
 * @author Arafat
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Computer comp=new Computer();
       comp.setCommand(CommandType.SHUT);
       Switch stc=new Switch();
       stc.executeCommand(new ShutCommand(comp));

       comp.setCommand(CommandType.RESTART);
       stc.executeCommand(new RestartCommand(comp));
       
       comp.setCommand(CommandType.SHUT);
       stc.executeCommand(new RestartCommand(comp));
    //   stc.removeCommand(new RestartCommand(comp));
              
       
       
    }
    
}
