
package chatserver;


public class Participant {
    String name;
   chatServerMediator  chatserver;

    public Participant(chatServerMediator chatroom) {
        this.chatserver=chatroom;
    }
    
    public void setName(String name){
    this.name=name;
    }
    public String getName(){
    return this.name;
    }
    public void joinChatRoom(){
    chatserver.addUser(this);
    }
    public void sendMessage(String message){
        System.out.println("sending msg:"+message );
        chatserver.sendMessage(this, message);
    
    
    }
    public void receivemsg(String msg,Participant p){
        System.out.println(name+" received msg from "+p.getName()+"msg is "+msg);
    }
}
