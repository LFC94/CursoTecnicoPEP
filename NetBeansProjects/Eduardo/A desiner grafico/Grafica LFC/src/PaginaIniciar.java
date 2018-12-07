
import java.text.DecimalFormat;
import java.text.Format;
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

        CelendarioButtonGroup = new javax.swing.ButtonGroup();
        GraficaLFC = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        EstadoDestino = new javax.swing.JLabel();
        TipoCalendario = new javax.swing.JLabel();
        estadosComboBox = new javax.swing.JComboBox();
        CalendarioSimplesRadioButton = new javax.swing.JRadioButton();
        CalendarioLuxoRadioButton1 = new javax.swing.JRadioButton();
        Quantidade = new javax.swing.JLabel();
        QuantidadeTextField = new javax.swing.JTextField();
        PrecoUnidade = new javax.swing.JLabel();
        ValoUnitarioLabel = new javax.swing.JLabel();
        ValorCalendario = new javax.swing.JLabel();
        ValoCalenadarioLabel = new javax.swing.JLabel();
        ValorFrete = new javax.swing.JLabel();
        ValorFreteLabel = new javax.swing.JLabel();
        ValorEcomenda = new javax.swing.JLabel();
        ValorEcomendaLabel = new javax.swing.JLabel();
        CalcularButton = new javax.swing.JButton();
        LimparButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        ArquivoMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gráfica LFC");
        setResizable(false);

        GraficaLFC.setBackground(new java.awt.Color(0, 0, 0));
        GraficaLFC.setFont(new java.awt.Font("Lao UI", 1, 36)); // NOI18N
        GraficaLFC.setForeground(new java.awt.Color(255, 255, 255));
        GraficaLFC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GraficaLFC.setText("Grafica LFC");
        GraficaLFC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        GraficaLFC.setOpaque(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Calendarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Book Antiqua", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        EstadoDestino.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        EstadoDestino.setText("Estado de destino:");

        TipoCalendario.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        TipoCalendario.setText("Tipo de Calendário:");

        estadosComboBox.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        estadosComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MG", "ES", "RJ", "SP" }));

        CalendarioSimplesRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        CelendarioButtonGroup.add(CalendarioSimplesRadioButton);
        CalendarioSimplesRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        CalendarioSimplesRadioButton.setSelected(true);
        CalendarioSimplesRadioButton.setText("Simples");
        CalendarioSimplesRadioButton.setOpaque(false);

        CalendarioLuxoRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        CelendarioButtonGroup.add(CalendarioLuxoRadioButton1);
        CalendarioLuxoRadioButton1.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        CalendarioLuxoRadioButton1.setText("Luxo");
        CalendarioLuxoRadioButton1.setOpaque(false);

        Quantidade.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Quantidade.setText("Quantidade:");

        QuantidadeTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        QuantidadeTextField.setText("500");
        QuantidadeTextField.setToolTipText("Digite a quantidade de calendario acima de 500");

        PrecoUnidade.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        PrecoUnidade.setText("Preço unidade:");

        ValoUnitarioLabel.setText("R$0,10");

        ValorCalendario.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ValorCalendario.setText("Valor Calendarios:");

        ValoCalenadarioLabel.setText("R$50,00");

        ValorFrete.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ValorFrete.setText("Valor Frete:");

        ValorFreteLabel.setText("R$30,00");

        ValorEcomenda.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ValorEcomenda.setText("Valor da Ecomenda");

        ValorEcomendaLabel.setBackground(new java.awt.Color(255, 255, 255));
        ValorEcomendaLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ValorEcomendaLabel.setText("R$80,00");

        CalcularButton.setText("Calcular");
        CalcularButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularButtonActionPerformed(evt);
            }
        });

        LimparButton.setText("Limpar");
        LimparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ValorEcomendaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(EstadoDestino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(estadosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(CalcularButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ValorFrete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ValorFreteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PrecoUnidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ValoUnitarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Quantidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(QuantidadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ValorCalendario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ValoCalenadarioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TipoCalendario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CalendarioSimplesRadioButton)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CalendarioLuxoRadioButton1)))
                        .addComponent(ValorEcomenda)))
                .addGap(18, 18, 18)
                .addComponent(LimparButton)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EstadoDestino)
                    .addComponent(estadosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoCalendario)
                    .addComponent(CalendarioSimplesRadioButton)
                    .addComponent(CalendarioLuxoRadioButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Quantidade)
                    .addComponent(QuantidadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrecoUnidade)
                    .addComponent(ValoUnitarioLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValorCalendario)
                    .addComponent(ValoCalenadarioLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValorFrete)
                    .addComponent(ValorFreteLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CalcularButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ValorEcomenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ValorEcomendaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LimparButton)
                .addContainerGap())
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        ArquivoMenu.setText("Arquivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btSair.gif"))); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        ArquivoMenu.add(jMenuItem1);

        jMenuBar1.add(ArquivoMenu);

        jMenu2.setText("Ajuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GraficaLFC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(GraficaLFC, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //calcular demostrando valores
    private void CalcularButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularButtonActionPerformed

        double valorUnitario = 0, quantidade, valoFrete = 0, valorEncomenda, valorCalendario;
        String valorUnitarioFormatado, valoFreteFormatado, valorEncomendaFormatado,
                valorCalendarioformatado;

        DecimalFormat formato = new DecimalFormat("R$#,##0.00");
        quantidade = Integer.parseInt(QuantidadeTextField.getText());

        switch (estadosComboBox.getSelectedIndex()) {
            //MG
            case 0:
            //ES
            case 1:
                if (CalendarioSimplesRadioButton.isSelected()) {
                    valorUnitario = 0.10;
                } else {
                    valorUnitario = 0.17;
                }

                if (quantidade >= 500 && quantidade <= 1000) {
                    valoFrete = 30;
                }
                if (quantidade >= 1001 && quantidade <= 2000) {
                    valoFrete = 40;
                }
                if (quantidade > 2000) {
                    valoFrete = 50;
                }
                break;
            //RJ
            case 2:
                if (CalendarioSimplesRadioButton.isSelected()) {
                    valorUnitario = 0.15;
                } else {
                    valorUnitario = 0.28;
                }

                if (quantidade >= 500 && quantidade <= 1000) {
                    valoFrete = 35;
                }
                if (quantidade >= 1001 && quantidade <= 2000) {
                    valoFrete = 45;
                }
                if (quantidade > 2000) {
                    valoFrete = 55;
                }
                break;
            //SP
            case 3:
                if (CalendarioSimplesRadioButton.isSelected()) {
                    valorUnitario = 0.20;
                } else {
                    valorUnitario = 0.32;
                }

                if (quantidade >= 500 && quantidade <= 1000) {
                    valoFrete = 40;
                }
                if (quantidade >= 1001 && quantidade <= 2000) {
                    valoFrete = 50;
                }
                if (quantidade > 2000) {
                    valoFrete = 60;
                }
                break;
        }
        //Calculos e demostrando reultado

        valorUnitarioFormatado = formato.format(valorUnitario);
        ValoUnitarioLabel.setText(String.valueOf(valorUnitarioFormatado));

        valorCalendario = valorUnitario * quantidade;
        valorCalendarioformatado = formato.format(valorCalendario);
        ValoCalenadarioLabel.setText(valorCalendarioformatado);

        valoFreteFormatado = formato.format(valoFrete);
        ValorFreteLabel.setText(valoFreteFormatado);

        valorEncomenda = valorCalendario + valoFrete;
        valorEncomendaFormatado = formato.format(valorEncomenda);
        ValorEcomendaLabel.setText(valorEncomendaFormatado);




    }//GEN-LAST:event_CalcularButtonActionPerformed

    //Limpar
    private void LimparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparButtonActionPerformed
 
        estadosComboBox.setSelectedIndex(0);
        CalendarioSimplesRadioButton.setSelected(true);
        QuantidadeTextField.setText("500");
        ValoUnitarioLabel.setText("R$0,10");
        ValoCalenadarioLabel.setText("R$50.00");
        ValorFreteLabel.setText("R$30.00");
        ValorEcomendaLabel.setText("R$80,00");
        
    }//GEN-LAST:event_LimparButtonActionPerformed

    //Sair
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
 
        if (JOptionPane.showConfirmDialog(null, "Deseja sair?", "Sair", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
    private javax.swing.JButton CalcularButton;
    private javax.swing.JRadioButton CalendarioLuxoRadioButton1;
    private javax.swing.JRadioButton CalendarioSimplesRadioButton;
    private javax.swing.ButtonGroup CelendarioButtonGroup;
    private javax.swing.JLabel EstadoDestino;
    private javax.swing.JLabel GraficaLFC;
    private javax.swing.JButton LimparButton;
    private javax.swing.JLabel PrecoUnidade;
    private javax.swing.JLabel Quantidade;
    private javax.swing.JTextField QuantidadeTextField;
    private javax.swing.JLabel TipoCalendario;
    private javax.swing.JLabel ValoCalenadarioLabel;
    private javax.swing.JLabel ValoUnitarioLabel;
    private javax.swing.JLabel ValorCalendario;
    private javax.swing.JLabel ValorEcomenda;
    private javax.swing.JLabel ValorEcomendaLabel;
    private javax.swing.JLabel ValorFrete;
    private javax.swing.JLabel ValorFreteLabel;
    private javax.swing.JComboBox estadosComboBox;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
