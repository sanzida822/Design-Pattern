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
public class DuckSimulator {
    public static void main(String[] args) {
        MallardDuck ml=new MallardDuck();
        ml.display();
        ml.performFly();
        ml.performQuack();
        System.out.println("");
        Duck modolduck=new ModolDuck();
        modolduck.display();
        modolduck.setFlyBehavior(new FlyNoWay());
        modolduck.performFly();
        
        modolduck.setQuackBehavior(new  Quack());
        modolduck.performQuack();
        
        
       
        
    
    
}
}