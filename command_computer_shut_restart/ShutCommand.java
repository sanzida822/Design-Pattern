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
public class ShutCommand implements Command {

    Computer comp;

    public ShutCommand(Computer comp) {
        this.comp = comp;
    }

    @Override
    public void execute() {
        comp.shutDown();
    }

}
