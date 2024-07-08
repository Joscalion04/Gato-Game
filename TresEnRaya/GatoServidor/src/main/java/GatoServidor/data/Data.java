package GatoServidor.data;

import GatoProtocolo.User;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private List<User> users;

    public Data() {
        users = new ArrayList<>();
        users.add(new User("chepe", "001", "Jose"));
        users.add(new User("mia", "005", "Maria"));
        users.add(new User("juanchi", "006", "Juan"));
        users.add(new User("pedrosky", "007", "Pedro"));
        users.add(new User("lito", "008", "Pablo"));
        users.add(new User("celita", "009", "Marcela"));
        users.add(new User("betto", "010", "Roberto"));
        users.add(new User("silvis", "011", "Silvia"));
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void create(User newUser) {
        users.add(newUser);
    }


    public User read(String nombre, String clave) {
        for (User user : users) {
            if (user.getNombre().equals(nombre) && user.getClave().equals(clave)) {
                return user;
            }
        }
        return null;
    }

    public void update(User updatedUser) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(updatedUser.getId())) {
                users.set(i, updatedUser);
                return;
            }
        }
    }

    public void delete(String userId) {
        users.removeIf(user -> user.getId().equals(userId));
    }
}