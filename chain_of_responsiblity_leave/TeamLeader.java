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
public class TeamLeader extends LeaveHandler{

    public String applyLeave(Leave leave) {
      if(leave.getDays()<=7){
          // empTier should be 4 or above to approve leave
        if(leave.getEmpTier()<=4){
        return "your leave has been approved by the team leader";
        
        }else{
        return "Your employee tier is low "+leave.getDays();
        }   
      }
     return supervisor.applyLeave(leave);
    }
    
}
