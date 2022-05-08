/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obeserver_binary_ortal;

/**
 *
 * @author Arafat
 */
public class OctalObserver extends Observer{
public OctalObserver(Subject sub){
this.sub=sub;

}
    @Override
    public void update() { 
        System.out.println("Octal form="+Integer.toOctalString(sub.getState()));
    }
    
}
