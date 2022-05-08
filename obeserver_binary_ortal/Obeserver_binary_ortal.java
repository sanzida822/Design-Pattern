/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obeserver_binary_ortal;

/**
 *
 * @author Arafat
 */
public class Obeserver_binary_ortal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Subject sub = new Subject();
        sub.addObserver(new BinaryObserver(sub));
        sub.addObserver(new OctalObserver(sub));
        sub.addObserver(new HexaObserver(sub));
        sub.setState(15);

        sub.notifyAllOberver();

    }

}
