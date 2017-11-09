package dicunto.gui;

import javax.swing.JFrame;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlPrincipal = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        btnFechar = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        lblMover = new javax.swing.JLabel();
        pss = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setUndecorated(true);
        setResizable(false);

        PnlPrincipal.setBackground(new java.awt.Color(255, 239, 231));
        PnlPrincipal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(226, 157, 38), 5, true));
        PnlPrincipal.setForeground(new java.awt.Color(108, 44, 21));

        txtUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtUsuario.setText("adm");
        txtUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 44, 21), 2, true));

        btnFechar.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        btnFechar.setText("X");
        btnFechar.setBorder(null);
        btnFechar.setContentAreaFilled(false);
        btnFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(108, 44, 21));
        lblUsuario.setText("Usuário");

        lblSenha.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(108, 44, 21));
        lblSenha.setText("Senha");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dicunto/img/Logo/Logo_Vetor_256x156.png"))); // NOI18N

        btnEntrar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(108, 44, 21));
        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 44, 21), 3, true));
        btnEntrar.setContentAreaFilled(false);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        lblMover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMoverMousePressed(evt);
            }
        });

        pss.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pss.setText("1");

        javax.swing.GroupLayout PnlPrincipalLayout = new javax.swing.GroupLayout(PnlPrincipal);
        PnlPrincipal.setLayout(PnlPrincipalLayout);
        PnlPrincipalLayout.setHorizontalGroup(
            PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlPrincipalLayout.createSequentialGroup()
                .addComponent(lblMover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PnlPrincipalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                    .addGroup(PnlPrincipalLayout.createSequentialGroup()
                        .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(lblSenha))
                        .addGap(18, 18, 18)
                        .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pss, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PnlPrincipalLayout.createSequentialGroup()
                                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PnlPrincipalLayout.setVerticalGroup(
            PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlPrincipalLayout.createSequentialGroup()
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMover, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFechar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLogo)
                .addGap(34, 34, 34)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pss, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha))
                .addGap(18, 18, 18)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        if((txtUsuario.getText().equals("adm") == true) && (new String(pss.getPassword()).equals("1") == true)){
            new Principal().setVisible(true);
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void lblMoverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMoverMousePressed
        System.out.println("Oi");
    }//GEN-LAST:event_lblMoverMousePressed

    public static void main(String args[]) {
        new Login().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlPrincipal;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMover;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField pss;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
