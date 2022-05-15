
package mediatoratc;


public interface IATCMediator {
  public void RegisterRunway(Runway runway);
  public void RegisterFlight(Flight flight);
  public boolean isLandingOk();
  public void setLandingStatus(boolean status);

  
}
