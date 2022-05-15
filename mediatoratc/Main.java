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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     IATCMediator atc=new ATCMediator();
     Flight sparrow=new Flight(atc);
     Runway runway1=new Runway(atc);
     atc.RegisterFlight(sparrow);
     atc.RegisterRunway(runway1);
     sparrow.getReady();
     runway1.land();
     sparrow.land();

    }
    
}
