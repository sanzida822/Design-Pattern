
package chain_of_responsiblity_leave;

public abstract class LeaveHandler {
    protected LeaveHandler supervisor;
    public void setSupervisor(LeaveHandler supervisor){
    this.supervisor=supervisor;
             
    }
    public abstract String applyLeave(Leave leave);
    
}
