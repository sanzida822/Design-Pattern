/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy_ducks;

/**
 *
 * @author Arafat
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        flybehavior =new FlyWithWings();
        quack=new Quack();
    }
    
    @Override
    public void display() {
        System.out.println("I am real Mallard Duck"); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
