package GatoCliente.presentation;

import GatoCliente.Application;
import GatoProtocolo.Message;
import GatoProtocolo.User;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.DefaultCaret;

public class gatoView extends javax.swing.JFrame implements Observer{

    Model model;
    Controller controller;
    
    public gatoView() {
        initComponents();
        logPanel.setVisible(true);
        Application.window.getRootPane().setDefaultButton(btn_Login);
        this.setSize(59, 320);
        gamePanel.setVisible(false);

        btn_Login.addActionListener((ActionEvent e) -> {
            String pass =  new String(txt_password.getPassword());
            User u = new User("",pass, txt_user.getText());
            txt_user.setBackground(Color.white);
            txt_password.setBackground(Color.white);
            try {
                controller.login(u);
                txt_user.setText("");
                txt_password.setText("");
            } catch (Exception ex) {
                txt_user.setBackground(Color.orange);
                txt_password.setBackground(Color.orange);
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        btn_Logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cleanWindow();
                controller.logout();
            }
        });
        btn_cerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnJugada_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txt_turno.getText().equals("Jugador en turno")){
                    JOptionPane.showMessageDialog(null, "Otro Jugador se encuentra jugando ", "¡No es tu turno!", JOptionPane.ERROR_MESSAGE);
                }else{
                 controller.post("btn1");
                }
            }
        });
        btnJugada_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txt_turno.getText().equals("Jugador en turno")){
                    JOptionPane.showMessageDialog(null, "Otro Jugador se encuentra jugando ", "¡No es tu turno!", JOptionPane.ERROR_MESSAGE);
                }else{
                      controller.post("btn2");
                }
            }
        });
        btnJugada_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txt_turno.getText().equals("Jugador en turno")){
                    JOptionPane.showMessageDialog(null, "Otro Jugador se encuentra jugando ", "¡No es tu turno!", JOptionPane.ERROR_MESSAGE);
                }else{
                    controller.post("btn3");
                }                
            }
        });
        btnJugada_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txt_turno.getText().equals("Jugador en turno")){
                    JOptionPane.showMessageDialog(null, "Otro Jugador se encuentra jugando ", "¡No es tu turno!", JOptionPane.ERROR_MESSAGE);
                }else{                
                controller.post("btn4");
                }
            }
        });
        btnJugada_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txt_turno.getText().equals("Jugador en turno")){
                    JOptionPane.showMessageDialog(null, "Otro Jugador se encuentra jugando ", "¡No es tu turno!", JOptionPane.ERROR_MESSAGE);
                }else{                
                controller.post("btn5");
                }
            }
        });
        btnJugada_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txt_turno.getText().equals("Jugador en turno")){
                    JOptionPane.showMessageDialog(null, "Otro Jugador se encuentra jugando ", "¡No es tu turno!", JOptionPane.ERROR_MESSAGE);
                }else{                
                controller.post("btn6");
                }
            }
        });
        btnJugada_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txt_turno.getText().equals("Jugador en turno")){
                    JOptionPane.showMessageDialog(null, "Otro Jugador se encuentra jugando ", "¡No es tu turno!", JOptionPane.ERROR_MESSAGE);
                }else{                
                controller.post("btn7");
                }
            }
        });
        btnJugada_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txt_turno.getText().equals("Jugador en turno")){
                    JOptionPane.showMessageDialog(null, "Otro Jugador se encuentra jugando ", "¡No es tu turno!", JOptionPane.ERROR_MESSAGE);
                }else{                
                controller.post("btn8");
                }
            }
        });
        btnJugada_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txt_turno.getText().equals("Jugador en turno")){
                    JOptionPane.showMessageDialog(null, "Otro Jugador se encuentra jugando ", "¡No es tu turno!", JOptionPane.ERROR_MESSAGE);
                }else{                
                controller.post("btn9");
                }
            }
        });
    }

    public void setModel(Model model) {
        this.model = model;
        model.addObserver(this);
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void cleanWindow(){
        btnJugada_1.setEnabled(true); btnJugada_1.setText("");
        btnJugada_2.setEnabled(true); btnJugada_2.setText("");
        btnJugada_3.setEnabled(true); btnJugada_3.setText("");
        btnJugada_4.setEnabled(true); btnJugada_4.setText("");
        btnJugada_5.setEnabled(true); btnJugada_5.setText("");
        btnJugada_6.setEnabled(true); btnJugada_6.setText("");
        btnJugada_7.setEnabled(true); btnJugada_7.setText("");
        btnJugada_8.setEnabled(true); btnJugada_8.setText("");
        btnJugada_9.setEnabled(true); btnJugada_9.setText("");
    }
    
    public JButton getBtnJugada_1() { return btnJugada_1;}
    public JButton getBtnJugada_2() { return btnJugada_2;}
    public JButton getBtnJugada_3() {return btnJugada_3; }
    public JButton getBtnJugada_4() { return btnJugada_4; }
    public JButton getBtnJugada_5() {return btnJugada_5;}
    public JButton getBtnJugada_6() { return btnJugada_6; }
    public JButton getBtnJugada_7() {return btnJugada_7; }
    public JButton getBtnJugada_8() {return btnJugada_8;}
    public JButton getBtnJugada_9() {return btnJugada_9; }
    
    public JPanel getGame(){return gamePanel;}
    
    public JLabel getTurno(){return txt_turno;}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        btn_Login = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        gamePanel = new javax.swing.JPanel();
        btnJugada_2 = new javax.swing.JButton();
        btnJugada_3 = new javax.swing.JButton();
        btnJugada_1 = new javax.swing.JButton();
        btnJugada_5 = new javax.swing.JButton();
        btnJugada_6 = new javax.swing.JButton();
        btnJugada_8 = new javax.swing.JButton();
        btnJugada_4 = new javax.swing.JButton();
        btnJugada_9 = new javax.swing.JButton();
        btnJugada_7 = new javax.swing.JButton();
        btn_Logout = new javax.swing.JButton();
        txt_turno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Password:");

        btn_Login.setText("LOGIN");

        btn_cerrar.setText("CERRAR");

        javax.swing.GroupLayout logPanelLayout = new javax.swing.GroupLayout(logPanel);
        logPanel.setLayout(logPanelLayout);
        logPanelLayout.setHorizontalGroup(
            logPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logPanelLayout.setVerticalGroup(
            logPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(logPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Login)
                    .addComponent(btn_cerrar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        btnJugada_2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btnJugada_3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btnJugada_1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btnJugada_5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btnJugada_6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btnJugada_8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btnJugada_4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btnJugada_9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btnJugada_7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btn_Logout.setText("LOGOUT");

        txt_turno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_turno.setForeground(new java.awt.Color(204, 0, 0));
        txt_turno.setText("En turno...");

        javax.swing.GroupLayout gamePanelLayout = new javax.swing.GroupLayout(gamePanel);
        gamePanel.setLayout(gamePanelLayout);
        gamePanelLayout.setHorizontalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(gamePanelLayout.createSequentialGroup()
                                .addComponent(btnJugada_7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnJugada_8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(gamePanelLayout.createSequentialGroup()
                                .addComponent(btnJugada_4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnJugada_5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnJugada_6, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(btnJugada_9, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(txt_turno)
                        .addGap(67, 115, Short.MAX_VALUE))
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addComponent(btnJugada_1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnJugada_2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnJugada_3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Logout)
                        .addGap(19, 19, 19))))
        );
        gamePanelLayout.setVerticalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnJugada_1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnJugada_3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnJugada_2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnJugada_5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnJugada_6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnJugada_4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnJugada_8, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(btnJugada_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnJugada_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23))
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addComponent(btn_Logout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_turno)
                        .addGap(32, 32, 32))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugada_1;
    private javax.swing.JButton btnJugada_2;
    private javax.swing.JButton btnJugada_3;
    private javax.swing.JButton btnJugada_4;
    private javax.swing.JButton btnJugada_5;
    private javax.swing.JButton btnJugada_6;
    private javax.swing.JButton btnJugada_7;
    private javax.swing.JButton btnJugada_8;
    private javax.swing.JButton btnJugada_9;
    private javax.swing.JButton btn_Login;
    private javax.swing.JButton btn_Logout;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel logPanel;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JLabel txt_turno;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable updatedModel, Object properties) {
        int prop = (int) properties;
        if (model.getCurrentUser() == null) {
            Application.window.setTitle("CHAT");
            logPanel.setVisible(true);
            Application.window.getRootPane().setDefaultButton(btn_Login);
            gamePanel.setVisible(false);
        } else {
            Application.window.setTitle(model.getCurrentUser().getNombre().toUpperCase()); // Pone el nombre del cliente 
            logPanel.setVisible(false); // esconde login
            gamePanel.setVisible(true); // habilita juego
            if ((prop & Model.CHAT) == Model.CHAT) { // Realizara accion?
                for (Message m : model.getMessages()) { // rearma el juego
                    controller.jugada(m);
                }
            }
        }
    }

    
}
