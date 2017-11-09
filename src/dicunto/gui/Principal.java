package dicunto.gui;

import javax.swing.JFrame;

public class Principal extends JFrame {
    
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        btnCliente = new javax.swing.JButton();
        btnFornecedor = new javax.swing.JButton();
        lblCli = new javax.swing.JLabel();
        lblFornec = new javax.swing.JLabel();
        lblRel = new javax.swing.JLabel();
        lblFunc = new javax.swing.JLabel();
        lblCaixa = new javax.swing.JLabel();
        btnCaixa = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        btnFuncionario = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Confeitaria Di Cunto");
        setForeground(new java.awt.Color(0, 0, 0));
        setName(""); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1069, 715));

        pnlPrincipal.setBackground(new java.awt.Color(255, 239, 231));
        pnlPrincipal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(226, 157, 38), 5, true));

        btnCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dicunto/img/Cliente/Cliente.png"))); // NOI18N
        btnCliente.setBorder(null);
        btnCliente.setBorderPainted(false);
        btnCliente.setContentAreaFilled(false);
        btnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCliente.setMargin(new java.awt.Insets(10, 40, 8, 0));
        btnCliente.setPreferredSize(new java.awt.Dimension(233, 233));
        btnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClienteMouseClicked(evt);
            }
        });
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnFornecedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dicunto/img/Fornecedor/Fornecedor.png"))); // NOI18N
        btnFornecedor.setBorder(null);
        btnFornecedor.setBorderPainted(false);
        btnFornecedor.setContentAreaFilled(false);
        btnFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFornecedor.setMargin(new java.awt.Insets(10, 40, 8, 0));
        btnFornecedor.setPreferredSize(new java.awt.Dimension(233, 233));
        btnFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedorActionPerformed(evt);
            }
        });

        lblCli.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblCli.setForeground(new java.awt.Color(108, 44, 21));
        lblCli.setText("CLIENTE");

        lblFornec.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblFornec.setForeground(new java.awt.Color(108, 44, 21));
        lblFornec.setText("FORNECEDOR");

        lblRel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblRel.setForeground(new java.awt.Color(108, 44, 21));
        lblRel.setText("RELATÓRIO");

        lblFunc.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblFunc.setForeground(new java.awt.Color(108, 44, 21));
        lblFunc.setText("FUNCIONÁRIO");

        lblCaixa.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblCaixa.setForeground(new java.awt.Color(108, 44, 21));
        lblCaixa.setText("CAIXA");

        btnCaixa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dicunto/img/Caixa/Caixa.png"))); // NOI18N
        btnCaixa.setBorder(null);
        btnCaixa.setBorderPainted(false);
        btnCaixa.setContentAreaFilled(false);
        btnCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCaixa.setMargin(new java.awt.Insets(10, 40, 8, 0));
        btnCaixa.setPreferredSize(new java.awt.Dimension(233, 233));

        btnRelatorio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dicunto/img/Relatorio/Relatorio.png"))); // NOI18N
        btnRelatorio.setBorder(null);
        btnRelatorio.setBorderPainted(false);
        btnRelatorio.setContentAreaFilled(false);
        btnRelatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRelatorio.setMargin(new java.awt.Insets(10, 40, 8, 0));
        btnRelatorio.setPreferredSize(new java.awt.Dimension(233, 233));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dicunto/img/Logo/Logo_Vetor_700x400.png"))); // NOI18N

        btnFuncionario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dicunto/img/Funcionario/Funcionario.png"))); // NOI18N
        btnFuncionario.setBorder(null);
        btnFuncionario.setBorderPainted(false);
        btnFuncionario.setContentAreaFilled(false);
        btnFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFuncionario.setMargin(new java.awt.Insets(10, 40, 8, 0));
        btnFuncionario.setPreferredSize(new java.awt.Dimension(233, 233));
        btnFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFuncionarioMouseClicked(evt);
            }
        });
        btnFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionarioActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btnFechar))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lblCaixa)))
                        .addGap(28, 28, 28)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblRel)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFunc)
                            .addComponent(btnFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(lblFornec)
                                .addGap(49, 49, 49)
                                .addComponent(lblCli))
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(btnFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(btnFechar)
                        .addGap(0, 398, Short.MAX_VALUE))
                    .addComponent(lblLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnFornecedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(btnFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFornec)
                            .addComponent(lblCli)
                            .addComponent(lblFunc)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(btnCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(11, 11, 11)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCaixa)
                            .addComponent(lblRel))))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedorActionPerformed
        new Fornecedor(this).setVisible(true);
    }//GEN-LAST:event_btnFornecedorActionPerformed

    private void btnFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionarioActionPerformed
        new Funcionario(this).setVisible(true);
    }//GEN-LAST:event_btnFuncionarioActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        new Cliente(this).setVisible(true);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFuncionarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFuncionarioMouseClicked

    private void btnClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClienteMouseClicked

   public static void main(String args[]) {
//       new Principal().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaixa;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnFornecedor;
    private javax.swing.JButton btnFuncionario;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JLabel lblCaixa;
    private javax.swing.JLabel lblCli;
    private javax.swing.JLabel lblFornec;
    private javax.swing.JLabel lblFunc;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblRel;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
