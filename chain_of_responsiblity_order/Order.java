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
public class Order {
    private int amount;
    public OrderType type;

    public Order(int amount,OrderType type) {
        this.amount=amount;
        this.type=type;
    }
    
 
 
 
    public int getAmount(){
    return this.amount;
    }
    public OrderType getType(){
    return this.type;
    }
}
