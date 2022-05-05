package chain_of_responsiblity_leave;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arafat
 */
public class LeaveReqApp {
    public static void main(String[] args) {
        TeamLeader team=new TeamLeader();
        ProjectLeader project=new ProjectLeader();
        HR hr=new HR();
        Manager manager=new Manager();
        team.setSupervisor(project);
        project.setSupervisor(hr);
        hr.setSupervisor(manager);
        
        Leave leave=new Leave(5, 4, ReasonType.REGULAR);
        System.out.println(team.applyLeave(leave));
        
        Leave leave1=new Leave(8, 4, ReasonType.REGULAR);
        System.out.println(team.applyLeave(leave1));
        
        Leave leave3=new Leave(19, 2, ReasonType.REGULAR);
        System.out.println(team.applyLeave(leave3));
        
        Leave leave4=new Leave(25, 2, ReasonType.REGULAR);
        System.out.println(team.applyLeave(leave4)); //denied bcz manager can handle reason type special
        
        Leave leave5=new Leave(25, 2, ReasonType.SPECIAL);
        System.out.println(team.applyLeave(leave5));
        
        
    }
}
