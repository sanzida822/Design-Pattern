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
public class Main {
    public static void main(String[] args) {
        Document docc=new Document();
        docc.setString("Hi");
       INVOKER invoke=new INVOKER();
       invoke.executeCommand(new Undo(docc));
       INVOKER invoke2=new INVOKER();
      // invoke2.executeCommand(new Redo(docc));
       docc.setString("Nitu");
       docc.setString("How");
       INVOKER inv=new INVOKER();
       inv.executeCommand(new Undo(docc));
       
       invoke2.executeCommand(new Redo(docc));
       
       
       
    }
}
