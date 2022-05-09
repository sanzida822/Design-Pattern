/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern_insert_delete;

/**
 *
 * @author Arafat
 */
public class INVOKER {

    Command cmd;
    public void executeCommand(Command command){
    command.execute();
    
    }

}
