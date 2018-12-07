/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

/**
 *
 * @author Lucas Felipe
 */
public class CadastroAtores extends javax.swing.JFrame {

    String codAtor;
    Uteis uteis = new Uteis();

    public CadastroAtores() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conect = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("HBO?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        Qry_atores = java.beans.Beans.isDesignTime() ? null : conect.createQuery("SELECT a FROM Atrores a");
        atores = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : Qry_atores.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxF_Codigo = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        TxF_Nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxF_Telefone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Txf_Idade = new javax.swing.JTextField();
        Btn_Salvar = new javax.swing.JButton();
        Btn_Excluir = new javax.swing.JButton();
        Btn_Fechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Codigo");

        TxF_Codigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        TxF_Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxF_CodigoActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        TxF_Nome.setMaximumSize(new java.awt.Dimension(60, 60));
        TxF_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxF_NomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Telefone");

        TxF_Telefone.setMaximumSize(new java.awt.Dimension(15, 15));
        TxF_Telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxF_TelefoneActionPerformed(evt);
            }
        });

        jLabel4.setText("Idade");

        Btn_Salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_add.png"))); // NOI18N
        Btn_Salvar.setText("Salvar");
        Btn_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalvarActionPerformed(evt);
            }
        });

        Btn_Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_delete.png"))); // NOI18N
        Btn_Excluir.setText("Excluir");
        Btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ExcluirActionPerformed(evt);
            }
        });

        Btn_Fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Exit.png"))); // NOI18N
        Btn_Fechar.setText("Fechar");
        Btn_Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_FecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxF_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxF_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txf_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxF_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(Btn_Salvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_Fechar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxF_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxF_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Txf_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxF_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Salvar)
                    .addComponent(Btn_Excluir)
                    .addComponent(Btn_Fechar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxF_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxF_CodigoActionPerformed
      TxF_Nome.setText("");
      TxF_Telefone.setText("");
      Txf_Idade.setText("");
        try {
            if(!TxF_Codigo.getText().equals("0")){
            Qry_atores = conect.createQuery("SELECT a FROM Atrores a WHERE a.codigo=" + TxF_Codigo.getText());
            atores = Qry_atores.getResultList();
            for (Atrores a : atores) {
                TxF_Codigo.setText(String.valueOf(a.getCodigo()));
                TxF_Nome.setText(a.getNome());
                TxF_Telefone.setText(a.getTelefone());
                Txf_Idade.setText(String.valueOf(a.getIdade()));
            }
            TxF_Nome.requestFocusInWindow();
            }else{
                ConsutaAtores conAtore = new ConsutaAtores();
                Qry_atores = conect.createQuery("SELECT a FROM Atrores a ");
                atores = Qry_atores.getResultList();
                conAtore.atualiza();
                conAtore.busca = true;
                conAtore.show();
                this.dispose();
            }
        } catch (Exception e) {
            uteis.Mensagem("Erro: " + e);
        }
    }//GEN-LAST:event_TxF_CodigoActionPerformed

    private void TxF_TelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxF_TelefoneActionPerformed
        TxF_Telefone.setText(uteis.Telefone(TxF_Telefone.getText()));
        Btn_Salvar.requestFocusInWindow();
    }//GEN-LAST:event_TxF_TelefoneActionPerformed

    private void TxF_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxF_NomeActionPerformed
        if (TxF_Nome.getText().isEmpty()) {
            uteis.Mensagem("Digite o Nome");
            return;
        }
        Txf_Idade.requestFocusInWindow();
    }//GEN-LAST:event_TxF_NomeActionPerformed

    private void Btn_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalvarActionPerformed
        String telefone = null;
        int i;
        try{
            Atrores ator = new Atrores();
            conect.getTransaction().begin();
            if (TxF_Codigo.getText().isEmpty()) {
                uteis.Mensagem("Digite o codigo!", "Atenção");
                TxF_Codigo.requestFocusInWindow();
                return;
            }

            if (TxF_Nome.getText().isEmpty()) {
                uteis.Mensagem("Digite o nome do altor!", "Atenção");
                TxF_Nome.requestFocusInWindow();
                return;
            }

            if (Txf_Idade.getText().isEmpty()) {
                uteis.Mensagem("Digite a idade do ator!", "Atenção");
                Txf_Idade.requestFocusInWindow();
                return;
            }
            if (!TxF_Telefone.getText().isEmpty()) {
                telefone = uteis.Telefone(TxF_Telefone.getText());
            }
            Qry_atores = conect.createQuery("SELECT a FROM Atrores a WHERE a.codigo=" + TxF_Codigo.getText());
            atores = Qry_atores.getResultList();
            if (atores.isEmpty()) {
                ator.setCodigo(Integer.parseInt(TxF_Codigo.getText()));
                ator.setNome(TxF_Nome.getText());
                ator.setIdade(Integer.parseInt(Txf_Idade.getText()));
                ator.setTelefone(telefone);
                conect.persist(ator);
            } else {
                Qry_atores = conect.createQuery("UPDATE Atrores a SET a.idade=" + Txf_Idade.getText() + " WHERE a.codigo=" + TxF_Codigo.getText());
                Qry_atores.executeUpdate();
                Qry_atores = conect.createQuery("UPDATE Atrores a SET a.nome='" + TxF_Nome.getText() + "' WHERE a.codigo=" + TxF_Codigo.getText());
                Qry_atores.executeUpdate();
                Qry_atores = conect.createQuery("UPDATE Atrores a SET a.telefone='" + telefone + "' WHERE a.codigo=" + TxF_Codigo.getText());
                Qry_atores.executeUpdate();
            }
            conect.getTransaction().commit();
            uteis.Mensagem("Ator salvo com Sucesso");
            i = Integer.parseInt(TxF_Codigo.getText()) + 1;
            while (true) {
                TxF_Codigo.setText(String.valueOf(i));
                Qry_atores = conect.createQuery("SELECT a FROM Atrores a WHERE a.codigo=" + TxF_Codigo.getText());
                atores = Qry_atores.getResultList();
                if (atores.isEmpty()) {
                    break;
                }
                i++;
            }
            TxF_Nome.setText("");
            TxF_Telefone.setText("");
            Txf_Idade.setText("");
            TxF_CodigoActionPerformed(evt);
        } catch (Exception e) {
            uteis.Mensagem("Erro:" + e);
        }


    }//GEN-LAST:event_Btn_SalvarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        TxF_Codigo.setText(codAtor);
        TxF_CodigoActionPerformed(null);
    }//GEN-LAST:event_formWindowOpened

    private void Btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ExcluirActionPerformed
        int i = 0;
        try {
            conect.getTransaction().begin();
            if (TxF_Codigo.getText().isEmpty()) {
                uteis.Mensagem("Ator Não SELECIONado");
                TxF_Codigo.requestFocusInWindow();
                return;
            }

            Qry_atores = conect.createQuery("SELECT a FROM Atrores a WHERE a.codigo=" + TxF_Codigo.getText());
            atores = Qry_atores.getResultList();
            if (atores.isEmpty()) {
                uteis.Mensagem("Ator nao salvo");
                TxF_Codigo.requestFocusInWindow();
                return;
            }
            if (uteis.Pergunta("Deseja realmente Excluir este altor(a)?", "EXCLUIR")== 0) {
                Qry_atores = conect.createQuery("DELETE FROM Atrores a WHERE a.codigo=" + TxF_Codigo.getText());
                Qry_atores.executeUpdate();
            }

            conect.getTransaction().commit();
            TxF_Nome.setText("");
            TxF_Telefone.setText("");
            Txf_Idade.setText("");
            TxF_CodigoActionPerformed(evt);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Btn_ExcluirActionPerformed

    private void Btn_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_FecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_Btn_FecharActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroAtores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAtores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAtores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAtores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAtores().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Excluir;
    private javax.swing.JButton Btn_Fechar;
    private javax.swing.JButton Btn_Salvar;
    private javax.persistence.Query Qry_atores;
    private javax.swing.JFormattedTextField TxF_Codigo;
    private javax.swing.JTextField TxF_Nome;
    private javax.swing.JTextField TxF_Telefone;
    private javax.swing.JTextField Txf_Idade;
    private java.util.List<Codigo.Atrores> atores;
    private javax.persistence.EntityManager conect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
