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
public class FlyRocketPower implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can flying with rocket power");
    }
    
}
