/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obeserver_binary_ortal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Arafat
 */
public class Subject {

    Observer o;
    int state;
    private List<Observer> observerlist = new ArrayList<>();

    public void addObserver(Observer onserver) {
        observerlist.add(onserver);
    }

    public void removeObserver() {
        observerlist.remove(observerlist.size() - 1);

    }

    public void setState(int num) {
        this.state = num;

    }

    public int getState() {
        //System.out.println(this.state);
        return this.state;
    }

    public void notifyAllOberver() {
      for(Observer o:observerlist){
          o.update();
          
      }
    }
}
