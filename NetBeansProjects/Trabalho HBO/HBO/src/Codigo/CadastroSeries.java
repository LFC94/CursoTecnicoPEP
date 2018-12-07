package Codigo;

/**
 *
 * @author Lucas Felipe
 */
public class CadastroSeries extends javax.swing.JFrame {

    String codSer;
    Uteis uteis = new Uteis();

    public CadastroSeries() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conect = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("HBO?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        Qry_series = java.beans.Beans.isDesignTime() ? null : conect.createQuery("SELECT s FROM Series s");
        Series = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : Qry_series.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxF_Codigo = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        TxF_Descricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxF_Genero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxF_Horario = new javax.swing.JTextField();
        Btn_Salvar = new javax.swing.JButton();
        Btn_Excluir = new javax.swing.JButton();
        Btn_Fechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Serie");
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

        jLabel2.setText("Descrição");

        TxF_Descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxF_DescricaoActionPerformed(evt);
            }
        });

        jLabel3.setText("Genero");

        TxF_Genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxF_GeneroActionPerformed(evt);
            }
        });

        jLabel4.setText("Horario");

        TxF_Horario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxF_HorarioActionPerformed(evt);
            }
        });

        Btn_Salvar.setText("Salvar");
        Btn_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalvarActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn_Salvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Fechar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TxF_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxF_Descricao)
                        .addComponent(TxF_Genero, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                    .addComponent(TxF_Horario, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxF_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxF_Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxF_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxF_Horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxF_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxF_CodigoActionPerformed

        TxF_Descricao.setText("");
        TxF_Genero.setText("");
        TxF_Horario.setText("");
        try {
            if ((!TxF_Codigo.getText().equals("0"))) {
                Qry_series = conect.createQuery("SELECT s FROM Series s WHERE s.codigo=" + TxF_Codigo.getText());
                Series = Qry_series.getResultList();

                for (Series s : Series) {
                    TxF_Descricao.setText(s.getDescricao());
                    TxF_Genero.setText(s.getGenero());
                    TxF_Horario.setText(s.getHorario());
                }
                TxF_Descricao.requestFocusInWindow();
            } else {
                ConsultaSeries conSerie = new ConsultaSeries();
                Qry_series = conect.createQuery("SELECT s FROM Series s ");
                Series = Qry_series.getResultList();
                conSerie.atualiza();
                conSerie.busca = true;
                conSerie.show();
                this.dispose();

            }
        } catch (Exception e) {
            uteis.Mensagem("Erro: " + e, "Erro");
        }

    }//GEN-LAST:event_TxF_CodigoActionPerformed

    private void TxF_DescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxF_DescricaoActionPerformed
        if (TxF_Descricao.getText().isEmpty()) {
            uteis.Mensagem("Digite a descriçaõ!", "Atenção");
            TxF_Descricao.requestFocusInWindow();
            return;
        }
        TxF_Genero.requestFocusInWindow();
    }//GEN-LAST:event_TxF_DescricaoActionPerformed

    private void TxF_GeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxF_GeneroActionPerformed
        if (TxF_Genero.getText().isEmpty()) {
            uteis.Mensagem("Digite o genero da serie!", "Atenção");
            TxF_Genero.requestFocusInWindow();
            return;
        }
        TxF_Horario.requestFocusInWindow();

    }//GEN-LAST:event_TxF_GeneroActionPerformed

    private void TxF_HorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxF_HorarioActionPerformed
        if (TxF_Horario.getText().isEmpty()) {
            uteis.Mensagem("Digite o Horario da serie!", "Atenção");
            TxF_Horario.requestFocusInWindow();
            return;
        }
        TxF_Horario.setText(uteis.Hora(TxF_Horario.getText()));
        Btn_Salvar.requestFocusInWindow();
    }//GEN-LAST:event_TxF_HorarioActionPerformed

    private void Btn_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalvarActionPerformed
        int i;
        try {
            Series series = new Series();
            conect.getTransaction().begin();
            if (TxF_Codigo.getText().isEmpty()) {
                uteis.Mensagem("Digite o codigo");
                TxF_Codigo.requestFocusInWindow();
                return;
            }
            if (TxF_Descricao.getText().isEmpty()) {
                uteis.Mensagem("Didite a descrição da serie");
                TxF_Descricao.requestFocusInWindow();
                return;
            }
            if (TxF_Genero.getText().isEmpty()) {
                uteis.Mensagem("Digite o genero da serie");
                TxF_Genero.requestFocusInWindow();
                return;
            }
            if (TxF_Horario.getText().isEmpty()) {
                uteis.Mensagem("Digite o Horario da Serie");
                TxF_Horario.requestFocusInWindow();
                return;
            }
            Qry_series = conect.createQuery("SELECT s FROM Series s WHERE s.codigo=" + TxF_Codigo.getText());
            Series = Qry_series.getResultList();
            if (Series.isEmpty()) {
                series.setCodigo(Integer.parseInt(TxF_Codigo.getText()));
                series.setDescricao(TxF_Descricao.getText());
                series.setGenero(TxF_Genero.getText());
                series.setHorario(TxF_Horario.getText());
                conect.persist(series);
            } else {
                Qry_series = conect.createQuery("UPDATE Series s SET s.descricao='" + TxF_Descricao.getText() + "' WHERE s.codigo=" + TxF_Codigo.getText());
                Qry_series.executeUpdate();
                Qry_series = conect.createQuery("UPDATE Series s SET s.genero='" + TxF_Genero.getText() + "' WHERE s.codigo=" + TxF_Codigo.getText());
                Qry_series.executeUpdate();
                Qry_series = conect.createQuery("UPDATE Series s SET s.horario='" + TxF_Horario.getText() + "' WHERE s.codigo=" + TxF_Codigo.getText());
                Qry_series.executeUpdate();
            }
            conect.getTransaction().commit();
            uteis.Mensagem("Serie salva com Sucesso");
            i = Integer.parseInt(TxF_Codigo.getText()) + 1;
            while (true) {
                TxF_Codigo.setText(String.valueOf(i));
                Qry_series = conect.createQuery("SELECT s FROM Series s WHERE s.codigo=" + TxF_Codigo.getText());
                Series = Qry_series.getResultList();
                if (Series.isEmpty()) {
                    break;
                }
                i++;
            }
            TxF_Descricao.setText("");
            TxF_Genero.setText("");
            TxF_Horario.setText("");
        } catch (Exception e) {
            uteis.Mensagem("Erro: " + e);
        }
    }//GEN-LAST:event_Btn_SalvarActionPerformed

    private void Btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ExcluirActionPerformed
        conect.getTransaction().begin();
        Qry_series = conect.createQuery("SELECT s FROM Series s WHERE s.codigo=" + TxF_Codigo.getText());
        Series = Qry_series.getResultList();
        if (Series.isEmpty()) {
            uteis.Mensagem("Não Existe a serie salva");
            return;
        }
        if (uteis.Pergunta("Deseja Excluir?", "Excluir") == 0) {
            Qry_series = conect.createQuery("DELETE FROM Series s WHERE s.codigo=" + TxF_Codigo.getText());
            Qry_series.executeUpdate();
            uteis.Mensagem("Excluido");
        }
        conect.getTransaction().commit();
        TxF_Codigo.setText("");
        TxF_Descricao.setText("");
        TxF_Genero.setText("");
        TxF_Horario.setText("");
    }//GEN-LAST:event_Btn_ExcluirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        TxF_Codigo.setText(codSer);
        TxF_CodigoActionPerformed(null);

    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(CadastroSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroSeries().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Excluir;
    private javax.swing.JButton Btn_Fechar;
    private javax.swing.JButton Btn_Salvar;
    private javax.persistence.Query Qry_series;
    private java.util.List<Codigo.Series> Series;
    private javax.swing.JFormattedTextField TxF_Codigo;
    private javax.swing.JTextField TxF_Descricao;
    private javax.swing.JTextField TxF_Genero;
    private javax.swing.JTextField TxF_Horario;
    private javax.persistence.EntityManager conect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
