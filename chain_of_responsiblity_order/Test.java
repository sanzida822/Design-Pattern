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
public class Test {
    public static void main(String[] args) {
       ProductSelection ps=new ProductSelection();
       Registration rg=new Registration();
       BillingInfo bi=new BillingInfo();
       Payment py=new Payment();
       Confirmation cf=new Confirmation();
       
       ps.setNextHandler(rg);
       rg.setNextHandler(bi);
       bi.setNextHandler(py);
       py.setNextHandler(cf);
       
       Order order =new Order(1,OrderType.REGISTER);
       ps.processRequest(order);
       
    }
}