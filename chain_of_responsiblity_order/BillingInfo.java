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
public class BillingInfo extends OrderHandler{

    @Override
    public void processRequest(Order order) {
       if(order.getAmount()>=1 && order.getType().equals(OrderType.BILLING_INFO)){
            System.out.println("Enter billing or shipping information");
        }else{
        handler.processRequest(order);
    }
    
}
}