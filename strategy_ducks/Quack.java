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
public class Quack implements QuackBehavior{

    @Override
    public void Quack() {
        System.out.println("I can quack");    
    }
    
}
