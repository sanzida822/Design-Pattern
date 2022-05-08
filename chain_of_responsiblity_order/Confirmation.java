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
public class Confirmation extends OrderHandler{

    @Override
    public void processRequest(Order order) {
       if(order.getAmount()>=1 && order.getType().equals(OrderType.CONFIRMATION)){
            System.out.println("our order has been placed successfully");
        }else{
        System.out.println("Request cannot be processed by any one of handlers");
        
        }
    }
    
}
