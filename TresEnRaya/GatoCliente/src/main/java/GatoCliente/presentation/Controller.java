package GatoCliente.presentation;

import GatoCliente.logic.ServiceProxy;
import GatoProtocolo.Message;
import GatoProtocolo.User;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Controller {
    Model model;
    gatoView view;
    ServiceProxy localService;
    TableroValidate valida;
    
    public Controller(gatoView view, Model model) {
        this.view = view;
        this.model = model;
        valida = new TableroValidate(view);
        localService = (ServiceProxy)ServiceProxy.instance();
        localService.setController(this);
        view.setController(this);
        view.setModel(model);
    }

    public void login(User u) throws Exception{
        User logged=ServiceProxy.instance().login(u);
        model.setCurrentUser(logged);
        model.commit(Model.USER);
    }

    public void post(String text){
        Message message = new Message();
        message.setMessage(text);
        message.setSender(model.getCurrentUser());
        ServiceProxy.instance().post(message);
        model.commit(Model.CHAT);
    }

    public void logout(){
        try {
            ServiceProxy.instance().logout(model.getCurrentUser());
            model.setMessages(new ArrayList<>());
            model.commit(Model.CHAT);
        } catch (Exception ex) {
        }
        model.setCurrentUser(null);
        model.commit(Model.USER+Model.CHAT);
    }
        
    public void deliver(Message message){
        model.messages.add(message);
        model.commit(Model.CHAT);       
    } 
    
    public void jugada(Message m){
        switch( m.getMessage()){
              case "btn1" -> { escene(m, view.getBtnJugada_1()); } 
              case "btn2" -> { escene(m, view.getBtnJugada_2()); }
              case "btn3" -> { escene(m, view.getBtnJugada_3()); }
              case "btn4" -> { escene(m, view.getBtnJugada_4()); }
              case "btn5" -> { escene(m, view.getBtnJugada_5());}
              case "btn6" -> { escene(m, view.getBtnJugada_6()); }
              case "btn7" -> { escene(m, view.getBtnJugada_7()); }
              case "btn8" -> { escene(m, view.getBtnJugada_8()); }
              case "btn9" -> { escene(m, view.getBtnJugada_9()); } 
         default -> System.out.println("Dato Corrompido: "+m.getMessage()); }
    }
    
    public void escene(Message m, JButton btn){
           btn.setEnabled(false);
        if (m.getSender().equals(model.getCurrentUser())) {
              btn.setText("X");
              view.getTurno().setText("Jugador en turno");
              if(valida.validaTablero("X")){
                   JOptionPane.showMessageDialog(null, "Felicidades has ganado la partida", "¡Victoria!", JOptionPane.INFORMATION_MESSAGE);
                   this.logout();
                   view.cleanWindow();
              }else if(!valida.empate()){
                  JOptionPane.showMessageDialog(null, "Muy lentos, tendra que practicar ambos...", "¡Empate!", JOptionPane.INFORMATION_MESSAGE);
                  this.logout();
                  view.cleanWindow();
              }
          } else {
              btn.setText("O");
              view.getTurno().setText("Tu turno");
              if(valida.validaTablero("O")){
                   JOptionPane.showMessageDialog(null, "El jugador: "+m.getSender().getNombre()+" te ha ganado", "¡Derrota!", JOptionPane.ERROR_MESSAGE);
                   this.logout();
                   view.cleanWindow();
              }
         }
    }
}
