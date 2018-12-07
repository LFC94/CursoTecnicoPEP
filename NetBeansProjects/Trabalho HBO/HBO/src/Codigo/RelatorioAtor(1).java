package Codigo;

import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Lucas Felipe
 */
public class RelatorioAtor extends javax.swing.JFrame {

    Uteis uteis = new Uteis();

    public RelatorioAtor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGp_Ordem = new javax.swing.ButtonGroup();
        conectar = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("HBO?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        Qry_atores = java.beans.Beans.isDesignTime() ? null : conectar.createQuery("SELECT a FROM Atrores a");
        atores = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : Qry_atores.getResultList();
        Rbt_Alfabetica = new javax.swing.JRadioButton();
        RbT_Idade = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        Txf_Idade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Btn_Ok = new javax.swing.JButton();
        Btn_Fechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        bGp_Ordem.add(Rbt_Alfabetica);
        Rbt_Alfabetica.setSelected(true);
        Rbt_Alfabetica.setText("Alfabetico");
        Rbt_Alfabetica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rbt_AlfabeticaMouseClicked(evt);
            }
        });

        bGp_Ordem.add(RbT_Idade);
        RbT_Idade.setText("Idade");
        RbT_Idade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RbT_IdadeMouseClicked(evt);
            }
        });

        jLabel1.setText("Ordem");

        Txf_Idade.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        Txf_Idade.setEnabled(false);
        Txf_Idade.setOpaque(false);

        Btn_Ok.setText("OK");
        Btn_Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_OkActionPerformed(evt);
            }
        });

        Btn_Fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Exit.png"))); // NOI18N
        Btn_Fechar.setText("Fechar");
        Btn_Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_FecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Rbt_Alfabetica))
                            .addComponent(Btn_Ok, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_Fechar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RbT_Idade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txf_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Rbt_Alfabetica)
                            .addComponent(RbT_Idade)
                            .addComponent(Txf_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn_Fechar)
                            .addComponent(Btn_Ok))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_OkActionPerformed
        // TODO add your handling code here:
        if (Rbt_Alfabetica.isSelected()) {
            Qry_atores = conectar.createQuery("SELECT a FROM  Atrores a ORDER BY a.nome");
        } else {
            if (RbT_Idade.isSelected()) {
                if (Txf_Idade.getText().isEmpty()) {
                    uteis.Mensagem("Digite a idade dos altores para gerar o relatorio");
                    return;
                } else {
                    Qry_atores = conectar.createQuery("SELECT a FROM Atrores a WHERE a.idade=" + Txf_Idade.getText());
                }
            } else {
                uteis.Mensagem("Selecione a ordem do relatorio");
                return;
            }
        }
        atores = Qry_atores.getResultList();
        try {
            JasperReport report = (JasperReport) JRLoader.loadObject("Jasper/Atores.jasper");
            JasperPrint print = JasperFillManager.fillReport(report, null, new JRBeanCollectionDataSource(atores));
            JasperViewer visualizar = null;
            visualizar.setTitle("Relatorios das Series");
            visualizar.setExtendedState(visualizar.MAXIMIZED_BOTH);
            visualizar.setVisible(true);
        } catch (Exception e) {
            uteis.Mensagem(" Erro: " + e.getMessage());
            System.out.println(e);
        }
    }//GEN-LAST:event_Btn_OkActionPerformed

    private void Rbt_AlfabeticaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rbt_AlfabeticaMouseClicked

        Txf_Idade.enable(false);

    }//GEN-LAST:event_Rbt_AlfabeticaMouseClicked

    private void RbT_IdadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbT_IdadeMouseClicked
        Txf_Idade.enable(true);
        Txf_Idade.requestFocusInWindow();
    }//GEN-LAST:event_RbT_IdadeMouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RelatorioAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioAtor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Fechar;
    private javax.swing.JButton Btn_Ok;
    private javax.persistence.Query Qry_atores;
    private javax.swing.JRadioButton RbT_Idade;
    private javax.swing.JRadioButton Rbt_Alfabetica;
    private javax.swing.JTextField Txf_Idade;
    private java.util.List<Codigo.Atrores> atores;
    private javax.swing.ButtonGroup bGp_Ordem;
    private javax.persistence.EntityManager conectar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
