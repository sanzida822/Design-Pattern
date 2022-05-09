/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern_insert_delete;

import java.util.ArrayList;

/**
 *
 * @author Arafat
 */
public class Document {
    
    
    ArrayList<String> list=new ArrayList<>();
    String str="";
    public void setString(String text){
   this.str+=text;
    
    }
    public String getString(){
    return this.str;
    }
    public void add(){
    list.add(this.getString());
        System.out.println(list);
    }
    public void erase(){
    list.remove(this.getString());
        System.out.println(list);
    }
}
