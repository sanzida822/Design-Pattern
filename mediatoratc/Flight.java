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
public class Flight {
    private IATCMediator atcmediator;
    
    public Flight(IATCMediator atcmediator){
    this.atcmediator=atcmediator;
    }
    public void land(){
    if(atcmediator.isLandingOk()){
        System.out.println("Successfully landed");
        atcmediator.setLandingStatus(true);
    
    }else{
        System.out.println("Waiting for landing");
    }
    
    }
    
    public void getReady(){
        System.out.println("Ready for landing");
    
    }
}
