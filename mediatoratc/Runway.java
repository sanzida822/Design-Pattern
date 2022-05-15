/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatoratc;

/**
 *
 * @author Arafat
 */
public class Runway {
    IATCMediator atcmediator;
    
    public Runway(IATCMediator atcmediator){
        this.atcmediator=atcmediator;
        this.atcmediator.setLandingStatus(true);
    
    }
    
    public void land(){
        System.out.println("Landing permission granted");
        atcmediator.setLandingStatus(true);
    
    }
}
