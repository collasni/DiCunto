package dicunto.gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Cliente extends JFrame {

    private final JFrame frm;
    
    public Cliente(JFrame frm) {
        this.frm = frm;
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        lblIns = new javax.swing.JLabel();
        lblEx = new javax.swing.JLabel();
        lblEdit = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        lblTituloCaixa = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 239, 231));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(226, 157, 38), 5, true));

        btnEditar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dicunto/img/Cliente/EditarCliente.png"))); // NOI18N
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setMargin(new java.awt.Insets(10, 40, 8, 0));
        btnEditar.setPreferredSize(new java.awt.Dimension(233, 233));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
        });

        lblIns.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblIns.setForeground(new java.awt.Color(108, 44, 21));
        lblIns.setText("INSERIR CLIENTE");

        lblEx.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblEx.setForeground(new java.awt.Color(108, 44, 21));
        lblEx.setText("EXCLUIR CLIENTE");

        lblEdit.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblEdit.setForeground(new java.awt.Color(108, 44, 21));
        lblEdit.setText("EDITAR CLIENTE");

        btnExcluir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dicunto/img/Cliente/ExcluirCliente.png"))); // NOI18N
        btnExcluir.setBorder(null);
        btnExcluir.setBorderPainted(false);
        btnExcluir.setContentAreaFilled(false);
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.setMargin(new java.awt.Insets(10, 40, 8, 0));
        btnExcluir.setPreferredSize(new java.awt.Dimension(233, 233));
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExcluirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExcluirMouseExited(evt);
            }
        });

        btnInserir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dicunto/img/Cliente/AdicionarCliente.png"))); // NOI18N
        btnInserir.setBorder(null);
        btnInserir.setBorderPainted(false);
        btnInserir.setContentAreaFilled(false);
        btnInserir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInserir.setMargin(new java.awt.Insets(10, 40, 8, 0));
        btnInserir.setPreferredSize(new java.awt.Dimension(233, 233));
        btnInserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInserirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInserirMouseExited(evt);
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

        lblTituloCaixa.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblTituloCaixa.setForeground(new java.awt.Color(252, 146, 109));
        lblTituloCaixa.setText("Cliente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblIns)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(lblEdit)
                        .addGap(53, 53, 53)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblEx)
                        .addGap(22, 22, 22))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloCaixa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFechar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFechar)
                    .addComponent(lblTituloCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdit)
                    .addComponent(lblEx)
                    .addComponent(lblIns))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose() ;
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnInserirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInserirMouseEntered
        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dicunto/img/Cliente/AdicionarMouse.png")));        // TODO add your handling code here:
    }//GEN-LAST:event_btnInserirMouseEntered

    private void btnInserirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInserirMouseExited
        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dicunto/img/Cliente/AdicionarCliente.png")));         // TODO add your handling code here:
    }//GEN-LAST:event_btnInserirMouseExited

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dicunto/img/Cliente/EditarMouse.png"))); 
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dicunto/img/Cliente/EditarCliente.png"))); 
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnExcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseEntered
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dicunto/img/Cliente/ExcluirMouse.png"))); // NOI18N
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirMouseEntered

    private void btnExcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseExited
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dicunto/img/Cliente/ExcluirCliente.png"))); // NOI18N
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblEdit;
    private javax.swing.JLabel lblEx;
    private javax.swing.JLabel lblIns;
    private javax.swing.JLabel lblTituloCaixa;
    // End of variables declaration//GEN-END:variables
}
