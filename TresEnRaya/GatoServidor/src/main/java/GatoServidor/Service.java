package GatoServidor;

import GatoProtocolo.IService;
import GatoProtocolo.Message;
import GatoProtocolo.User;
import GatoServidor.data.Data;

public class Service implements IService{

    private Data data;
    
    public Service() {
        data =  new Data();
    }
    
    public void post(Message m){
        // if wants to save messages, ex. recivier no logged on
    }
    
    @Override
    public User login(User inputUser) {
        User authenticatedUser = data.read(inputUser.getNombre(), inputUser.getClave());
        if (authenticatedUser != null) {
            return authenticatedUser;
        } else {
            throw new RuntimeException("Nombre y/o clave incorrectos");
        }
    }

    public void logout(User p) throws Exception{
        //nothing to do
    }    
}
