
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author INFO01
 */
public class PaginaIniciar extends javax.swing.JFrame {

    /**
     * Creates new form PaginaIniciar
     */
    public PaginaIniciar() {
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

        TVaCabobuttonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        PaginaIniciar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PlanoComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PlanoComTVRadioButton = new javax.swing.JRadioButton();
        PlanoSemTVRadioButton = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        NomeTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ValorTotalLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        ArquivoMenu = new javax.swing.JMenu();
        SairMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Telefonica LFC");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        PaginaIniciar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "Planos De Intenet", 0, 0, new java.awt.Font("Times New Roman", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel2.setText("Plano:");

        PlanoComboBox.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N
        PlanoComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Plus", "Ultra Mega Power" }));
        PlanoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlanoComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Deseja incluir TV a Cabo?");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/internet-icone-do-vetor_34-4937.jpg"))); // NOI18N

        TVaCabobuttonGroup.add(PlanoComTVRadioButton);
        PlanoComTVRadioButton.setText("Sim");

        TVaCabobuttonGroup.add(PlanoSemTVRadioButton);
        PlanoSemTVRadioButton.setSelected(true);
        PlanoSemTVRadioButton.setText("Não");

        jLabel5.setText("Nome");

        jLabel6.setText("Valor Do Plano:");

        ValorTotalLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ValorTotalLabel.setText("R$70,00");

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PaginaIniciarLayout = new javax.swing.GroupLayout(PaginaIniciar);
        PaginaIniciar.setLayout(PaginaIniciarLayout);
        PaginaIniciarLayout.setHorizontalGroup(
            PaginaIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaginaIniciarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PaginaIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ValorTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PaginaIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PaginaIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PaginaIniciarLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NomeTextField))
                            .addComponent(jLabel3)
                            .addGroup(PaginaIniciarLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PlanoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PaginaIniciarLayout.createSequentialGroup()
                                .addComponent(PlanoComTVRadioButton)
                                .addGap(10, 10, 10)
                                .addGroup(PaginaIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(PlanoSemTVRadioButton))))
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        PaginaIniciarLayout.setVerticalGroup(
            PaginaIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaginaIniciarLayout.createSequentialGroup()
                .addGroup(PaginaIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaginaIniciarLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(PaginaIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(NomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(PaginaIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(PlanoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PaginaIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PlanoComTVRadioButton)
                            .addComponent(PlanoSemTVRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(PaginaIniciarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ValorTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ArquivoMenu.setText("Arquivos");

        SairMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        SairMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btSair.gif"))); // NOI18N
        SairMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairMenuItemActionPerformed(evt);
            }
        });
        ArquivoMenu.add(SairMenuItem);

        jMenuBar1.add(ArquivoMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(PaginaIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PaginaIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlanoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlanoComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlanoComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (NomeTextField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O Seu nome e Obrigatório", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        try {
            String valorFormatado;
            double valorTotal = 0;

            switch (PlanoComboBox.getSelectedIndex()) {
                case 0:
                    if (PlanoComTVRadioButton.isSelected()) {
                        valorTotal = 89;
                    } else {
                        valorTotal = 70;
                    }
                    break;
                case 1:
                    if (PlanoComTVRadioButton.isSelected()) {
                        valorTotal = 99;
                    } else {
                        valorTotal = 80;
                    }
                    break;
                    case 2:
                        if (PlanoComTVRadioButton.isSelected()) {
                        valorTotal = 120;
                    } else {
                        valorTotal = 100;
                    }
                    break;
            }
            
            DecimalFormat formato=new DecimalFormat("R$#,##0.00");
            
            valorFormatado=formato.format(valorTotal);
            ValorTotalLabel.setText(valorFormatado);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SairMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairMenuItemActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja Sair?","Sair",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==0) {
            System.exit(0);
        }
    }//GEN-LAST:event_SairMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaIniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaIniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaIniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaIniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaIniciar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ArquivoMenu;
    private javax.swing.JTextField NomeTextField;
    private javax.swing.JPanel PaginaIniciar;
    private javax.swing.JRadioButton PlanoComTVRadioButton;
    private javax.swing.JComboBox PlanoComboBox;
    private javax.swing.JRadioButton PlanoSemTVRadioButton;
    private javax.swing.JMenuItem SairMenuItem;
    private javax.swing.ButtonGroup TVaCabobuttonGroup;
    private javax.swing.JLabel ValorTotalLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
