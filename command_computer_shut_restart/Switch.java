/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command_computer_shut_restart;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Arafat
 */
public class Switch {
  //  Command command;
    public List<Command> list=new ArrayList<>();
    Computer comp;

    public void executeCommand(Command command){
    list.add(command);
    command.execute();
    
    
    }
//    public void removeCommand(Command command){
//    
//    
// //   list.remove(list.indexOf(command));
//       // System.out.println(list.size());
//    for(int i=0;i<list.size();i++){
//        System.out.println(""+list.get(i));
//    }
//        //System.out.println(list);
//    
//    }
}
