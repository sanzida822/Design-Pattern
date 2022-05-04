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
public class FbStrategy implements SocialMediaStratey {

    @Override
    public void connectTo() {
        System.out.println("Facebook connected");
    }
    
}
