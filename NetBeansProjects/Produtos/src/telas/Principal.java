package telas;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas Felipe Costa
 * @version 1.0.0
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("con_estoque?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        vendedorQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT v FROM Vendedor v");
        vendedorList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : vendedorQuery.getResultList();
        vendaQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT v FROM Venda v");
        vendaList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : vendaQuery.getResultList();
        produtosQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Produtos p");
        produtosList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : produtosQuery.getResultList();
        clienteQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cliente c");
        clienteList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clienteQuery.getResultList();
        Pnl_Principal = new javax.swing.JPanel();
        Pnl_Vendedor = new javax.swing.JPanel();
        Txf_Cod_ven = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Txf_Nom_Ven = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Txf_end_ven = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Txf_num_ven = new javax.swing.JTextField();
        Txf_uf_ven = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Txf_cid_ven = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Btn_Salvar = new javax.swing.JButton();
        Btn_excluir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Txf_sen_ven = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        Txf_fun_ven = new javax.swing.JTextField();
        Pnl_Cliente = new javax.swing.JPanel();
        Txf_Cod_cli = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Txf_Nom_Cli = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Txf_end_cli = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Txf_num_cli = new javax.swing.JTextField();
        Txf_uf_cli = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Txf_cid_cli = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Btn_Salvar_cli = new javax.swing.JButton();
        Btn_excluir_cli = new javax.swing.JButton();
        Btn_fechar_cli = new javax.swing.JButton();
        Pnl_Produtos = new javax.swing.JPanel();
        Pnl_Venda = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        MnI_CadVendedor = new javax.swing.JMenuItem();
        MnI_CadCliente = new javax.swing.JMenuItem();
        MnI_CadProduto = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        MnI_RelVenda = new javax.swing.JMenuItem();
        MnI_RelProdutos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pnl_Principal.setLayout(new java.awt.CardLayout());

        jLabel1.setText("Codigo");

        jLabel2.setText("Nome");

        jLabel3.setText("Endereço");

        jLabel4.setText("N°");

        jLabel6.setText("Uf");

        jLabel5.setText("Cidade");

        Btn_Salvar.setText("Salvar");

        Btn_excluir.setText("Excluir");

        jButton1.setText("Fechar");

        jLabel7.setText("Senha");

        jLabel8.setText("Função");

        javax.swing.GroupLayout Pnl_VendedorLayout = new javax.swing.GroupLayout(Pnl_Vendedor);
        Pnl_Vendedor.setLayout(Pnl_VendedorLayout);
        Pnl_VendedorLayout.setHorizontalGroup(
            Pnl_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_VendedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pnl_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addGroup(Pnl_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Pnl_VendedorLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pnl_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pnl_VendedorLayout.createSequentialGroup()
                        .addComponent(Btn_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(Btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Pnl_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(Pnl_VendedorLayout.createSequentialGroup()
                            .addComponent(Txf_Cod_ven, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Txf_Nom_Ven, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Pnl_VendedorLayout.createSequentialGroup()
                            .addGroup(Pnl_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Txf_end_ven, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                .addComponent(Txf_cid_ven))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(Pnl_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(Pnl_VendedorLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Txf_uf_ven, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Pnl_VendedorLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Txf_num_ven)))))
                    .addComponent(Txf_sen_ven, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txf_fun_ven, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        Pnl_VendedorLayout.setVerticalGroup(
            Pnl_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_VendedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pnl_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Txf_Cod_ven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Txf_Nom_Ven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pnl_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Txf_end_ven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Txf_num_ven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pnl_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Txf_cid_ven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(Txf_uf_ven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pnl_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Txf_fun_ven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 261, Short.MAX_VALUE)
                .addGroup(Pnl_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Txf_sen_ven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(Pnl_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Salvar)
                    .addComponent(Btn_excluir)
                    .addComponent(jButton1)))
        );

        Pnl_Principal.add(Pnl_Vendedor, "card5");

        jLabel9.setText("Codigo");

        jLabel10.setText("Nome");

        jLabel11.setText("Endereço");

        jLabel12.setText("N°");

        jLabel13.setText("Uf");

        jLabel14.setText("Cidade");

        Btn_Salvar_cli.setText("Salvar");

        Btn_excluir_cli.setText("Excluir");

        Btn_fechar_cli.setText("Fechar");

        javax.swing.GroupLayout Pnl_ClienteLayout = new javax.swing.GroupLayout(Pnl_Cliente);
        Pnl_Cliente.setLayout(Pnl_ClienteLayout);
        Pnl_ClienteLayout.setHorizontalGroup(
            Pnl_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
            .addGroup(Pnl_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Pnl_ClienteLayout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addGroup(Pnl_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel9)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Pnl_ClienteLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(Pnl_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Pnl_ClienteLayout.createSequentialGroup()
                            .addComponent(Btn_Salvar_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addComponent(Btn_excluir_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(46, 46, 46)
                            .addComponent(Btn_fechar_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Pnl_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Pnl_ClienteLayout.createSequentialGroup()
                                .addComponent(Txf_Cod_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txf_Nom_Cli, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Pnl_ClienteLayout.createSequentialGroup()
                                .addGroup(Pnl_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Txf_end_cli, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                    .addComponent(Txf_cid_cli))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Pnl_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Pnl_ClienteLayout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Txf_uf_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Pnl_ClienteLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Txf_num_cli))))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        Pnl_ClienteLayout.setVerticalGroup(
            Pnl_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
            .addGroup(Pnl_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Pnl_ClienteLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addGroup(Pnl_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(Txf_Cod_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(Txf_Nom_Cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(Pnl_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(Txf_end_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(Txf_num_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(Pnl_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(Txf_cid_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(Txf_uf_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(320, 320, 320)
                    .addGroup(Pnl_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Btn_Salvar_cli)
                        .addComponent(Btn_excluir_cli)
                        .addComponent(Btn_fechar_cli))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Pnl_Principal.add(Pnl_Cliente, "Cliente");

        javax.swing.GroupLayout Pnl_ProdutosLayout = new javax.swing.GroupLayout(Pnl_Produtos);
        Pnl_Produtos.setLayout(Pnl_ProdutosLayout);
        Pnl_ProdutosLayout.setHorizontalGroup(
            Pnl_ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );
        Pnl_ProdutosLayout.setVerticalGroup(
            Pnl_ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );

        Pnl_Principal.add(Pnl_Produtos, "Produto");

        javax.swing.GroupLayout Pnl_VendaLayout = new javax.swing.GroupLayout(Pnl_Venda);
        Pnl_Venda.setLayout(Pnl_VendaLayout);
        Pnl_VendaLayout.setHorizontalGroup(
            Pnl_VendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );
        Pnl_VendaLayout.setVerticalGroup(
            Pnl_VendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );

        Pnl_Principal.add(Pnl_Venda, "Login");

        jMenuBar1.setMargin(new java.awt.Insets(0, 30, 0, 0));

        jMenu2.setText("Cadastro");

        MnI_CadVendedor.setText("Vendedor");
        jMenu2.add(MnI_CadVendedor);

        MnI_CadCliente.setText("Cliente");
        MnI_CadCliente.setEnabled(false);
        MnI_CadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnI_CadClienteActionPerformed(evt);
            }
        });
        jMenu2.add(MnI_CadCliente);

        MnI_CadProduto.setText("Produto");
        MnI_CadProduto.setEnabled(false);
        jMenu2.add(MnI_CadProduto);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Relatorio");

        MnI_RelVenda.setText("Venda");
        MnI_RelVenda.setEnabled(false);
        jMenu1.add(MnI_RelVenda);

        MnI_RelProdutos.setText("Lista De Produtos");
        MnI_RelProdutos.setEnabled(false);
        jMenu1.add(MnI_RelProdutos);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(Pnl_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(Pnl_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MnI_CadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnI_CadClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnI_CadClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Salvar;
    private javax.swing.JButton Btn_Salvar_cli;
    private javax.swing.JButton Btn_excluir;
    private javax.swing.JButton Btn_excluir_cli;
    private javax.swing.JButton Btn_fechar_cli;
    private javax.swing.JMenuItem MnI_CadCliente;
    private javax.swing.JMenuItem MnI_CadProduto;
    private javax.swing.JMenuItem MnI_CadVendedor;
    private javax.swing.JMenuItem MnI_RelProdutos;
    private javax.swing.JMenuItem MnI_RelVenda;
    private javax.swing.JPanel Pnl_Cliente;
    private javax.swing.JPanel Pnl_Principal;
    private javax.swing.JPanel Pnl_Produtos;
    private javax.swing.JPanel Pnl_Venda;
    private javax.swing.JPanel Pnl_Vendedor;
    private javax.swing.JTextField Txf_Cod_cli;
    private javax.swing.JTextField Txf_Cod_ven;
    private javax.swing.JTextField Txf_Nom_Cli;
    private javax.swing.JTextField Txf_Nom_Ven;
    private javax.swing.JTextField Txf_cid_cli;
    private javax.swing.JTextField Txf_cid_ven;
    private javax.swing.JTextField Txf_end_cli;
    private javax.swing.JTextField Txf_end_ven;
    private javax.swing.JTextField Txf_fun_ven;
    private javax.swing.JTextField Txf_num_cli;
    private javax.swing.JTextField Txf_num_ven;
    private javax.swing.JPasswordField Txf_sen_ven;
    private javax.swing.JTextField Txf_uf_cli;
    private javax.swing.JTextField Txf_uf_ven;
    private java.util.List<telas.Cliente> clienteList;
    private javax.persistence.Query clienteQuery;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private java.util.List<telas.Produtos> produtosList;
    private javax.persistence.Query produtosQuery;
    private java.util.List<telas.Venda> vendaList;
    private javax.persistence.Query vendaQuery;
    private java.util.List<telas.Vendedor> vendedorList;
    private javax.persistence.Query vendedorQuery;
    // End of variables declaration//GEN-END:variables
}
