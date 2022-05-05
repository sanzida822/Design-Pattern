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
public class Manager extends LeaveHandler{

    @Override
    public String applyLeave(Leave leave) {
        if(leave.getDays()>21 ){
        if(leave.getEmpTier()<=2 && leave.getReason().equals(ReasonType.SPECIAL)){
        return "Your leave days has been APPROVED by Manager";
        }else{
        return "Your leave days has been denier by Manager";
        }
        }
        return supervisor.applyLeave(leave);
    }
    
}
