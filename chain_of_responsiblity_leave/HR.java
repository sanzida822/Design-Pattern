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
public class HR extends LeaveHandler {

    @Override
    public String applyLeave(Leave leave) {
        if (leave.getDays() <= 21) {
            if (leave.getEmpTier() <= 3 && leave.getReason().equals(ReasonType.REGULAR)) {
                return "Your leave days has been APPROVED by HR";
            } else {
                return "Your leave days has denied APPROVED by HR";
            }
        } else {
            return supervisor.applyLeave(leave);
        }
    }

}
