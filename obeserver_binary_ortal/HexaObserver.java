
package obeserver_binary_ortal;

/**
 *
 * @author Arafat
 */
public class HexaObserver extends Observer{
public HexaObserver(Subject sub){
this.sub=sub;

}
    @Override
    public void update() {
       
        System.out.println("Hexa form="+Integer.toHexString(sub.getState()));
    }
    
}
