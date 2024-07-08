package GatoCliente.presentation;

public class TableroValidate {

    private gatoView view;

    public TableroValidate(gatoView view) {
        this.view = view;
    }
    
    public boolean validaTablero(String simbolo){
        if(jugada1(view, simbolo)){ return true;}else 
        if(jugada2(view, simbolo)){ return true;}else 
        if(jugada3(view, simbolo)){ return true;}else 
        if(jugada4(view, simbolo)){ return true;}else 
        if(jugada5(view, simbolo)){ return true;}else
        if(jugada6(view, simbolo)){ return true;}else 
        if(jugada7(view, simbolo)){ return true;}else
        return jugada8(view, simbolo);
    }
    
    private boolean jugada1(gatoView view, String simbolo){ return view.getBtnJugada_1().getText().equals(simbolo) && view.getBtnJugada_2().getText().equals(simbolo) && view.getBtnJugada_3().getText().equals(simbolo); }
    private boolean jugada2(gatoView view, String simbolo){ return view.getBtnJugada_4().getText().equals(simbolo) && view.getBtnJugada_5().getText().equals(simbolo) && view.getBtnJugada_6().getText().equals(simbolo); }
    private boolean jugada3(gatoView view, String simbolo){ return view.getBtnJugada_7().getText().equals(simbolo) && view.getBtnJugada_8().getText().equals(simbolo) && view.getBtnJugada_9().getText().equals(simbolo); }
    private boolean jugada4(gatoView view, String simbolo){ return view.getBtnJugada_1().getText().equals(simbolo) && view.getBtnJugada_5().getText().equals(simbolo) && view.getBtnJugada_9().getText().equals(simbolo); }
    private boolean jugada5(gatoView view, String simbolo){ return view.getBtnJugada_3().getText().equals(simbolo) && view.getBtnJugada_5().getText().equals(simbolo) && view.getBtnJugada_7().getText().equals(simbolo); }
    private boolean jugada6(gatoView view, String simbolo){ return view.getBtnJugada_1().getText().equals(simbolo) && view.getBtnJugada_4().getText().equals(simbolo) && view.getBtnJugada_7().getText().equals(simbolo); }
    private boolean jugada7(gatoView view, String simbolo){ return view.getBtnJugada_2().getText().equals(simbolo) && view.getBtnJugada_5().getText().equals(simbolo) && view.getBtnJugada_8().getText().equals(simbolo); }
    private boolean jugada8(gatoView view, String simbolo){ return view.getBtnJugada_3().getText().equals(simbolo) && view.getBtnJugada_6().getText().equals(simbolo) && view.getBtnJugada_9().getText().equals(simbolo); }
    
    public boolean empate(){
        return !(view.getBtnJugada_1().isEnabled() && view.getBtnJugada_2().isEnabled() && view.getBtnJugada_3().isEnabled() 
                && view.getBtnJugada_4().isEnabled() && view.getBtnJugada_5().isEnabled() && view.getBtnJugada_6().isEnabled()
                && view.getBtnJugada_7().isEnabled() && view.getBtnJugada_8().isEnabled() && view.getBtnJugada_9().isEnabled()
                );
    }
}
