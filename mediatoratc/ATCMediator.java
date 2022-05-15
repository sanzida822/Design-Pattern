
package mediatoratc;

public class ATCMediator implements IATCMediator{
    Runway runway;
    Flight flight;
    public boolean status;
    public boolean land;
    public void RegisterRunway(Runway runway) {
        this.runway=runway;
    }

    @Override
    public void RegisterFlight(Flight flight) {
        this.flight=flight;
    }

    @Override
    public boolean isLandingOk() {
        return land;
    }

    @Override
    public void setLandingStatus(boolean status) {
        this.land=status;
    }
    
}
