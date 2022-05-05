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
public class ProjectLeader extends LeaveHandler{

    @Override
    public String applyLeave(Leave leave) {
        if(leave.getDays()<=14){
        if(leave.getEmpTier()<=3){
        return "Your leave days has been APPROVED by Project Leader";
        }else{
           return "You employee Tier level is too low for request "+leave.getDays();
        
        }
        }
        return supervisor.applyLeave(leave);
    
}
}