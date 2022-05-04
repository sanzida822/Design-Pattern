/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy_insta_fb;

/**
 *
 * @author Arafat
 */
public class SocialMediaContext {
    SocialMediaStratey strategy;
    String name;
    public void setName(String name){
    this.name=name;
    }
    public void setSocialMedia(SocialMediaStratey strategy){
    this.strategy=strategy;
    }
    public void connect(){
        System.out.println(this.name+" here!");
        this.strategy.connectTo();
    
    }
}
