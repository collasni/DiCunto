package dicunto.gui;

import javax.swing.JFrame;

public class Funcionario extends JFrame {

    private final JFrame frm;
    
    public Funcionario(JFrame frm) {
        this.frm = frm;
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        btnInserirFunc = new javax.swing.JButton();
        btneditarFunc = new javax.swing.JButton();
        btnexcluirFunc = new javax.swing.JButton();
        lblIns = new javax.swing.JLabel();
        lblEx = new javax.swing.JLabel();
        lblEdt = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        lblTituloCaixa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FUNCIONÁRIO");
        setUndecorated(true);
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(255, 239, 231));
        pnlPrincipal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(226, 157, 38), 5, true));
        pnlPrincipal.setForeground(new java.awt.Color(108, 44, 21));

        btnInserirFunc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnInserirFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dicunto/img/Funcionario/AdicionarFuncionario.png"))); // NOI18N
        btnInserirFunc.setBorder(null);
        btnInserirFunc.setBorderPainted(false);
        btnInserirFunc.setContentAreaFilled(false);
        btnInserirFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInserirFunc.setMargin(new java.awt.Insets(10, 40, 8, 0));
        btnInserirFunc.setPreferredSize(new java.awt.Dimension(233, 233));
        btnInserirFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInserirFuncMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInserirFuncMouseExited(evt);
            }
        });
        btnInserirFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirFuncActionPerformed(evt);
            }
        });

        btneditarFunc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btneditarFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dicunto/img/Funcionario/EditarFuncionario.png"))); // NOI18N
        btneditarFunc.setBorder(null);
        btneditarFunc.setBorderPainted(false);
        btneditarFunc.setContentAreaFilled(false);
        btneditarFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneditarFunc.setMargin(new java.awt.Insets(10, 40, 8, 0));
        btneditarFunc.setPreferredSize(new java.awt.Dimension(233, 233));
        btneditarFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btneditarFuncMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btneditarFuncMouseExited(evt);
            }
        });
        btneditarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarFuncActionPerformed(evt);
            }
        });

        btnexcluirFunc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnexcluirFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dicunto/img/Funcionario/ExcluirFuncionario.png"))); // NOI18N
        btnexcluirFunc.setBorder(null);
        btnexcluirFunc.setBorderPainted(false);
        btnexcluirFunc.setContentAreaFilled(false);
        btnexcluirFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnexcluirFunc.setMargin(new java.awt.Insets(10, 40, 8, 0));
        btnexcluirFunc.setPreferredSize(new java.awt.Dimension(233, 233));
        btnexcluirFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnexcluirFuncMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnexcluirFuncMouseExited(evt);
            }
        });
        btnexcluirFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirFuncActionPerformed(evt);
            }
        });

        lblIns.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblIns.setText("INSERIR FUNCIONARIO");

        lblEx.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblEx.setText("EXCLUIR FUNCIONARIO");

        lblEdt.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblEdt.setText("EDITAR FUNCIONARIO");

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
        lblTituloCaixa.setText("Funcionários");

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloCaixa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFechar)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnInserirFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btneditarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188)
                .addComponent(btnexcluirFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIns)
                .addGap(82, 82, 82)
                .addComponent(lblEdt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(lblEx)
                .addContainerGap())
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFechar)
                    .addComponent(lblTituloCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btneditarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnexcluirFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInserirFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIns)
                    .addComponent(lblEdt)
                    .addComponent(lblEx))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btneditarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneditarFuncActionPerformed

    private void btnexcluirFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnexcluirFuncActionPerformed

    private void btnInserirFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInserirFuncActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
      this.dispose() ;
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnInserirFuncMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInserirFuncMouseEntered
        btnInserirFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dicunto/img/Funcionario/AdicionarMouse.png"))); // NOI18N
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInserirFuncMouseEntered

    private void btnInserirFuncMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInserirFuncMouseExited
        btnInserirFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dicunto/img/Funcionario/AdicionarFuncionario.png"))); // NOI18N
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInserirFuncMouseExited

    private void btneditarFuncMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditarFuncMouseEntered
        btneditarFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dicunto/img/Funcionario/EditarMouse.png"))); // NOI18N
        // TODO add your handling code here:
    }//GEN-LAST:event_btneditarFuncMouseEntered

    private void btneditarFuncMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditarFuncMouseExited
        btneditarFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dicunto/img/Funcionario/EditarFuncionario.png"))); // NOI18N
        // TODO add your handling code here:
    }//GEN-LAST:event_btneditarFuncMouseExited

    private void btnexcluirFuncMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexcluirFuncMouseEntered
        btnexcluirFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dicunto/img/Funcionario/ExcluirMouse.png"))); // NOI18N
        // TODO add your handling code here:
    }//GEN-LAST:event_btnexcluirFuncMouseEntered

    private void btnexcluirFuncMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexcluirFuncMouseExited
        btnexcluirFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dicunto/img/Funcionario/ExcluirFuncionario.png"))); // NOI18N
        // TODO add your handling code here:
    }//GEN-LAST:event_btnexcluirFuncMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnInserirFunc;
    private javax.swing.JButton btneditarFunc;
    private javax.swing.JButton btnexcluirFunc;
    private javax.swing.JLabel lblEdt;
    private javax.swing.JLabel lblEx;
    private javax.swing.JLabel lblIns;
    private javax.swing.JLabel lblTituloCaixa;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
