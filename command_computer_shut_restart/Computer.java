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
public class Computer {

   CommandType type;
    
    public void setCommand(CommandType type){
    this.type=type;
    }
    public CommandType getCommand(){
    return this.type;
    }

    public void shutDown( ) {
        if(this.type==CommandType.SHUT){
            System.out.println("Computer is shut down");
        }else{
            System.out.println("Wrong Command");
        }
    }

    public void restart( ) {
        if (this.type == CommandType.RESTART) {
            System.out.println("The computer is restart");
        }else{
            System.out.println("Wrong Command");
        }
    }
}
