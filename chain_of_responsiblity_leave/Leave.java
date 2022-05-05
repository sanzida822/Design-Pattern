/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain_of_responsiblity_leave;

/**
 *
 * @author Arafat
 */
public class Leave {
 int days,empTier;
 ReasonType reason;
 
    public Leave(int days,int empTier,ReasonType reason) {
        this.days=days;
        this.empTier=empTier;
        this.reason=reason;
    }
    public int getDays(){
    return this.days;
    }
    public int getEmpTier(){
    return this.empTier;
    }
    public ReasonType getReason(){
    return this.reason;
    }
}
