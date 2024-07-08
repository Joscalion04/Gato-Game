package GatoCliente.presentation;

import GatoProtocolo.Message;
import GatoProtocolo.User;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("deprecation")
public class Model extends java.util.Observable {
    User currentUser;
    List<Message> messages;

    public Model() {
       currentUser = null;
       messages= new ArrayList<>();
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public void addObserver(java.util.Observer o) {
        super.addObserver(o);
        this.commit(Model.USER+Model.CHAT);
    }
    
    public void commit(int properties){
        this.setChanged();
        this.notifyObservers(properties);        
    } 
    
    public static int USER=1;
    public static int CHAT=2;
}
