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
public class Undo implements Command {
    Document doc;

    public Undo(Document doc) {
        this.doc=doc;
    }
    
    @Override
    public void execute() {
     doc.add();
    }
    
}
