/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy_insta_fb;

//
//I want to design a social media application which allows me to connect to my friends on all four social platforms
//i.e. Facebook, Google Plus, Twitter and Orkut (for example sake). Now I want that client should be able to tell the 
//name of friend and desired platform – then my application should connect to him transparently.
public interface SocialMediaStratey {
    public void connectTo();
}
