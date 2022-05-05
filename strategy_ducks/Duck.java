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
abstract public class Duck {
  FlyBehavior flybehavior;
  Quack quack;
  public abstract void display();
  public void performFly(){
  flybehavior.fly();
  } 
  public void performQuack(){
  quack.Quack();
  }
  public void swim(){
      System.out.println("I can swim");
  }
  public void setFlyBehavior(FlyBehavior flybehavior){
  this.flybehavior=flybehavior;
  
  }
  public void setQuackBehavior(Quack quack){
  this.quack=quack;
  }
          
}
