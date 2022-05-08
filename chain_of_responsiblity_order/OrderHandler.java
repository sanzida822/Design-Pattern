/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain_of_responsiblity_order;

/**
 *
 * @author Arafat
 */
public abstract class OrderHandler {
    OrderHandler handler;
  //  String gg;
    public void setNextHandler(OrderHandler handler){
        this.handler=handler;   
    }
    public abstract void processRequest(Order order);
    
}
