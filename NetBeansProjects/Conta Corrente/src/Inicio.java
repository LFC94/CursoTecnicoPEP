
import java.text.DecimalFormat;

/**
 *
 * @author Lucas Felipe
 */
public class Inicio extends javax.swing.JFrame {

    Saldo x001 = new Saldo();
    Saldo x007 = new Saldo();
    DecimalFormat formato = new DecimalFormat("R$#,##0.00");
    String formator;

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Tf_saldo = new javax.swing.JTextField();
        Tf_valor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Bt_Credito = new javax.swing.JButton();
        Bt_Debito = new javax.swing.JButton();
        Cb_Conta = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conta Corrente");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Saldo:");

        Tf_saldo.setBackground(new java.awt.Color(204, 204, 204));
        Tf_saldo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Tf_saldo.setBorder(null);
        Tf_saldo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Tf_saldo.setEnabled(false);
        Tf_saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_saldoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Valor:");

        Bt_Credito.setText("Credito");
        Bt_Credito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bt_Credito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_CreditoActionPerformed(evt);
            }
        });

        Bt_Debito.setText("Debito");
        Bt_Debito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bt_Debito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_DebitoActionPerformed(evt);
            }
        });

        Cb_Conta.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Cb_Conta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "001", "007" }));
        Cb_Conta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Cb_Conta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cb_ContaActionPerformed(evt);
            }
        });

        jLabel3.setText("Conta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tf_valor)
                    .addComponent(Tf_saldo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Cb_Conta, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Bt_Credito)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Bt_Debito)))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cb_Conta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Tf_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bt_Credito)
                    .addComponent(Bt_Debito))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_CreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_CreditoActionPerformed
        try {
            if (Cb_Conta.getSelectedIndex() == 0) {
                x001.setCreditar(Double.parseDouble(Tf_valor.getText()));
                formator = formato.format(x001.getdSaldo());
                Tf_saldo.setText(formator);
            }
            if (Cb_Conta.getSelectedIndex() == 1) {
                x007.setCreditar(Double.parseDouble(Tf_valor.getText()));
                formator = formato.format(x007.getdSaldo());
                Tf_saldo.setText(formator);

            }
            Tf_valor.setText("");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Bt_CreditoActionPerformed

    private void Bt_DebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_DebitoActionPerformed
        try {
            if (Cb_Conta.getSelectedIndex() == 0) {
                x001.setDebitar(Double.parseDouble(Tf_valor.getText()));
                formator = formato.format(x001.getdSaldo());
                Tf_saldo.setText(formator);
            }
            if (Cb_Conta.getSelectedIndex() == 1) {
                x007.setDebitar(Double.parseDouble(Tf_valor.getText()));
                formator = formato.format(x007.getdSaldo());
                Tf_saldo.setText(formator);
            }

            Tf_valor.setText("");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Bt_DebitoActionPerformed

    private void Tf_saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_saldoActionPerformed
    }//GEN-LAST:event_Tf_saldoActionPerformed

    private void Cb_ContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cb_ContaActionPerformed

        if (Cb_Conta.getSelectedIndex() == 0) {
            formator = formato.format(x001.getdSaldo());
            Tf_saldo.setText(formator);
        }
        if (Cb_Conta.getSelectedIndex() == 1) {
            formator = formato.format(x007.getdSaldo());
            Tf_saldo.setText(formator);
        }

    }//GEN-LAST:event_Cb_ContaActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Credito;
    private javax.swing.JButton Bt_Debito;
    private javax.swing.JComboBox Cb_Conta;
    private javax.swing.JTextField Tf_saldo;
    private javax.swing.JTextField Tf_valor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
