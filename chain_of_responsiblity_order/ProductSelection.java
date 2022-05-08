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
public class ProductSelection extends OrderHandler{

  
    @Override
    public void processRequest(Order order) {
        if(order.getAmount()>=1 && order.getType().equals(OrderType.SELECT)){
            System.out.println("Select a product you would like to buy");
        }else{       
        //handler.setNextHandler(handler);
        handler.processRequest(order);
            //processRequest(order);
           
        }
    }
    
}
