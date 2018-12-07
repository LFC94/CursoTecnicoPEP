package Codigo;

import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author Lucas Felipe Csta
 */
public final class Iniciar extends javax.swing.JFrame {

    Uteis util = new Uteis();
    private int opcoesId = 0;
    private int pacotesId = 0;

    public Iniciar() {
        initComponents();
        Invisivel();
        logar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PacotebuttonGroup = new javax.swing.ButtonGroup();
        AlimentacaobuttonGroup = new javax.swing.ButtonGroup();
        AdministradorbuttonGroup = new javax.swing.ButtonGroup();
        TipoPrdbuttonGroup = new javax.swing.ButtonGroup();
        conect = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("hotel?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        cadastrarhospedeQuery = java.beans.Beans.isDesignTime() ? null : conect.createQuery("SELECT c FROM Cadastrarhospede c");
        cadastrarhospedeList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : cadastrarhospedeQuery.getResultList();
        cadastroprodutoQuery = java.beans.Beans.isDesignTime() ? null : conect.createQuery("SELECT c FROM Cadastroproduto c");
        cadastroprodutoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : cadastroprodutoQuery.getResultList();
        formapagamentoQuery = java.beans.Beans.isDesignTime() ? null : conect.createQuery("SELECT f FROM Formapagamento f");
        formapagamentoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : formapagamentoQuery.getResultList();
        hospedagemQuery = java.beans.Beans.isDesignTime() ? null : conect.createQuery("SELECT h FROM Hospedagem h");
        hospedagemList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : hospedagemQuery.getResultList();
        loginfuncionarioQuery = java.beans.Beans.isDesignTime() ? null : conect.createQuery("SELECT l FROM Loginfuncionario l");
        loginfuncionarioList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : loginfuncionarioQuery.getResultList();
        pacotesQuery = java.beans.Beans.isDesignTime() ? null : conect.createQuery("SELECT p FROM Pacotes p");
        pacotesList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : pacotesQuery.getResultList();
        quartosQuery = java.beans.Beans.isDesignTime() ? null : conect.createQuery("SELECT q FROM Quartos q");
        quartosList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : quartosQuery.getResultList();
        TabbedPaneMenu = new javax.swing.JTabbedPane();
        HomeMenu = new javax.swing.JPanel();
        PrincipalButton = new javax.swing.JButton();
        SairButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ClienteMenu = new javax.swing.JPanel();
        ClienteButton = new javax.swing.JButton();
        RelClienteButton = new javax.swing.JButton();
        CadFuncioButton = new javax.swing.JButton();
        ProdutoMenu = new javax.swing.JPanel();
        ProdutosButton = new javax.swing.JButton();
        RelProdutoButton = new javax.swing.JButton();
        HospedagenMenu = new javax.swing.JPanel();
        PacotesButton = new javax.swing.JButton();
        QuartosButton = new javax.swing.JButton();
        OpcionaiButton = new javax.swing.JButton();
        HospedagemButton = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        CadastroProdutos = new javax.swing.JInternalFrame();
        CadastroProduto = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        InfoPrdPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        CodPrdTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        NomPrdTextField = new javax.swing.JTextField();
        InfPrdPanel = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        ValorVendaTextField = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        EstPrdTextField = new javax.swing.JTextField();
        salvarProdutoButton = new javax.swing.JButton();
        excluirProdutoButton = new javax.swing.JButton();
        FecharPrdButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        RdB_Bebida = new javax.swing.JRadioButton();
        RdB_Comida = new javax.swing.JRadioButton();
        jPanelBebida = new javax.swing.JPanel();
        calcool = new javax.swing.JCheckBox();
        cgas = new javax.swing.JCheckBox();
        refri = new javax.swing.JCheckBox();
        salcool = new javax.swing.JCheckBox();
        sgas = new javax.swing.JCheckBox();
        suco = new javax.swing.JCheckBox();
        jPanelComida = new javax.swing.JPanel();
        torta = new javax.swing.JCheckBox();
        bolo = new javax.swing.JCheckBox();
        doce = new javax.swing.JCheckBox();
        frito = new javax.swing.JCheckBox();
        assado = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OBSText = new javax.swing.JTextPane();
        CadastoCliente = new javax.swing.JInternalFrame();
        PanelCadastroCliente = new javax.swing.JPanel();
        InfoCli3 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        CodigoCliTextField3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        NomeCliTextField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        CPFCNPJCliTextField = new javax.swing.JTextField();
        profissaoCliTextField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        EstadoCivilCliTextField = new javax.swing.JTextField();
        salvarClienteButton3 = new javax.swing.JButton();
        limparClienteButton3 = new javax.swing.JButton();
        excluirClienteButton3 = new javax.swing.JButton();
        FecharCliButton = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        EnderecoCli = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        CEPCliTextField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        PaisCliTextField = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        EnderecoCliTextField = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        NCliTextField = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        BairroCliTextField = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        CidadeCliTextField = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        EstadoCliTextField = new javax.swing.JTextField();
        SenhaCli = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SenhaCliTextField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        ConfirmaSenhaCliTextField = new javax.swing.JPasswordField();
        jLabel30 = new javax.swing.JLabel();
        E_mailCliTextField = new javax.swing.JTextField();
        CadastroPacostes = new javax.swing.JInternalFrame();
        PanelPacotes = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        pacotesCadastrarButton = new javax.swing.JButton();
        pacotesCancelarButton = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        SoltAltaTemTextField = new javax.swing.JTextField();
        SolFinSemTextField = new javax.swing.JTextField();
        SolNormTextField = new javax.swing.JTextField();
        CasNormTextField = new javax.swing.JTextField();
        CasFinSemTextField = new javax.swing.JTextField();
        CasAltTemTextField = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        CadastroFuncionarios = new javax.swing.JInternalFrame();
        PanelCadastroFuncionario = new javax.swing.JPanel();
        salvarFunButton = new javax.swing.JButton();
        limparFunButton = new javax.swing.JButton();
        excluirFunButton = new javax.swing.JButton();
        FecharFunButton = new javax.swing.JButton();
        InfoFun = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        CodigoFunTextField = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        NomeFunTextField = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        CPFFunTextField = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        FuncaoFunTextField = new javax.swing.JTextField();
        EnderecoFun = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        CEPFunTextField = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        PaisFunTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        EnderecoFunTextField = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        NFunTextField = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        BairroFunTextField = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        CidadeFunTextField = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        EstadoFunTextField = new javax.swing.JTextField();
        Login = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        SenhaFunTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ConfirmaSenhaFunTextField = new javax.swing.JTextField();
        LoginFunTextField = new javax.swing.JTextField();
        Permicoes = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        AdmSimRadioButton = new javax.swing.JRadioButton();
        AdmNaoRadioButton = new javax.swing.JRadioButton();
        jLabel68 = new javax.swing.JLabel();
        CadastraCliCheckBox = new javax.swing.JCheckBox();
        CadastraFunCheckBox = new javax.swing.JCheckBox();
        CadastraQuartoCheckBox = new javax.swing.JCheckBox();
        CadastraPrdCheckBox = new javax.swing.JCheckBox();
        HospedagemCheckBox = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        CadastroQuarto = new javax.swing.JInternalFrame();
        PanelQuartos = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        quartoNumeroTextField = new javax.swing.JTextField();
        quartoTipoTextField = new javax.swing.JTextField();
        quartoRegistrarButton = new javax.swing.JButton();
        quartoCancelarjButton5 = new javax.swing.JButton();
        AndarQuartoTextField = new javax.swing.JSpinner();
        CamasQuartoTextField = new javax.swing.JSpinner();
        ExcluirButton = new javax.swing.JButton();
        jLabel72 = new javax.swing.JLabel();
        Conforto1TextField = new javax.swing.JTextField();
        Conforto2TextField = new javax.swing.JTextField();
        Conforto3TextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ValorTextField = new javax.swing.JFormattedTextField();
        Opcoes = new javax.swing.JInternalFrame();
        PanelOpcionais = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        AlimenteTodosTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        AlimenteCafeTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        AlimenteAlmocoTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        AcessibiFumanteTextField = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        AcessibiInfatilTextField = new javax.swing.JTextField();
        QpcoesSalvarButton = new javax.swing.JButton();
        OpcoesCancelarButton = new javax.swing.JButton();
        Hospedagem = new javax.swing.JInternalFrame();
        PanelHospedagem = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        CodHosTextField = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        CodCliHospTextField = new javax.swing.JTextField();
        NomCliHosTextField = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        NuQuartoTextField = new javax.swing.JTextField();
        DataSaidaTextField = new javax.swing.JFormattedTextField();
        jLabel80 = new javax.swing.JLabel();
        AndarTextField = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        TipoTextField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        SolNorRadioButton = new javax.swing.JRadioButton();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel83 = new javax.swing.JLabel();
        CasNorRadioButton1 = new javax.swing.JRadioButton();
        SolFimRadioButton = new javax.swing.JRadioButton();
        CasFimRadioButton = new javax.swing.JRadioButton();
        SolAltRadioButton = new javax.swing.JRadioButton();
        CasAltRadioButton = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        CafeRadioButton = new javax.swing.JRadioButton();
        AlmocoRadioButton = new javax.swing.JRadioButton();
        JantarRadioButton = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        InfantilCheckBox = new javax.swing.JCheckBox();
        FumanteCheckBox = new javax.swing.JCheckBox();
        hosSalvarButton = new javax.swing.JButton();
        HosExcluirButton = new javax.swing.JButton();
        HosCancelarButton = new javax.swing.JButton();
        dataEntradaTextField = new javax.swing.JFormattedTextField();
        Logar = new javax.swing.JInternalFrame();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        UsuarioTextField = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        SenhaTextField = new javax.swing.JPasswordField();
        LogarButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TabbedPaneMenu.setBackground(new java.awt.Color(102, 153, 0));
        TabbedPaneMenu.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        HomeMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 255, 255), null));

        PrincipalButton.setBackground(new java.awt.Color(255, 153, 0));
        PrincipalButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/home.png"))); // NOI18N
        PrincipalButton.setToolTipText("Homer");
        PrincipalButton.setBorder(null);
        PrincipalButton.setOpaque(false);
        PrincipalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrincipalButtonActionPerformed(evt);
            }
        });

        SairButton.setBackground(new java.awt.Color(255, 0, 0));
        SairButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/exit.png"))); // NOI18N
        SairButton.setToolTipText("Sair");
        SairButton.setBorder(null);
        SairButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SairButton.setOpaque(false);
        SairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HomeMenuLayout = new javax.swing.GroupLayout(HomeMenu);
        HomeMenu.setLayout(HomeMenuLayout);
        HomeMenuLayout.setHorizontalGroup(
            HomeMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PrincipalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HomeMenuLayout.setVerticalGroup(
            HomeMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeMenuLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(HomeMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomeMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PrincipalButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SairButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        TabbedPaneMenu.addTab("Home", HomeMenu);

        ClienteMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 255, 255), new java.awt.Color(0, 102, 204)));

        ClienteButton.setBackground(new java.awt.Color(255, 255, 255));
        ClienteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cliente.png"))); // NOI18N
        ClienteButton.setToolTipText("Cadastro Cliente");
        ClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteButtonActionPerformed(evt);
            }
        });

        RelClienteButton.setBackground(new java.awt.Color(255, 255, 255));
        RelClienteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/report.jpg"))); // NOI18N
        RelClienteButton.setToolTipText("Relatorio");
        RelClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelClienteButtonActionPerformed(evt);
            }
        });

        CadFuncioButton.setBackground(new java.awt.Color(255, 255, 255));
        CadFuncioButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone funcionario.png"))); // NOI18N
        CadFuncioButton.setToolTipText("cadastro Funcionarios");
        CadFuncioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadFuncioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ClienteMenuLayout = new javax.swing.GroupLayout(ClienteMenu);
        ClienteMenu.setLayout(ClienteMenuLayout);
        ClienteMenuLayout.setHorizontalGroup(
            ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteMenuLayout.createSequentialGroup()
                .addContainerGap(208, Short.MAX_VALUE)
                .addComponent(ClienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CadFuncioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RelClienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        ClienteMenuLayout.setVerticalGroup(
            ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClienteMenuLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RelClienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CadFuncioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        TabbedPaneMenu.addTab("Pessoas", ClienteMenu);

        ProdutoMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 255, 255), new java.awt.Color(0, 102, 204)));

        ProdutosButton.setBackground(new java.awt.Color(153, 153, 153));
        ProdutosButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/03-comparador_icon.png"))); // NOI18N
        ProdutosButton.setToolTipText("Cadastro Produto");
        ProdutosButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ProdutosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdutosButtonActionPerformed(evt);
            }
        });

        RelProdutoButton.setBackground(new java.awt.Color(255, 255, 255));
        RelProdutoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/report.jpg"))); // NOI18N
        RelProdutoButton.setToolTipText("Relatorio de Produtos");
        RelProdutoButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RelProdutoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelProdutoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProdutoMenuLayout = new javax.swing.GroupLayout(ProdutoMenu);
        ProdutoMenu.setLayout(ProdutoMenuLayout);
        ProdutoMenuLayout.setHorizontalGroup(
            ProdutoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProdutoMenuLayout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addComponent(ProdutosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RelProdutoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
        );
        ProdutoMenuLayout.setVerticalGroup(
            ProdutoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProdutoMenuLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(ProdutoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProdutosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RelProdutoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        TabbedPaneMenu.addTab("Produto", ProdutoMenu);

        HospedagenMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 255, 255), new java.awt.Color(0, 102, 204)));

        PacotesButton.setBackground(new java.awt.Color(255, 255, 255));
        PacotesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone pacote.png"))); // NOI18N
        PacotesButton.setToolTipText("Pacote");
        PacotesButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PacotesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PacotesButtonActionPerformed(evt);
            }
        });

        QuartosButton.setBackground(new java.awt.Color(255, 255, 255));
        QuartosButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone quarto2.png"))); // NOI18N
        QuartosButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        QuartosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuartosButtonActionPerformed(evt);
            }
        });

        OpcionaiButton.setBackground(new java.awt.Color(255, 255, 255));
        OpcionaiButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone opções.jpg"))); // NOI18N
        OpcionaiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionaiButtonActionPerformed(evt);
            }
        });

        HospedagemButton.setText("Hospedage");
        HospedagemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospedagemButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HospedagenMenuLayout = new javax.swing.GroupLayout(HospedagenMenu);
        HospedagenMenu.setLayout(HospedagenMenuLayout);
        HospedagenMenuLayout.setHorizontalGroup(
            HospedagenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HospedagenMenuLayout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addComponent(HospedagemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OpcionaiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(QuartosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PacotesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        HospedagenMenuLayout.setVerticalGroup(
            HospedagenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HospedagenMenuLayout.createSequentialGroup()
                .addGroup(HospedagenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(HospedagenMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(HospedagemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(HospedagenMenuLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(HospedagenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OpcionaiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(HospedagenMenuLayout.createSequentialGroup()
                                .addGroup(HospedagenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(PacotesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(QuartosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        TabbedPaneMenu.addTab("Hospedagem", HospedagenMenu);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        CadastroProdutos.setIconifiable(true);
        CadastroProdutos.setMaximizable(true);
        CadastroProdutos.setResizable(true);
        CadastroProdutos.setMinimumSize(new java.awt.Dimension(400, 500));
        CadastroProdutos.setName(""); // NOI18N
        CadastroProdutos.setVisible(true);

        CadastroProduto.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setBackground(new java.awt.Color(225, 225, 225));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CADASTRO DE PRODUTO");

        InfoPrdPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        InfoPrdPanel.setOpaque(false);

        jLabel4.setText("Codigo:");

        CodPrdTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CodPrdTextFieldKeyPressed(evt);
            }
        });

        jLabel5.setText("Nome:");

        javax.swing.GroupLayout InfoPrdPanelLayout = new javax.swing.GroupLayout(InfoPrdPanel);
        InfoPrdPanel.setLayout(InfoPrdPanelLayout);
        InfoPrdPanelLayout.setHorizontalGroup(
            InfoPrdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoPrdPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(InfoPrdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoPrdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CodPrdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomPrdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        InfoPrdPanelLayout.setVerticalGroup(
            InfoPrdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoPrdPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InfoPrdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CodPrdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoPrdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(NomPrdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        InfPrdPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        InfPrdPanel.setOpaque(false);

        jLabel34.setText("Valor de Venda:");

        jLabel35.setText("Estoque:");

        javax.swing.GroupLayout InfPrdPanelLayout = new javax.swing.GroupLayout(InfPrdPanel);
        InfPrdPanel.setLayout(InfPrdPanelLayout);
        InfPrdPanelLayout.setHorizontalGroup(
            InfPrdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfPrdPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(InfPrdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfPrdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ValorVendaTextField)
                    .addComponent(EstPrdTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InfPrdPanelLayout.setVerticalGroup(
            InfPrdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfPrdPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InfPrdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(ValorVendaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfPrdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(EstPrdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        salvarProdutoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/accept.png"))); // NOI18N
        salvarProdutoButton.setText("Salvar");
        salvarProdutoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarProdutoButtonActionPerformed(evt);
            }
        });

        excluirProdutoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        excluirProdutoButton.setText("Excluir");

        FecharPrdButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cross.png"))); // NOI18N
        FecharPrdButton.setText("Fechar");
        FecharPrdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharPrdButtonFecharButton(evt);
            }
        });

        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel7.setOpaque(false);

        TipoPrdbuttonGroup.add(RdB_Bebida);
        RdB_Bebida.setText("Bebida");
        RdB_Bebida.setOpaque(false);
        RdB_Bebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdB_BebidaActionPerformed(evt);
            }
        });
        RdB_Bebida.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RdB_BebidaFocusGained(evt);
            }
        });

        TipoPrdbuttonGroup.add(RdB_Comida);
        RdB_Comida.setText("Comida");
        RdB_Comida.setOpaque(false);
        RdB_Comida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdB_ComidaActionPerformed(evt);
            }
        });
        RdB_Comida.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RdB_ComidaFocusGained(evt);
            }
        });

        jPanelBebida.setPreferredSize(new java.awt.Dimension(181, 53));

        calcool.setText("C/Alcool");

        cgas.setText("C/Gas");

        refri.setText("Refri");

        salcool.setText("S/Alcool");

        sgas.setText("s/Gas");

        suco.setText("Suco");

        javax.swing.GroupLayout jPanelBebidaLayout = new javax.swing.GroupLayout(jPanelBebida);
        jPanelBebida.setLayout(jPanelBebidaLayout);
        jPanelBebidaLayout.setHorizontalGroup(
            jPanelBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBebidaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calcool)
                    .addComponent(cgas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelBebidaLayout.createSequentialGroup()
                        .addComponent(salcool)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(suco))
                    .addGroup(jPanelBebidaLayout.createSequentialGroup()
                        .addComponent(refri)
                        .addGap(18, 18, 18)
                        .addComponent(sgas)))
                .addGap(365, 365, 365))
        );
        jPanelBebidaLayout.setVerticalGroup(
            jPanelBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBebidaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcool)
                    .addComponent(refri)
                    .addComponent(sgas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cgas)
                    .addComponent(salcool)
                    .addComponent(suco)))
        );

        jPanelComida.setRequestFocusEnabled(false);

        torta.setText("Torta");

        bolo.setText("Bolo");

        doce.setText("Doces");

        frito.setText("Frito");

        assado.setText("Assado");

        javax.swing.GroupLayout jPanelComidaLayout = new javax.swing.GroupLayout(jPanelComida);
        jPanelComida.setLayout(jPanelComidaLayout);
        jPanelComidaLayout.setHorizontalGroup(
            jPanelComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(torta)
                    .addComponent(bolo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(frito)
                    .addGroup(jPanelComidaLayout.createSequentialGroup()
                        .addComponent(doce)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(assado)))
                .addContainerGap(404, Short.MAX_VALUE))
        );
        jPanelComidaLayout.setVerticalGroup(
            jPanelComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComidaLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanelComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(torta)
                    .addComponent(doce)
                    .addComponent(assado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bolo)
                    .addComponent(frito)))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(RdB_Bebida)
                        .addGap(18, 18, 18)
                        .addComponent(RdB_Comida))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RdB_Bebida)
                    .addComponent(RdB_Comida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addContainerGap(33, Short.MAX_VALUE)
                    .addComponent(jPanelBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        jLabel6.setText("Obs:");

        jScrollPane1.setViewportView(OBSText);

        javax.swing.GroupLayout CadastroProdutoLayout = new javax.swing.GroupLayout(CadastroProduto);
        CadastroProduto.setLayout(CadastroProdutoLayout);
        CadastroProdutoLayout.setHorizontalGroup(
            CadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroProdutoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(InfoPrdPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(InfPrdPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CadastroProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CadastroProdutoLayout.createSequentialGroup()
                        .addComponent(salvarProdutoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(excluirProdutoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FecharPrdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CadastroProdutoLayout.setVerticalGroup(
            CadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroProdutoLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InfoPrdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InfPrdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(CadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarProdutoButton)
                    .addComponent(excluirProdutoButton)
                    .addComponent(FecharPrdButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CadastroProdutosLayout = new javax.swing.GroupLayout(CadastroProdutos.getContentPane());
        CadastroProdutos.getContentPane().setLayout(CadastroProdutosLayout);
        CadastroProdutosLayout.setHorizontalGroup(
            CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CadastroProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CadastroProdutosLayout.setVerticalGroup(
            CadastroProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CadastroProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane1.add(CadastroProdutos);
        CadastroProdutos.setBounds(50, 0, 50, 50);

        CadastoCliente.setIconifiable(true);
        CadastoCliente.setMaximizable(true);
        CadastoCliente.setResizable(true);
        CadastoCliente.setMinimumSize(new java.awt.Dimension(300, 400));
        CadastoCliente.setVisible(true);

        PanelCadastroCliente.setBackground(new java.awt.Color(204, 204, 255));

        InfoCli3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        InfoCli3.setOpaque(false);

        jLabel42.setText("Codigo:");

        CodigoCliTextField3.setDisabledTextColor(new java.awt.Color(110, 109, 109));
        CodigoCliTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoCliTextField3ActionPerformed(evt);
            }
        });
        CodigoCliTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CodigoCliTextField3KeyPressed(evt);
            }
        });

        jLabel19.setText("Nome:");

        jLabel20.setText("CPF/CNPJ");

        CPFCNPJCliTextField.setToolTipText("");

        jLabel21.setText("Profissão:");

        jLabel22.setText("Estado Civil:");

        javax.swing.GroupLayout InfoCli3Layout = new javax.swing.GroupLayout(InfoCli3);
        InfoCli3.setLayout(InfoCli3Layout);
        InfoCli3Layout.setHorizontalGroup(
            InfoCli3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoCli3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(InfoCli3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoCli3Layout.createSequentialGroup()
                        .addGroup(InfoCli3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel42)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InfoCli3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomeCliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CodigoCliTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoCli3Layout.createSequentialGroup()
                        .addGroup(InfoCli3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InfoCli3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EstadoCivilCliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(InfoCli3Layout.createSequentialGroup()
                                .addComponent(CPFCNPJCliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(profissaoCliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        InfoCli3Layout.setVerticalGroup(
            InfoCli3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoCli3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InfoCli3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(CodigoCliTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoCli3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(NomeCliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoCli3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(CPFCNPJCliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profissaoCliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoCli3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(EstadoCivilCliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        salvarClienteButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/accept.png"))); // NOI18N
        salvarClienteButton3.setText("Salvar");
        salvarClienteButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarClienteButton3ActionPerformed(evt);
            }
        });

        limparClienteButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cleaner.png"))); // NOI18N
        limparClienteButton3.setText("Limpar");

        excluirClienteButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        excluirClienteButton3.setText("Excluir");
        excluirClienteButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirClienteButton3ActionPerformed(evt);
            }
        });

        FecharCliButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cross.png"))); // NOI18N
        FecharCliButton.setText("Fechar");
        FecharCliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharCliButtonFecharButton(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Cadastro de Cliente");

        EnderecoCli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        EnderecoCli.setOpaque(false);

        jLabel23.setText("CEP:");

        jLabel24.setText("Pais:");

        jLabel25.setText("Endereço:");

        jLabel26.setText("Nº");

        jLabel27.setText("Bairro:");

        jLabel28.setText("Cidade:");

        jLabel29.setText("Estado:");

        javax.swing.GroupLayout EnderecoCliLayout = new javax.swing.GroupLayout(EnderecoCli);
        EnderecoCli.setLayout(EnderecoCliLayout);
        EnderecoCliLayout.setHorizontalGroup(
            EnderecoCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnderecoCliLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(EnderecoCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EnderecoCliLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel23))
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EnderecoCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(EnderecoCliLayout.createSequentialGroup()
                        .addComponent(CEPCliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PaisCliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EnderecoCliLayout.createSequentialGroup()
                        .addGroup(EnderecoCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EnderecoCliLayout.createSequentialGroup()
                                .addComponent(EnderecoCliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26))
                            .addGroup(EnderecoCliLayout.createSequentialGroup()
                                .addComponent(BairroCliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CidadeCliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel29)))
                        .addGroup(EnderecoCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(EnderecoCliLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(EstadoCliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(EnderecoCliLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
                                .addComponent(NCliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        EnderecoCliLayout.setVerticalGroup(
            EnderecoCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnderecoCliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EnderecoCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(CEPCliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(PaisCliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EnderecoCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(EnderecoCliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(NCliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EnderecoCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(BairroCliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(CidadeCliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(EstadoCliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        SenhaCli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SenhaCli.setOpaque(false);

        jLabel1.setText("Senha");

        jLabel3.setText("Confirma");

        jLabel30.setText("E.mail:");

        javax.swing.GroupLayout SenhaCliLayout = new javax.swing.GroupLayout(SenhaCli);
        SenhaCli.setLayout(SenhaCliLayout);
        SenhaCliLayout.setHorizontalGroup(
            SenhaCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SenhaCliLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(SenhaCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SenhaCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SenhaCliLayout.createSequentialGroup()
                        .addComponent(SenhaCliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ConfirmaSenhaCliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(E_mailCliTextField))
                .addContainerGap())
        );
        SenhaCliLayout.setVerticalGroup(
            SenhaCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SenhaCliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SenhaCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(SenhaCliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(ConfirmaSenhaCliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SenhaCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(E_mailCliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelCadastroClienteLayout = new javax.swing.GroupLayout(PanelCadastroCliente);
        PanelCadastroCliente.setLayout(PanelCadastroClienteLayout);
        PanelCadastroClienteLayout.setHorizontalGroup(
            PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCadastroClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCadastroClienteLayout.createSequentialGroup()
                        .addComponent(salvarClienteButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(limparClienteButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(excluirClienteButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(FecharCliButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(SenhaCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EnderecoCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(InfoCli3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelCadastroClienteLayout.setVerticalGroup(
            PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCadastroClienteLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InfoCli3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EnderecoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SenhaCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarClienteButton3)
                    .addComponent(limparClienteButton3)
                    .addComponent(excluirClienteButton3)
                    .addComponent(FecharCliButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CadastoClienteLayout = new javax.swing.GroupLayout(CadastoCliente.getContentPane());
        CadastoCliente.getContentPane().setLayout(CadastoClienteLayout);
        CadastoClienteLayout.setHorizontalGroup(
            CadastoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CadastoClienteLayout.setVerticalGroup(
            CadastoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane1.add(CadastoCliente);
        CadastoCliente.setBounds(0, 0, 50, 50);

        CadastroPacostes.setIconifiable(true);
        CadastroPacostes.setMaximizable(true);
        CadastroPacostes.setResizable(true);
        CadastroPacostes.setVisible(true);

        PanelPacotes.setBackground(new java.awt.Color(255, 255, 208));

        jLabel52.setText("Opções:");

        pacotesCadastrarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/accept.png"))); // NOI18N
        pacotesCadastrarButton.setText("Salvar");
        pacotesCadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacotesCadastrarButtonActionPerformed(evt);
            }
        });

        pacotesCancelarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cross.png"))); // NOI18N
        pacotesCancelarButton.setText("Cancelar");
        pacotesCancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacotesCancelarButtonFecharButton(evt);
            }
        });

        jLabel53.setText("Normal:");

        jLabel54.setText("Alta Temporada:");

        jLabel55.setText("Finais de Semana:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        SoltAltaTemTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        SoltAltaTemTextField.setText("0");

        SolFinSemTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        SolFinSemTextField.setText("0");

        SolNormTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        SolNormTextField.setText("0");

        CasNormTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        CasNormTextField.setText("0");

        CasFinSemTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        CasFinSemTextField.setText("0");

        CasAltTemTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        CasAltTemTextField.setText("0");

        jLabel56.setText("Solteiros:");

        jLabel57.setText("Casal:");

        jLabel58.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Pacotes");

        javax.swing.GroupLayout PanelPacotesLayout = new javax.swing.GroupLayout(PanelPacotes);
        PanelPacotes.setLayout(PanelPacotesLayout);
        PanelPacotesLayout.setHorizontalGroup(
            PanelPacotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPacotesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelPacotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelPacotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelPacotesLayout.createSequentialGroup()
                            .addGroup(PanelPacotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(PanelPacotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(PanelPacotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel53)
                                    .addComponent(CasNormTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                    .addComponent(SolNormTextField)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelPacotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelPacotesLayout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel55))
                                .addGroup(PanelPacotesLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(PanelPacotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CasFinSemTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                        .addComponent(SolFinSemTextField)))
                                .addGroup(PanelPacotesLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(PanelPacotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(PanelPacotesLayout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabel54))
                                .addGroup(PanelPacotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CasAltTemTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(SoltAltaTemTextField))))
                        .addGroup(PanelPacotesLayout.createSequentialGroup()
                            .addGap(119, 119, 119)
                            .addComponent(pacotesCadastrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(pacotesCancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelPacotesLayout.setVerticalGroup(
            PanelPacotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPacotesLayout.createSequentialGroup()
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPacotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addGroup(PanelPacotesLayout.createSequentialGroup()
                        .addGroup(PanelPacotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52)
                            .addComponent(jLabel53))
                        .addGroup(PanelPacotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPacotesLayout.createSequentialGroup()
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel56))
                            .addGroup(PanelPacotesLayout.createSequentialGroup()
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SolNormTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelPacotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CasNormTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57)))
                    .addGroup(PanelPacotesLayout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SolFinSemTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CasFinSemTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPacotesLayout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SoltAltaTemTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CasAltTemTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPacotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pacotesCadastrarButton)
                    .addComponent(pacotesCancelarButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CadastroPacostesLayout = new javax.swing.GroupLayout(CadastroPacostes.getContentPane());
        CadastroPacostes.getContentPane().setLayout(CadastroPacostesLayout);
        CadastroPacostesLayout.setHorizontalGroup(
            CadastroPacostesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPacotes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CadastroPacostesLayout.setVerticalGroup(
            CadastroPacostesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPacotes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane1.add(CadastroPacostes);
        CadastroPacostes.setBounds(100, 0, 50, 50);

        CadastroFuncionarios.setIconifiable(true);
        CadastroFuncionarios.setMaximizable(true);
        CadastroFuncionarios.setResizable(true);
        CadastroFuncionarios.setVisible(true);

        PanelCadastroFuncionario.setBackground(new java.awt.Color(153, 255, 102));

        salvarFunButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/accept.png"))); // NOI18N
        salvarFunButton.setText("Salvar");
        salvarFunButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarFunButtonActionPerformed(evt);
            }
        });

        limparFunButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cleaner.png"))); // NOI18N
        limparFunButton.setText("Limpar");

        excluirFunButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        excluirFunButton.setText("Excluir");
        excluirFunButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirFunButtonActionPerformed(evt);
            }
        });

        FecharFunButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cross.png"))); // NOI18N
        FecharFunButton.setText("Fechar");
        FecharFunButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharFunButtonFecharButton(evt);
            }
        });

        InfoFun.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        InfoFun.setOpaque(false);

        jLabel59.setText("Codigo:");

        CodigoFunTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CodigoFunTextFieldKeyPressed(evt);
            }
        });

        jLabel60.setText("Nome:");

        jLabel61.setText("CPF");

        CPFFunTextField.setToolTipText("");

        jLabel41.setText("Função:");

        javax.swing.GroupLayout InfoFunLayout = new javax.swing.GroupLayout(InfoFun);
        InfoFun.setLayout(InfoFunLayout);
        InfoFunLayout.setHorizontalGroup(
            InfoFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoFunLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(InfoFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(InfoFunLayout.createSequentialGroup()
                        .addGroup(InfoFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel59)
                            .addComponent(jLabel60))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InfoFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomeFunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CodigoFunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(InfoFunLayout.createSequentialGroup()
                        .addGroup(InfoFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel41)
                            .addComponent(jLabel61))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InfoFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FuncaoFunTextField)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoFunLayout.createSequentialGroup()
                                .addComponent(CPFFunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(339, 339, 339)))))
                .addContainerGap())
        );
        InfoFunLayout.setVerticalGroup(
            InfoFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoFunLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InfoFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(CodigoFunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(NomeFunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(CPFFunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(InfoFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(FuncaoFunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        EnderecoFun.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        EnderecoFun.setOpaque(false);

        jLabel40.setText("CEP:");

        jLabel62.setText("Pais:");

        jLabel13.setText("Endereço:");

        jLabel63.setText("Nº");

        jLabel64.setText("Bairro:");

        jLabel65.setText("Cidade:");

        jLabel66.setText("Estado:");

        javax.swing.GroupLayout EnderecoFunLayout = new javax.swing.GroupLayout(EnderecoFun);
        EnderecoFun.setLayout(EnderecoFunLayout);
        EnderecoFunLayout.setHorizontalGroup(
            EnderecoFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnderecoFunLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(EnderecoFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EnderecoFunLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel40))
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EnderecoFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(EnderecoFunLayout.createSequentialGroup()
                        .addComponent(CEPFunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PaisFunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EnderecoFunLayout.createSequentialGroup()
                        .addGroup(EnderecoFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EnderecoFunLayout.createSequentialGroup()
                                .addComponent(EnderecoFunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel63))
                            .addGroup(EnderecoFunLayout.createSequentialGroup()
                                .addComponent(BairroFunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel65)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CidadeFunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel66)))
                        .addGroup(EnderecoFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(EnderecoFunLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(EstadoFunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(EnderecoFunLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
                                .addComponent(NFunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        EnderecoFunLayout.setVerticalGroup(
            EnderecoFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnderecoFunLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EnderecoFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(CEPFunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62)
                    .addComponent(PaisFunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EnderecoFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(EnderecoFunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63)
                    .addComponent(NFunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EnderecoFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(BairroFunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65)
                    .addComponent(CidadeFunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66)
                    .addComponent(EstadoFunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Login.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Login.setOpaque(false);

        jLabel7.setText("Login:");

        jLabel8.setText("Senha:");

        jLabel9.setText("Confirme senha:");

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addComponent(SenhaFunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ConfirmaSenhaFunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LoginFunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(LoginFunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(SenhaFunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(ConfirmaSenhaFunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Permicoes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Permicoes.setOpaque(false);

        jLabel67.setText("Administrador:");

        AdmSimRadioButton.setText("Sim");
        AdmSimRadioButton.setOpaque(false);

        AdmNaoRadioButton.setSelected(true);
        AdmNaoRadioButton.setText("Nao");
        AdmNaoRadioButton.setOpaque(false);

        jLabel68.setText("Permições");

        CadastraCliCheckBox.setText("Cadastrar Cliente");
        CadastraCliCheckBox.setOpaque(false);

        CadastraFunCheckBox.setText("Cadastra Fucionario");
        CadastraFunCheckBox.setOpaque(false);

        CadastraQuartoCheckBox.setText("Cadastra Quartos");
        CadastraQuartoCheckBox.setOpaque(false);

        CadastraPrdCheckBox.setText("Cadastrar Produto");
        CadastraPrdCheckBox.setOpaque(false);

        HospedagemCheckBox.setText("Hospedagem");
        HospedagemCheckBox.setOpaque(false);

        javax.swing.GroupLayout PermicoesLayout = new javax.swing.GroupLayout(Permicoes);
        Permicoes.setLayout(PermicoesLayout);
        PermicoesLayout.setHorizontalGroup(
            PermicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PermicoesLayout.createSequentialGroup()
                .addContainerGap(244, Short.MAX_VALUE)
                .addGroup(PermicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CadastraPrdCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HospedagemCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(234, 234, 234))
            .addGroup(PermicoesLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(CadastraQuartoCheckBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PermicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PermicoesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(PermicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel67)
                        .addComponent(jLabel68))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(PermicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CadastraFunCheckBox)
                        .addGroup(PermicoesLayout.createSequentialGroup()
                            .addComponent(AdmSimRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(AdmNaoRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(CadastraCliCheckBox))
                    .addContainerGap(380, Short.MAX_VALUE)))
        );
        PermicoesLayout.setVerticalGroup(
            PermicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PermicoesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(CadastraPrdCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HospedagemCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CadastraQuartoCheckBox)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(PermicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PermicoesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(PermicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel67)
                        .addComponent(AdmNaoRadioButton)
                        .addComponent(AdmSimRadioButton))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(PermicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel68)
                        .addComponent(CadastraCliCheckBox))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(CadastraFunCheckBox)
                    .addContainerGap(63, Short.MAX_VALUE)))
        );

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CADASTRO DE FUNCIONARIO");

        javax.swing.GroupLayout PanelCadastroFuncionarioLayout = new javax.swing.GroupLayout(PanelCadastroFuncionario);
        PanelCadastroFuncionario.setLayout(PanelCadastroFuncionarioLayout);
        PanelCadastroFuncionarioLayout.setHorizontalGroup(
            PanelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCadastroFuncionarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelCadastroFuncionarioLayout.createSequentialGroup()
                        .addComponent(salvarFunButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limparFunButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluirFunButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FecharFunButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EnderecoFun, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InfoFun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Permicoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelCadastroFuncionarioLayout.setVerticalGroup(
            PanelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCadastroFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InfoFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EnderecoFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Permicoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarFunButton)
                    .addComponent(limparFunButton)
                    .addComponent(excluirFunButton)
                    .addComponent(FecharFunButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CadastroFuncionariosLayout = new javax.swing.GroupLayout(CadastroFuncionarios.getContentPane());
        CadastroFuncionarios.getContentPane().setLayout(CadastroFuncionariosLayout);
        CadastroFuncionariosLayout.setHorizontalGroup(
            CadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCadastroFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CadastroFuncionariosLayout.setVerticalGroup(
            CadastroFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCadastroFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane1.add(CadastroFuncionarios);
        CadastroFuncionarios.setBounds(150, 0, 40, 50);

        CadastroQuarto.setIconifiable(true);
        CadastroQuarto.setMaximizable(true);
        CadastroQuarto.setResizable(true);
        CadastroQuarto.setVisible(true);

        PanelQuartos.setBackground(new java.awt.Color(204, 204, 255));
        PanelQuartos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("Andar:");
        jLabel39.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel69.setText("Numero Quarto:");

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel70.setText("Tipo:");
        jLabel70.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel71.setText("Camas:");
        jLabel71.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        quartoRegistrarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/accept.png"))); // NOI18N
        quartoRegistrarButton.setText("Registrar");
        quartoRegistrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quartoRegistrarButtonActionPerformed(evt);
            }
        });

        quartoCancelarjButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cross.png"))); // NOI18N
        quartoCancelarjButton5.setText("Fechar");
        quartoCancelarjButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quartoCancelarjButton5FecharButton(evt);
            }
        });

        AndarQuartoTextField.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        CamasQuartoTextField.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        ExcluirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        ExcluirButton.setText("Excluir");
        ExcluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirButtonActionPerformed(evt);
            }
        });

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel72.setText("Conforto:");
        jLabel72.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Valor");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Quartos");

        ValorTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        javax.swing.GroupLayout PanelQuartosLayout = new javax.swing.GroupLayout(PanelQuartos);
        PanelQuartos.setLayout(PanelQuartosLayout);
        PanelQuartosLayout.setHorizontalGroup(
            PanelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelQuartosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelQuartosLayout.createSequentialGroup()
                        .addGroup(PanelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel69, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel70, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel71, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel72, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AndarQuartoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CamasQuartoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelQuartosLayout.createSequentialGroup()
                                .addComponent(quartoRegistrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ExcluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quartoCancelarjButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ValorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Conforto3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(quartoTipoTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                                .addComponent(Conforto1TextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Conforto2TextField, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(quartoNumeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelQuartosLayout.setVerticalGroup(
            PanelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelQuartosLayout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(quartoNumeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(AndarQuartoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(quartoTipoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(CamasQuartoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(Conforto1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Conforto2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Conforto3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(ValorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(PanelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quartoRegistrarButton)
                    .addComponent(ExcluirButton)
                    .addComponent(quartoCancelarjButton5))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout CadastroQuartoLayout = new javax.swing.GroupLayout(CadastroQuarto.getContentPane());
        CadastroQuarto.getContentPane().setLayout(CadastroQuartoLayout);
        CadastroQuartoLayout.setHorizontalGroup(
            CadastroQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelQuartos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CadastroQuartoLayout.setVerticalGroup(
            CadastroQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelQuartos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane1.add(CadastroQuarto);
        CadastroQuarto.setBounds(190, 0, 40, 50);

        Opcoes.setIconifiable(true);
        Opcoes.setMaximizable(true);
        Opcoes.setResizable(true);
        Opcoes.setVisible(true);

        PanelOpcionais.setBackground(new java.awt.Color(204, 255, 204));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Opções");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Alimentação"));
        jPanel1.setOpaque(false);

        jLabel15.setText("Todos+Jantar:");

        jLabel16.setText("Café da Manha:");

        jLabel17.setText("Cafe +Almoço:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AlimenteAlmocoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AlimenteCafeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AlimenteTodosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(AlimenteCafeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(AlimenteAlmocoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(AlimenteTodosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Acessibilidade"));
        jPanel2.setOpaque(false);

        jLabel73.setText("Area de Fumante:");

        jLabel74.setText("Infantil:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel73)
                    .addComponent(jLabel74))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AcessibiFumanteTextField)
                    .addComponent(AcessibiInfatilTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(AcessibiFumanteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(AcessibiInfatilTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        QpcoesSalvarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/accept.png"))); // NOI18N
        QpcoesSalvarButton.setText("Salvar");
        QpcoesSalvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QpcoesSalvarButtonActionPerformed(evt);
            }
        });

        OpcoesCancelarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cross.png"))); // NOI18N
        OpcoesCancelarButton.setText("Fechar");
        OpcoesCancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcoesCancelarButtonFecharButton(evt);
            }
        });

        javax.swing.GroupLayout PanelOpcionaisLayout = new javax.swing.GroupLayout(PanelOpcionais);
        PanelOpcionais.setLayout(PanelOpcionaisLayout);
        PanelOpcionaisLayout.setHorizontalGroup(
            PanelOpcionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionaisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelOpcionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelOpcionaisLayout.createSequentialGroup()
                        .addComponent(QpcoesSalvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OpcoesCancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelOpcionaisLayout.setVerticalGroup(
            PanelOpcionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionaisLayout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelOpcionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QpcoesSalvarButton)
                    .addComponent(OpcoesCancelarButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout OpcoesLayout = new javax.swing.GroupLayout(Opcoes.getContentPane());
        Opcoes.getContentPane().setLayout(OpcoesLayout);
        OpcoesLayout.setHorizontalGroup(
            OpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelOpcionais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        OpcoesLayout.setVerticalGroup(
            OpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelOpcionais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane1.add(Opcoes);
        Opcoes.setBounds(230, 0, 40, 50);

        Hospedagem.setIconifiable(true);
        Hospedagem.setMaximizable(true);
        Hospedagem.setResizable(true);
        Hospedagem.setVisible(true);

        PanelHospedagem.setBackground(new java.awt.Color(204, 255, 255));

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("Hospedagem");

        jLabel76.setText("Codigo:");

        CodHosTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CodHosTextFieldKeyPressed(evt);
            }
        });

        jLabel77.setText("Cliente:");

        CodCliHospTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CodCliHospTextFieldKeyPressed(evt);
            }
        });

        NomCliHosTextField.setEnabled(false);

        jLabel78.setText("Entrada");

        jLabel79.setText("Quarto:");

        NuQuartoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NuQuartoTextFieldKeyPressed(evt);
            }
        });

        DataSaidaTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        jLabel80.setText("Saida");

        AndarTextField.setEnabled(false);

        jLabel82.setText("Andar:");

        jLabel81.setText("Tipo:");

        TipoTextField.setEnabled(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Pacote"));
        jPanel3.setOpaque(false);

        jLabel84.setText("Solteiro");

        PacotebuttonGroup.add(SolNorRadioButton);
        SolNorRadioButton.setSelected(true);
        SolNorRadioButton.setText("Normal");
        SolNorRadioButton.setOpaque(false);

        jLabel83.setText("Casado");

        PacotebuttonGroup.add(CasNorRadioButton1);
        CasNorRadioButton1.setText("Normal");
        CasNorRadioButton1.setOpaque(false);

        PacotebuttonGroup.add(SolFimRadioButton);
        SolFimRadioButton.setText("Fim de Semana");
        SolFimRadioButton.setOpaque(false);

        PacotebuttonGroup.add(CasFimRadioButton);
        CasFimRadioButton.setText("Fim de Semana");
        CasFimRadioButton.setOpaque(false);

        PacotebuttonGroup.add(SolAltRadioButton);
        SolAltRadioButton.setText("Alta Temporada");
        SolAltRadioButton.setOpaque(false);

        PacotebuttonGroup.add(CasAltRadioButton);
        CasAltRadioButton.setText("Alta Temporada");
        CasAltRadioButton.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel84)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SolNorRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SolFimRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SolAltRadioButton))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel83)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CasNorRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CasFimRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CasAltRadioButton)))
                        .addGap(206, 206, 206))
                    .addComponent(jSeparator8)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SolNorRadioButton)
                    .addComponent(jLabel84)
                    .addComponent(SolFimRadioButton)
                    .addComponent(SolAltRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(CasNorRadioButton1)
                    .addComponent(CasFimRadioButton)
                    .addComponent(CasAltRadioButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Alimentação"));
        jPanel4.setOpaque(false);

        AlimentacaobuttonGroup.add(CafeRadioButton);
        CafeRadioButton.setText("Café da Manha");
        CafeRadioButton.setOpaque(false);

        AlimentacaobuttonGroup.add(AlmocoRadioButton);
        AlmocoRadioButton.setText("Cafe da Manha + Almoço");
        AlmocoRadioButton.setOpaque(false);

        AlimentacaobuttonGroup.add(JantarRadioButton);
        JantarRadioButton.setText("Tudo + Janta");
        JantarRadioButton.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(CafeRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AlmocoRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JantarRadioButton)
                .addGap(96, 96, 96))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CafeRadioButton)
                    .addComponent(AlmocoRadioButton)
                    .addComponent(JantarRadioButton))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Acessibilidade"));
        jPanel5.setOpaque(false);

        InfantilCheckBox.setText("Infantil");
        InfantilCheckBox.setOpaque(false);

        FumanteCheckBox.setText("Area de Fumantes");
        FumanteCheckBox.setOpaque(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(InfantilCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FumanteCheckBox)
                .addGap(179, 179, 179))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InfantilCheckBox)
                    .addComponent(FumanteCheckBox))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        hosSalvarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/accept.png"))); // NOI18N
        hosSalvarButton.setText("Salvar");
        hosSalvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hosSalvarButtonActionPerformed(evt);
            }
        });

        HosExcluirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        HosExcluirButton.setText("Excluir");
        HosExcluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HosExcluirButtonActionPerformed(evt);
            }
        });

        HosCancelarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cross.png"))); // NOI18N
        HosCancelarButton.setText("Fechar");
        HosCancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HosCancelarButtonFecharButton(evt);
            }
        });

        dataEntradaTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        javax.swing.GroupLayout PanelHospedagemLayout = new javax.swing.GroupLayout(PanelHospedagem);
        PanelHospedagem.setLayout(PanelHospedagemLayout);
        PanelHospedagemLayout.setHorizontalGroup(
            PanelHospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel75, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelHospedagemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelHospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelHospedagemLayout.createSequentialGroup()
                        .addGroup(PanelHospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelHospedagemLayout.createSequentialGroup()
                                .addGroup(PanelHospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel78)
                                    .addComponent(jLabel77)
                                    .addComponent(jLabel79))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelHospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PanelHospedagemLayout.createSequentialGroup()
                                        .addGroup(PanelHospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(NuQuartoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                            .addComponent(CodCliHospTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NomCliHosTextField))
                                    .addGroup(PanelHospedagemLayout.createSequentialGroup()
                                        .addGroup(PanelHospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelHospedagemLayout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addComponent(jLabel82)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AndarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(PanelHospedagemLayout.createSequentialGroup()
                                                .addComponent(dataEntradaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel80)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PanelHospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DataSaidaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(PanelHospedagemLayout.createSequentialGroup()
                                                .addComponent(jLabel81)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TipoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(81, 81, 81))))
                            .addGroup(PanelHospedagemLayout.createSequentialGroup()
                                .addComponent(jLabel76)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CodHosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelHospedagemLayout.createSequentialGroup()
                                .addComponent(hosSalvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HosExcluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HosCancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelHospedagemLayout.setVerticalGroup(
            PanelHospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHospedagemLayout.createSequentialGroup()
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelHospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(CodHosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelHospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(CodCliHospTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomCliHosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelHospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(jLabel80)
                    .addComponent(DataSaidaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataEntradaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelHospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(NuQuartoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AndarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel82)
                    .addComponent(jLabel81)
                    .addComponent(TipoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelHospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hosSalvarButton)
                    .addComponent(HosExcluirButton)
                    .addComponent(HosCancelarButton))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout HospedagemLayout = new javax.swing.GroupLayout(Hospedagem.getContentPane());
        Hospedagem.getContentPane().setLayout(HospedagemLayout);
        HospedagemLayout.setHorizontalGroup(
            HospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelHospedagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HospedagemLayout.setVerticalGroup(
            HospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelHospedagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane1.add(Hospedagem);
        Hospedagem.setBounds(270, 0, 50, 50);

        Logar.setVisible(true);

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));

        jLabel18.setText("Usuario:");

        UsuarioTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UsuarioTextFieldKeyPressed(evt);
            }
        });

        jLabel32.setText("Senha:");

        LogarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/door_open.png"))); // NOI18N
        LogarButton.setText("Logar");
        LogarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogarButtonActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cross.png"))); // NOI18N
        jButton2.setText("Fechar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(LogarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UsuarioTextField)
                            .addComponent(SenhaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(UsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(SenhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogarButton)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LogarLayout = new javax.swing.GroupLayout(Logar.getContentPane());
        Logar.getContentPane().setLayout(LogarLayout);
        LogarLayout.setHorizontalGroup(
            LogarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LogarLayout.setVerticalGroup(
            LogarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane1.add(Logar);
        Logar.setBounds(320, 0, 40, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
            .addComponent(TabbedPaneMenu)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TabbedPaneMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteButtonActionPerformed
        abrirJanela(CadastoCliente);
    }//GEN-LAST:event_ClienteButtonActionPerformed

    private void ProdutosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutosButtonActionPerformed
        abrirJanela(CadastroProdutos);
    }//GEN-LAST:event_ProdutosButtonActionPerformed

    private void PacotesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PacotesButtonActionPerformed
        abrirJanela(CadastroPacostes);
        pacotesQuery = conect.createQuery("SELECT p FROM Pacotes p ");
        pacotesList = pacotesQuery.getResultList();
        for (Pacotes pac : pacotesList) {
           /* SolFinSemTextField.setText(String.valueOf(pac.getSolfim()));
            SoltAltaTemTextField.setText(String.valueOf(pac.getSolalt()));
            SolNormTextField.setText(String.valueOf(pac.getSolnor()));
            CasFinSemTextField.setText(String.valueOf(pac.getCasfim()));
            CasAltTemTextField.setText(String.valueOf(pac.getCasalt()));
            CasNormTextField.setText(String.valueOf(pac.getCasnor()));*/
        }
    }//GEN-LAST:event_PacotesButtonActionPerformed

    private void PrincipalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrincipalButtonActionPerformed
        Invisivel();
    }//GEN-LAST:event_PrincipalButtonActionPerformed

    private void SairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairButtonActionPerformed

        if (util.Pergunta("Deseja realmente Sair?", "Sair") == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_SairButtonActionPerformed

    private void CadFuncioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadFuncioButtonActionPerformed
        abrirJanela(CadastroFuncionarios);
    }//GEN-LAST:event_CadFuncioButtonActionPerformed

    private void QuartosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuartosButtonActionPerformed
        abrirJanela(CadastroQuarto);
    }//GEN-LAST:event_QuartosButtonActionPerformed

    private void OpcionaiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionaiButtonActionPerformed

      /*  Opcoes op = new Opcoes();
        AlimenteAlmocoTextField.setText(String.valueOf(op.getCafeAlmoco()));
        AlimenteCafeTextField.setText(String.valueOf(op.getCafeManha()));
        AlimenteTodosTextField.setText(String.valueOf(op.getTodosJantar()));
        AcessibiFumanteTextField.setText(String.valueOf(op.getAreaFumante()));
        AcessibiInfatilTextField.setText(String.valueOf(op.getInfantil()));
        abrirJanela(Opcoes);*/
    }//GEN-LAST:event_OpcionaiButtonActionPerformed

    private void HospedagemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospedagemButtonActionPerformed
        abrirJanela(Hospedagem);
    }//GEN-LAST:event_HospedagemButtonActionPerformed

    private void FecharPrdButtonFecharButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharPrdButtonFecharButton
        Invisivel();
    }//GEN-LAST:event_FecharPrdButtonFecharButton

    private void FecharCliButtonFecharButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharCliButtonFecharButton
        Invisivel();
    }//GEN-LAST:event_FecharCliButtonFecharButton

    private void pacotesCancelarButtonFecharButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacotesCancelarButtonFecharButton
        Invisivel();
    }//GEN-LAST:event_pacotesCancelarButtonFecharButton

    private void FecharFunButtonFecharButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharFunButtonFecharButton
        Invisivel();
    }//GEN-LAST:event_FecharFunButtonFecharButton

    private void quartoCancelarjButton5FecharButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quartoCancelarjButton5FecharButton
        Invisivel();
    }//GEN-LAST:event_quartoCancelarjButton5FecharButton

    private void OpcoesCancelarButtonFecharButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcoesCancelarButtonFecharButton
        Invisivel();
    }//GEN-LAST:event_OpcoesCancelarButtonFecharButton

    private void HosCancelarButtonFecharButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HosCancelarButtonFecharButton
        Invisivel();
    }//GEN-LAST:event_HosCancelarButtonFecharButton

    private void LogarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogarButtonActionPerformed

        if (SenhaTextField.getText().toString().equalsIgnoreCase("admin")) {
            ClienteButton.setVisible(true);
            RelClienteButton.setVisible(true);
            CadFuncioButton.setVisible(true);
            ProdutosButton.setVisible(true);
            RelProdutoButton.setVisible(true);
            PacotesButton.setVisible(true);
            QuartosButton.setVisible(true);
            OpcionaiButton.setVisible(true);
            HospedagemButton.setVisible(true);
            Logar.setVisible(false);
        } else {
            if (SenhaTextField.getText().isEmpty() && UsuarioTextField.getText().isEmpty()) {
                util.Mensagem("Digitar as informações");
            } else {
                loginfuncionarioQuery = conect.createQuery("SELECT l FROM Loginfuncionario l WHERE l.login='" + UsuarioTextField.getText()
                        + "' and l.senha='" + SenhaTextField.getText() + "'");
                loginfuncionarioList = loginfuncionarioQuery.getResultList();
                if (loginfuncionarioList.isEmpty()) {
                    util.Mensagem("Login ou Senha incorreto");
                } else {
                    for (Loginfuncionario l : loginfuncionarioList) {
                        if (l.getPermicao1().equalsIgnoreCase("s")) {
                            ClienteButton.setVisible(true);
                        }
                        if (l.getPermicao2().equalsIgnoreCase("s")) {
                            CadFuncioButton.setVisible(true);
                        }
                        if (l.getPermicao4().equalsIgnoreCase("s")) {
                            QuartosButton.setVisible(true);
                        }
                        if (l.getPermicao5().equalsIgnoreCase("s")) {
                            ProdutosButton.setVisible(true);
                        }
                        if (l.getPermicao6().equalsIgnoreCase("s")) {
                            HospedagemButton.setVisible(true);
                        }
                    }
                }
            }
            Logar.setVisible(false);
        }
    }//GEN-LAST:event_LogarButtonActionPerformed

    private void salvarFunButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarFunButtonActionPerformed

        boolean funexis;
        try {
            if (NomeFunTextField.getText().trim().isEmpty()) {
                util.Mensagem("Nome Do Funcionario Obrigratorio");
                return;
            } else {
                if (CPFFunTextField.getText().trim().isEmpty()) {
                    util.Mensagem("CPF do funcionario Obrigratorio");
                    return;
                } else {
                    if (CEPFunTextField.getText().trim().isEmpty()) {
                        util.Mensagem("CEP do Funcionario Obrigratorio");
                        return;
                    } else {
                        if (LoginFunTextField.getText().trim().isEmpty()) {
                            util.Mensagem("Login do Funcionario Obrigratorio");
                            return;
                        } else {
                            if (SenhaFunTextField.getText().trim().isEmpty()) {
                                util.Mensagem("Senha é obrigratoria");
                                return;
                            }
                        }
                    }
                }
            }
            if (!SenhaFunTextField.getText().equals(ConfirmaSenhaFunTextField.getText())) {
                util.Mensagem("Senha incopativeis");
                return;
            }
            conect.getTransaction().begin();
            Loginfuncionario fun = new Loginfuncionario();
            loginfuncionarioQuery = conect.createQuery("SELECT l FROM Loginfuncionario l WHERE l.login='" + LoginFunTextField.getText() + "'");
            loginfuncionarioList = loginfuncionarioQuery.getResultList();

            if (loginfuncionarioList.isEmpty()) {
                funexis = false;
            } else {
                funexis = true;
            }
            fun.setLogin(LoginFunTextField.getText().toUpperCase());
            fun.setCodigo(Integer.parseInt(CodigoFunTextField.getText()));
            fun.setNome(NomeFunTextField.getText().toUpperCase());
            fun.setCpf(CPFFunTextField.getText());
            fun.setFuncao(FuncaoFunTextField.getText().toUpperCase());
            fun.setCep(CEPFunTextField.getText());
            fun.setPais(PaisFunTextField.getText().toUpperCase());
            fun.setEndereco(EnderecoFunTextField.getText().toUpperCase());
            fun.setNuendere(NFunTextField.getText().toUpperCase());
            fun.setBairro(BairroFunTextField.getText().toUpperCase());
            fun.setCidade(CidadeFunTextField.getText().toUpperCase());
            fun.setEstado(EstadoFunTextField.getText().toUpperCase());
            fun.setSenha(SenhaFunTextField.getText().toUpperCase());

            if (AdmSimRadioButton.isSelected()) {
                fun.setAdmin("S");
                fun.setPermicao1("S");
                fun.setPermicao2("S");
                fun.setPermicao3("S");
                fun.setPermicao4("S");
                fun.setPermicao5("S");
                fun.setPermicao6("S");
                fun.setPermicao7("S");
                fun.setPermicao8("S");
                fun.setPermicao9("S");
                fun.setPermicao10("S");
                fun.setPermicao11("S");
            } else {
                fun.setAdmin("N");
                if (CadastraCliCheckBox.isSelected()) {
                    fun.setPermicao1("S");
                } else {
                    fun.setPermicao1("N");
                }
                if (CadastraFunCheckBox.isSelected()) {
                    fun.setPermicao2("S");
                } else {
                    fun.setPermicao2("N");
                }
                if (CadastraQuartoCheckBox.isSelected()) {
                    fun.setPermicao4("S");
                } else {
                    fun.setPermicao4("N");
                }
                if (CadastraPrdCheckBox.isSelected()) {
                    fun.setPermicao5("S");
                } else {
                    fun.setPermicao5("N");
                }
                if (HospedagemCheckBox.isSelected()) {
                    fun.setPermicao6("S");
                } else {
                    fun.setPermicao6("N");
                }
                if (false) {
                    fun.setPermicao7("S");
                } else {
                    fun.setPermicao7("N");
                }
                if (false) {
                    fun.setPermicao8("S");
                } else {
                    fun.setPermicao8("N");
                }
                if (false) {
                    fun.setPermicao9("S");
                } else {
                    fun.setPermicao9("N");
                }
                if (false) {
                    fun.setPermicao10("S");
                } else {
                    fun.setPermicao10("N");
                }
                if (false) {
                    fun.setPermicao11("S");
                } else {
                    fun.setPermicao11("N");
                }
            }

            if (funexis) {
                conect.merge(fun);
            } else {
                conect.persist(fun);
            }
            conect.getTransaction().commit();

            util.Mensagem("Salvo");

            NomeFunTextField.setText("");
            CPFFunTextField.setText("");
            FuncaoFunTextField.setText("");
            CEPFunTextField.setText("");
            PaisFunTextField.setText("");
            EnderecoFunTextField.setText("");
            NFunTextField.setText("");
            BairroFunTextField.setText("");
            CidadeFunTextField.setText("");
            EstadoFunTextField.setText("");
            LoginFunTextField.setText("");
            SenhaFunTextField.setText("");
            ConfirmaSenhaFunTextField.setText("");
            AdmSimRadioButton.setSelected(false);
            AdmNaoRadioButton.setSelected(true);
            CadastraCliCheckBox.setSelected(false);
            CadastraFunCheckBox.setSelected(false);
            CadastraPrdCheckBox.setSelected(false);
            CadastraQuartoCheckBox.setSelected(false);
            HospedagemCheckBox.setSelected(false);
        } catch (Exception e) {
            util.Mensagem("Erro: " + e, "Cadastro Funcionario");

        }

    }//GEN-LAST:event_salvarFunButtonActionPerformed

    private void UsuarioTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsuarioTextFieldKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (UsuarioTextField.getText().isEmpty()) {
                PesquisaFuncionario pf = new PesquisaFuncionario();
                pf.tipo = "log";
                pf.show();
            }
        }
    }//GEN-LAST:event_UsuarioTextFieldKeyPressed

    private void CodigoFunTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodigoFunTextFieldKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (CodigoFunTextField.getText().isEmpty()) {
                PesquisaFuncionario pf = new PesquisaFuncionario();
                pf.tipo = "cadfun";
                pf.show();
            } else {
                loginfuncionarioQuery = conect.createQuery("SELECT l FROM Loginfuncionario l WHERE l.codigo=" + CodigoFunTextField.getText());
                loginfuncionarioList = loginfuncionarioQuery.getResultList();
                for (Loginfuncionario l : loginfuncionarioList) {
                    NomeFunTextField.setText(l.getNome());
                    CPFFunTextField.setText(l.getCpf());
                    FuncaoFunTextField.setText(l.getFuncao());
                    CEPFunTextField.setText(l.getCep());
                    PaisFunTextField.setText(l.getPais());
                    EnderecoFunTextField.setText(l.getEndereco());
                    NFunTextField.setText(l.getNuendere());
                    BairroFunTextField.setText(l.getBairro());
                    CidadeFunTextField.setText(l.getCidade());
                    EstadoFunTextField.setText(l.getEstado());
                    LoginFunTextField.setText(l.getLogin());
                    SenhaFunTextField.setText(l.getSenha());
                    ConfirmaSenhaFunTextField.setText(l.getSenha());

                    if (l.getAdmin().equals("S")) {
                        AdmSimRadioButton.setSelected(true);
                        CadastraCliCheckBox.setSelected(true);
                        CadastraFunCheckBox.setSelected(true);
                        CadastraPrdCheckBox.setSelected(true);
                        CadastraQuartoCheckBox.setSelected(true);
                        HospedagemCheckBox.setSelected(true);
                    } else {
                        AdmNaoRadioButton.isSelected();
                        if (l.getPermicao1().equalsIgnoreCase("S")) {
                            CadastraCliCheckBox.setSelected(true);
                        } else {
                            CadastraCliCheckBox.setSelected(false);
                        }
                        if (l.getPermicao2().equalsIgnoreCase("S")) {
                            CadastraFunCheckBox.setSelected(true);
                        } else {
                            CadastraFunCheckBox.setSelected(false);
                        }
                        if (l.getPermicao4().equalsIgnoreCase("S")) {
                            CadastraQuartoCheckBox.setSelected(true);
                        } else {
                            CadastraQuartoCheckBox.setSelected(false);
                        }
                        if (l.getPermicao5().equalsIgnoreCase("S")) {
                            HospedagemCheckBox.setSelected(true);
                        } else {
                            HospedagemCheckBox.setSelected(false);
                        }
                    }

                }

            }

        }

    }//GEN-LAST:event_CodigoFunTextFieldKeyPressed

    private void salvarClienteButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarClienteButton3ActionPerformed

        boolean cliexis;

        if (CodigoCliTextField3.getText().isEmpty()) {
            util.Mensagem("O codigo do cliente e obrigratorio");
            return;
        }
        if (NomeCliTextField.getText().isEmpty()) {
            util.Mensagem("Nome do Cliente Obrigratorio");
            return;
        }
        if (CEPCliTextField.getText().isEmpty()) {
            util.Mensagem("CEP do cliente Obrigratorio");
            return;
        }
        if (EnderecoCliTextField.getText().isEmpty()) {
            util.Mensagem("Enderço do cliente Obrigratorio");
            return;
        }
        if (CidadeCliTextField.getText().isEmpty()) {
            util.Mensagem("Cidade do Cliente Obrigatorio");
            return;
        }
        if (EstadoCliTextField.getText().isEmpty()) {
            util.Mensagem("Estado do Cliente Obrigratorio");
            return;
        }

        if (!SenhaCliTextField.getText().equalsIgnoreCase(ConfirmaSenhaCliTextField.getText())) {
            util.Mensagem("Senhas não sao iguais");
            return;
        }
        if (SenhaCliTextField.getText().isEmpty()) {
            util.Mensagem("SENHA é obrigatorio");
        }
        cadastrarhospedeQuery = conect.createQuery("SELECT c FROM Cadastrarhospede c WHERE c.codigo=" + CodigoCliTextField3.getText());
        cadastrarhospedeList = cadastrarhospedeQuery.getResultList();
        if (cadastrarhospedeList.isEmpty()) {
            cliexis = false;
        } else {
            cliexis = true;
        }
        conect.getTransaction().begin();
        Cadastrarhospede cli = new Cadastrarhospede();
        cli.setCodigo(Integer.parseInt(CodigoCliTextField3.getText()));
        cli.setNome(NomeCliTextField.getText());
        cli.setCnpj(CPFCNPJCliTextField.getText());
        cli.setProfissao(profissaoCliTextField.getText());
        cli.setEstadoCivil(EstadoCivilCliTextField.getText());
        cli.setCep(CEPCliTextField.getText());
        cli.setPais(PaisCliTextField.getText());
        cli.setEndereco(EnderecoCliTextField.getText());
        cli.setNumend(NCliTextField.getText());
        cli.setBairro(BairroCliTextField.getText());
        cli.setCidade(CidadeCliTextField.getText());
        cli.setEstado(EstadoCliTextField.getText());
        cli.setSenha(SenhaCliTextField.getText());
        cli.setEmail(E_mailCliTextField.getText());

        if (cliexis) {
            conect.merge(cli);
        } else {
            conect.persist(cli);
        }
        conect.getTransaction().commit();

        util.Mensagem("Salvo");

        NomeCliTextField.setText("");
        CPFCNPJCliTextField.setText("");
        profissaoCliTextField.setText("");
        EstadoCivilCliTextField.setText("");
        CEPCliTextField.setText("");
        PaisCliTextField.setText("");
        EnderecoCliTextField.setText("");
        NCliTextField.setText("");
        BairroCliTextField.setText("");
        CidadeCliTextField.setText("");
        EstadoCliTextField.setText("");
        SenhaCliTextField.setText("");
        ConfirmaSenhaCliTextField.setText("");
        E_mailCliTextField.setText("");
    }//GEN-LAST:event_salvarClienteButton3ActionPerformed

    private void excluirClienteButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirClienteButton3ActionPerformed
        if (CodigoCliTextField3.getText().equals("")) {
            util.Mensagem("Para excluir e nessesario digitar o codigo");
            return;
        }
        cadastrarhospedeQuery = conect.createQuery("SELECT c FROM Cadastrarhospede c WHERE c.codigo=" + CodigoCliTextField3.getText());
        cadastrarhospedeList = cadastrarhospedeQuery.getResultList();
        if (cadastrarhospedeList.isEmpty()) {
            util.Mensagem("Cliente Nao existente");
            return;
        }
        if (util.Pergunta("Deseja realmente Excluir este Hospede?", "EXCLUIR") == 0) {
            cadastrarhospedeQuery = conect.createQuery("DELETE FROM Cadastrarhospede c WHERE c.codigo=" + CodigoCliTextField3.getText());
            cadastrarhospedeQuery.executeUpdate();
        }
    }//GEN-LAST:event_excluirClienteButton3ActionPerformed

    private void excluirFunButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirFunButtonActionPerformed

        if (CodigoFunTextField.getText().isEmpty()) {
            util.Mensagem("Codigo do funcionario");
            return;
        }
        loginfuncionarioQuery = conect.createQuery("SELECT l FROM Loginfuncionario l WHERE l.codigo=" + CodigoFunTextField.getText());
        loginfuncionarioList = loginfuncionarioQuery.getResultList();
        if (loginfuncionarioList.isEmpty()) {
            util.Mensagem("Funcionario nao cadastrado");
            return;
        }
        if (util.Pergunta("Deseja realmente Excluir este Funcionario(a)?", "EXCLUIR") == 0) {
            loginfuncionarioQuery = conect.createQuery("DELETE FROM Loginfuncionario l WHERE l.codigo=" + CodigoFunTextField.getText());
            loginfuncionarioQuery.executeUpdate();
        }
        NomeFunTextField.setText("");
        CEPFunTextField.setText("");
        FuncaoFunTextField.setText("");
        CEPFunTextField.setText("");
        PaisFunTextField.setText("");
        EnderecoFunTextField.setText("");
        NFunTextField.setText("");
        BairroFunTextField.setText("");
        CidadeFunTextField.setText("");
        EstadoFunTextField.setText("");
        LoginFunTextField.setText("");
        SenhaFunTextField.setText("");
        ConfirmaSenhaFunTextField.setText("");
        AdmSimRadioButton.setSelected(false);
        AdmNaoRadioButton.setSelected(true);
        CadastraCliCheckBox.setSelected(false);
        CadastraFunCheckBox.setSelected(false);
        CadastraPrdCheckBox.setSelected(false);
        CadastraQuartoCheckBox.setSelected(false);
        HospedagemCheckBox.setSelected(false);
    }//GEN-LAST:event_excluirFunButtonActionPerformed

    private void CodigoCliTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodigoCliTextField3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (CodigoCliTextField3.getText().isEmpty()) {
                PesquisaCliente pc = new PesquisaCliente();
                pc.tipo = "cadcli";
                pc.show();
            } else {
                cadastrarhospedeQuery = conect.createQuery("SELECT c FROM Cadastrarhospede c WHERE c.codigo=" + CodigoCliTextField3.getText());
                cadastrarhospedeList = cadastrarhospedeQuery.getResultList();
                for (Cadastrarhospede cadhos : cadastrarhospedeList) {
                    NomeCliTextField.setText(cadhos.getNome());
                    CPFCNPJCliTextField.setText(cadhos.getCnpj());
                    profissaoCliTextField.setText(cadhos.getProfissao());
                    EstadoCivilCliTextField.setText(cadhos.getEstadoCivil());
                    CEPCliTextField.setText(cadhos.getCep());
                    PaisCliTextField.setText(cadhos.getPais());
                    EnderecoCliTextField.setText(cadhos.getEndereco());
                    NCliTextField.setText(cadhos.getNumend());
                    BairroCliTextField.setText(cadhos.getBairro());
                    CidadeCliTextField.setText(cadhos.getCidade());
                    EstadoCliTextField.setText(cadhos.getEstado());
                    SenhaCliTextField.setText(cadhos.getSenha());
                    ConfirmaSenhaCliTextField.setText(cadhos.getSenha());
                    E_mailCliTextField.setText(cadhos.getEmail());
                }
            }
        }

    }//GEN-LAST:event_CodigoCliTextField3KeyPressed

    private void quartoRegistrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quartoRegistrarButtonActionPerformed
        boolean quaexis;
        if (quartoNumeroTextField.getText().isEmpty()) {
            util.Mensagem("Numero do quarto e obrigratorio");
            return;
        }
        if (CamasQuartoTextField.getValue().equals("0")) {
            util.Mensagem("Numero de camas obrigratorio");
            return;
        }
        quartosQuery = conect.createQuery("SELECT q FROM Quartos q WHERE q.numQuarto=" + NuQuartoTextField.getText());
        quartosList = quartosQuery.getResultList();

        if (quartosList.isEmpty()) {
            quaexis = false;
        } else {
            quaexis = true;
        }

        conect.getTransaction().begin();
        Quartos qua = new Quartos();
        qua.setAndar(String.valueOf(AndarQuartoTextField.getValue()));
        qua.setCamas(String.valueOf(CamasQuartoTextField.getValue()));
        qua.setConforto1(Conforto1TextField.getText());
        qua.setConforto2(Conforto2TextField.getText());
        qua.setConforto3(Conforto3TextField.getText());
        qua.setNumQuarto(quartoNumeroTextField.getText());
        qua.setTipo(quartoTipoTextField.getText());
        qua.setValor(util.formatarNumero(ValorTextField.getText().toString()));
        if (quaexis) {
            conect.merge(qua);
        } else {
            conect.persist(qua);
        }
        conect.getTransaction().commit();
        AndarQuartoTextField.setValue(0);
        CamasQuartoTextField.setValue(0);
        Conforto1TextField.setText("");
        Conforto2TextField.setText("");
        Conforto3TextField.setText("");
        quartoNumeroTextField.setText("");
        quartoTipoTextField.setText("");
        ValorTextField.setText("");
    }//GEN-LAST:event_quartoRegistrarButtonActionPerformed

    private void ExcluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirButtonActionPerformed

        if (quartoNumeroTextField.getText().isEmpty()) {
            util.Mensagem("Digita o numero do quarto");
            return;
        }
        quartosQuery = conect.createQuery("SELECT q FROM Quartos q WHERE q.numQuarto='" + quartoNumeroTextField.getText() + "'");
        quartosList = quartosQuery.getResultList();
        if (quartosList.isEmpty()) {
            util.Mensagem("Quarto nao cadastrado");
            return;
        }
        if (util.Pergunta("Deseja realmente Excluir este Quarto?", "EXCLUIR") == 0) {
            quartosQuery = conect.createQuery("DELETE FROM Quartos q WHERE Q.numQuarto='" + quartoNumeroTextField.getText() + "'");
            quartosQuery.executeUpdate();
        }
        AndarQuartoTextField.setValue(0);
        CamasQuartoTextField.setValue(0);
        Conforto1TextField.setText("");
        Conforto2TextField.setText("");
        Conforto3TextField.setText("");
        quartoNumeroTextField.setText("");
        quartoTipoTextField.setText("");
        ValorTextField.setText("");
    }//GEN-LAST:event_ExcluirButtonActionPerformed

    private void salvarProdutoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarProdutoButtonActionPerformed

        String opcoes = "";
        if (CodPrdTextField.getText().isEmpty()) {
            util.Mensagem("Codigo obrigratorio");
            return;
        }
        if (NomPrdTextField.getText().isEmpty()) {
            util.Mensagem("Nome é obrigratorio");
            return;
        }
        if (ValorVendaTextField.getText().isEmpty()) {
            util.Mensagem("Valor de Venda E obrigatorio");
            return;
        }
        cadastroprodutoQuery = conect.createQuery("SELECT p FROM Cadastroproduto p WHERE p.codigo=" + CodPrdTextField.getText());
        cadastroprodutoList = cadastroprodutoQuery.getResultList();
        boolean prdexis;
        if (cadastroprodutoList.isEmpty()) {
            prdexis = false;
        } else {
            prdexis = true;
        }
        if (RdB_Bebida.isSelected()) {
            if (calcool.isSelected()) {
                opcoes += "1";
            }
            if (salcool.isSelected()) {
                opcoes += "2";
            }
            if (cgas.isSelected()) {
                opcoes += "3";
            }
            if (sgas.isSelected()) {
                opcoes += "4";
            }
            if (refri.isSelected()) {
                opcoes += "6";
            }
            if (suco.isSelected()) {
                opcoes += "7";
            }

        } else {
            if (torta.isSelected()) {
                opcoes += "1";
            }
            if (bolo.isSelected()) {
                opcoes += "2";
            }
            if (doce.isSelected()) {
                opcoes += "3";
            }
            if (frito.isSelected()) {
                opcoes += "4";
            }
            if (assado.isSelected()) {
                opcoes += "6";
            }
        }
        conect.getTransaction().begin();
        Cadastroproduto prd = new Cadastroproduto();
        prd.setCodigo(Integer.parseInt(CodPrdTextField.getText()));
        prd.setNome(NomPrdTextField.getText());
       /* if (RdB_Bebida.isSelected()) {
            prd.setTipo("B");
        }
        if (RdB_Comida.isSelected()) {
            prd.setTipo("C");
        }
        prd.setGrupo(opcoes);
        prd.setPreco(util.formatarNumero(ValorVendaTextField.getText()));
        prd.setQuantidade(Double.parseDouble(EstPrdTextField.getText()));
        prd.setObservacao(OBSText.getText());
*/
        if (prdexis) {
            conect.merge(prd);
        } else {
            conect.persist(prd);
        }

        conect.getTransaction().commit();
        CodPrdTextField.setText("");
        NomPrdTextField.setText("");
        TipoPrdbuttonGroup.clearSelection();

        torta.setSelected(false);
        doce.setSelected(false);
        frito.setSelected(false);
        salcool.setSelected(false);
        sgas.setSelected(false);
        calcool.setSelected(false);
        cgas.setSelected(false);
        bolo.setSelected(false);
        assado.setSelected(false);
        refri.setSelected(false);
        suco.setSelected(false);
        torta.setSelected(false);
        doce.setSelected(false);
        frito.setSelected(false);
        salcool.setSelected(false);
        sgas.setSelected(false);
        calcool.setSelected(false);
        cgas.setSelected(false);
        bolo.setSelected(false);
        assado.setSelected(false);
        refri.setSelected(false);
        suco.setSelected(false);


    }//GEN-LAST:event_salvarProdutoButtonActionPerformed

    private void RdB_BebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdB_BebidaActionPerformed

        jPanelBebida.setVisible(true);
        jPanelComida.setVisible(false);

        torta.setSelected(false);
        doce.setSelected(false);
        frito.setSelected(false);
        salcool.setSelected(false);
        sgas.setSelected(false);
        calcool.setSelected(false);
        cgas.setSelected(false);
        bolo.setSelected(false);
        assado.setSelected(false);
        refri.setSelected(false);
        suco.setSelected(false);
    }//GEN-LAST:event_RdB_BebidaActionPerformed

    private void RdB_ComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdB_ComidaActionPerformed

        jPanelComida.setVisible(true);
        jPanelBebida.setVisible(false);

        torta.setSelected(false);
        doce.setSelected(false);
        frito.setSelected(false);
        salcool.setSelected(false);
        sgas.setSelected(false);
        calcool.setSelected(false);
        cgas.setSelected(false);
        bolo.setSelected(false);
        assado.setSelected(false);
        refri.setSelected(false);
        suco.setSelected(false);
    }//GEN-LAST:event_RdB_ComidaActionPerformed

    private void hosSalvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hosSalvarButtonActionPerformed

        String pacotes = "";

        if (CodCliHospTextField.getText().isEmpty()) {
            util.Mensagem("Codigo do cliente Obrigatorio");
            return;
        }
        if (NuQuartoTextField.getText().isEmpty()) {
            util.Mensagem("Numero do quarto e obrigatorio");
            return;
        }
        if (DataSaidaTextField.getText().isEmpty() || dataEntradaTextField.getText().isEmpty()) {
            util.Mensagem("Dada de entrada e Data de entrada e obrigatorio");
            return;
        }
        hospedagemQuery = conect.createQuery("SELECT h FROM Hospedagem h WHERE (h.diaChegada>='" + util.formatadata(dataEntradaTextField.getText()) + "' and h.diaChegada<='"
                + util.formatadata(DataSaidaTextField.getText()) + "') or (h.diaSaida>='" + util.formatadata(dataEntradaTextField.getText())
                + "' and h.diaSaida<='" + util.formatadata(DataSaidaTextField.getText()) + "') and h.codQuarto='" + NuQuartoTextField.getText().toString() + "'");
        hospedagemList = hospedagemQuery.getResultList();
        if (!hospedagemList.isEmpty()) {
            util.Mensagem("Quarto já esta ocupado para esta data");
            return;
        }

        hospedagemQuery = conect.createQuery("SELECT h FROM Hospedagem h WHERE h.codigo=" + CodHosTextField.getText());
        hospedagemList = hospedagemQuery.getResultList();
        boolean hospeexis;
        if (hospedagemList.isEmpty()) {
            hospeexis = false;
        } else {
            hospeexis = true;
        }
        conect.getTransaction().begin();
        Hospedagem hos = new Hospedagem();

        hos.setCodigo(Integer.parseInt(CodHosTextField.getText().toString()));
        hos.setHospede(Integer.parseInt(CodCliHospTextField.getText()));
        hos.setCodQuarto(NuQuartoTextField.getText().toString());
        hos.setDiaChegada(Date.valueOf(util.formatadata(dataEntradaTextField.getText())));
        hos.setDiaSaida(Date.valueOf(util.formatadata(DataSaidaTextField.getText())));
        if (SolNorRadioButton.isSelected()) {
            pacotes = "SolNor";
        }
        if (SolAltRadioButton.isSelected()) {
            pacotes = "SolAlt";
        }
        if (SolFimRadioButton.isSelected()) {
            pacotes = "SolFim";
        }
        if (CasNorRadioButton1.isSelected()) {
            pacotes = "CasNor";
        }
        if (CasAltRadioButton.isSelected()) {
            pacotes = "CasAlt";
        }
        if (CasFimRadioButton.isSelected()) {
            pacotes = "CasFim";
        }
        hos.setPacote(pacotes);
        if (InfantilCheckBox.isSelected()) {
            hos.setAcesinfa("S");
        } else {
            hos.setAcesinfa("N");
        }
        if (FumanteCheckBox.isSelected()) {
            hos.setAcesfuma("S");
        } else {
            hos.setAcesfuma("N");
        }
        if (CafeRadioButton.isSelected()) {
            hos.setAlimentacao(1);
        }
        if (AlmocoRadioButton.isSelected()) {
            hos.setAlimentacao(2);
        }
        if (JantarRadioButton.isSelected()) {
            hos.setAlimentacao(3);
        }
        if (hospeexis) {
            conect.merge(hos);
        } else {
            conect.persist(hos);
        }
        conect.getTransaction().commit();

        CodHosTextField.setText("");
        CodCliHospTextField.setText("");
        NuQuartoTextField.setText("");
        dataEntradaTextField.setText("");
        DataSaidaTextField.setText("");
        SolNorRadioButton.setSelected(true);
        InfantilCheckBox.setSelected(false);
        FumanteCheckBox.setSelected(false);
        CodHosTextField.requestFocus();
        NomCliHosTextField.setText("");
        TipoTextField.setText("");
        AndarTextField.setText("");
    }//GEN-LAST:event_hosSalvarButtonActionPerformed

    private void CodCliHospTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodCliHospTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (CodCliHospTextField.getText().isEmpty()) {
                PesquisaCliente pc = new PesquisaCliente();
                pc.tipo = "cadcli";
                pc.show();
            } else {
                cadastrarhospedeQuery = conect.createQuery("SELECT c FROM Cadastrarhospede c WHERE c.codigo=" + CodCliHospTextField.getText());
                cadastrarhospedeList = cadastrarhospedeQuery.getResultList();
                if (cadastrarhospedeList.isEmpty()) {
                    util.Mensagem("Cliente na cadastrado");
                    CodCliHospTextField.requestFocus();
                }
                for (Cadastrarhospede cadhos : cadastrarhospedeList) {
                    NomCliHosTextField.setText(cadhos.getNome());
                }
            }
        }
    }//GEN-LAST:event_CodCliHospTextFieldKeyPressed

    private void NuQuartoTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NuQuartoTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (NuQuartoTextField.getText().isEmpty()) {
                util.Mensagem("Digite o numero do quarto");
            } else {
                quartosQuery = conect.createQuery("SELECT q FROM Quartos q WHERE q.numQuarto=" + NuQuartoTextField.getText());
                quartosList = quartosQuery.getResultList();
                if (quartosList.isEmpty()) {
                    util.Mensagem("Quarto nao cadastrado");
                } else {
                    for (Quartos qua : quartosList) {
                        AndarTextField.setText(qua.getAndar());
                        TipoTextField.setText(qua.getTipo());
                    }
                }

            }
        }
    }//GEN-LAST:event_NuQuartoTextFieldKeyPressed

    private void CodPrdTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodPrdTextFieldKeyPressed
        try {

            String opc;
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                if (CodPrdTextField.getText().isEmpty()) {
                    PesquisaProduto pc = new PesquisaProduto();
                    pc.show();
                } else {
                    NomPrdTextField.setText("");
                    TipoPrdbuttonGroup.clearSelection();

                    torta.setSelected(false);
                    doce.setSelected(false);
                    frito.setSelected(false);
                    salcool.setSelected(false);
                    sgas.setSelected(false);
                    calcool.setSelected(false);
                    cgas.setSelected(false);
                    bolo.setSelected(false);
                    assado.setSelected(false);
                    refri.setSelected(false);
                    suco.setSelected(false);
                    torta.setSelected(false);
                    doce.setSelected(false);
                    frito.setSelected(false);
                    salcool.setSelected(false);
                    sgas.setSelected(false);
                    calcool.setSelected(false);
                    cgas.setSelected(false);
                    bolo.setSelected(false);
                    assado.setSelected(false);
                    refri.setSelected(false);
                    suco.setSelected(false);

                    cadastroprodutoQuery = conect.createQuery("SELECT c FROM Cadastroproduto c WHERE c.codigo=" + CodPrdTextField.getText());
                    cadastroprodutoList = cadastroprodutoQuery.getResultList();
                    for (Cadastroproduto cadprd : cadastroprodutoList) {
                        NomPrdTextField.setText(cadprd.getNome());
                        ValorVendaTextField.setText(String.valueOf(cadprd.getPreco()));
                        EstPrdTextField.setText(String.valueOf(cadprd.getQuantidade()));
                       /* OBSText.setText(cadprd.getObservacao());
                        if (cadprd.getTipo().equalsIgnoreCase("B")) {
                            RdB_Bebida.setSelected(true);
                            jPanelComida.setVisible(false);
                            opc = cadprd.getGrupo();
                            int qtd = opc.length(), i = 0;
                            while (qtd > 0) {
                                int e = i + 1;
                                opc = opc.substring(i, e);
                                if (opc.equals("1")) {
                                    calcool.setSelected(true);
                                }
                                if (opc.equals("2")) {
                                    salcool.setSelected(true);
                                }
                                if (opc.equals("3")) {
                                    cgas.setSelected(true);
                                }
                                if (opc.equals("4")) {
                                    sgas.setSelected(true);
                                }
                                if (opc.equals("5")) {
                                    refri.setSelected(true);
                                }
                                if (opc.equals("6")) {
                                    suco.setSelected(true);
                                }
                                qtd--;
                                i++;
                            }
                        } else {
                            RdB_Comida.setSelected(true);
                            jPanelBebida.setVisible(false);
                            opc = cadprd.getGrupo();
                            int qtd = opc.length(), i = 0;
                            while (qtd > 0) {
                                int e = i + 1;
                                opc = opc.substring(i, e);
                                if (opc.equals("1")) {
                                    torta.setSelected(true);
                                }
                                if (opc.equals("2")) {
                                    bolo.setSelected(true);
                                }
                                if (opc.equals("3")) {
                                    doce.setSelected(true);
                                }
                                if (opc.equals("4")) {
                                    frito.setSelected(true);
                                }
                                if (opc.equals("5")) {
                                    assado.setSelected(true);
                                }
                                qtd--;
                                i++;
                            }
                        }*/
                    }
                }
            }
        } catch (Exception e) {
            util.Mensagem("Erro: " + e);
        }
    }//GEN-LAST:event_CodPrdTextFieldKeyPressed

    private void CodHosTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodHosTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            CodCliHospTextField.setText("");
            NuQuartoTextField.setText("");
            dataEntradaTextField.setText("");
            DataSaidaTextField.setText("");
            SolNorRadioButton.setSelected(true);
            InfantilCheckBox.setSelected(false);
            FumanteCheckBox.setSelected(false);
            CodHosTextField.requestFocus();
            NomCliHosTextField.setText("");
            TipoTextField.setText("");
            AndarTextField.setText("");
            hospedagemQuery = conect.createQuery("SELECT h FROM Hospedagem h WHERE h.codigo=" + CodHosTextField.getText());
            hospedagemList = hospedagemQuery.getResultList();
            for (Hospedagem hos : hospedagemList) {
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                CodCliHospTextField.setText(String.valueOf(hos.getHospede()));
                dataEntradaTextField.setText(String.valueOf(formato.format(hos.getDiaChegada())));
                DataSaidaTextField.setText(String.valueOf(formato.format(hos.getDiaSaida())));
                NuQuartoTextField.setText(String.valueOf(hos.getCodQuarto()));
                if (hos.getPacote().equalsIgnoreCase("SolNor")) {
                    SolNorRadioButton.setSelected(true);
                }
                if (hos.getPacote().equalsIgnoreCase("SolFim")) {
                    SolFimRadioButton.setSelected(true);
                }

                if (hos.getPacote().equalsIgnoreCase("SolNor")) {
                    SolNorRadioButton.setSelected(true);
                }
                if (hos.getPacote().equalsIgnoreCase("CasNor")) {
                    CasNorRadioButton1.setSelected(true);
                }
                if (hos.getPacote().equalsIgnoreCase("Casfim")) {
                    CasFimRadioButton.setSelected(true);
                }
                if (hos.getPacote().equalsIgnoreCase("Casalt")) {
                    CasAltRadioButton.setSelected(true);
                }
                switch (hos.getAlimentacao()) {
                    case 1:
                        CafeRadioButton.setSelected(true);
                        break;
                    case 2:
                        AlmocoRadioButton.setSelected(true);
                        break;
                    case 3:
                        JantarRadioButton.setSelected(true);
                        break;
                }

                if (hos.getAcesinfa().equalsIgnoreCase("s")) {
                    FumanteCheckBox.setSelected(true);
                } else {
                    FumanteCheckBox.setSelected(false);
                }
                if (hos.getAcesinfa().equalsIgnoreCase("s")) {
                    InfantilCheckBox.setSelected(true);
                } else {
                    InfantilCheckBox.setSelected(false);
                }
                CodCliHospTextField.requestFocus();
                CodCliHospTextFieldKeyPressed(evt);
                NuQuartoTextFieldKeyPressed(evt);
            }

        }
    }//GEN-LAST:event_CodHosTextFieldKeyPressed

    private void pacotesCadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacotesCadastrarButtonActionPerformed
        conect.getTransaction().begin();
        Pacotes pac = new Pacotes();

   /**     pac.setCasalt(util.formatarNumero(CasAltTemTextField.getText()));
        pac.setCasfim(util.formatarNumero(CasFinSemTextField.getText()));
        pac.setCasnor(util.formatarNumero(CasNormTextField.getText()));
        pac.setSolalt(util.formatarNumero(SoltAltaTemTextField.getText()));
        pac.setSolfim(util.formatarNumero(SolFinSemTextField.getText()));
        pac.setSolnor(util.formatarNumero(SolNormTextField.getText()));
**/
        conect.merge(pac);
        conect.getTransaction().commit();

    }//GEN-LAST:event_pacotesCadastrarButtonActionPerformed

    private void RelClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelClienteButtonActionPerformed

        try {
            cadastrarhospedeQuery = conect.createQuery("SELECT h FROM Cadastrarhospede h");
            cadastrarhospedeList = cadastrarhospedeQuery.getResultList();
            JasperReport report = (JasperReport) JRLoader.loadObject("Jasper/Cliente.jasper");
            JRBeanCollectionDataSource jr = new JRBeanCollectionDataSource(cadastrarhospedeList, false);
            JasperPrint print = JasperFillManager.fillReport(report, null, jr);
            JasperViewer visualizar = new JasperViewer(print, false);
            visualizar.setTitle("Relatorios das Series");
            visualizar.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            visualizar.setVisible(true);
        } catch (Exception e) {
            util.Mensagem("erro: " + e);
        }


    }//GEN-LAST:event_RelClienteButtonActionPerformed

    private void HosExcluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HosExcluirButtonActionPerformed
        if (util.Pergunta("Deseja realmente excluir", "Excluir") == 0) {
            conect.getTransaction().begin();
            hospedagemQuery = conect.createQuery("DELETE FROM Hospedagem h WHERE h.codigo=" + CodHosTextField.getText());
            hospedagemQuery.executeUpdate();
            conect.getTransaction().commit();
        }
        CodHosTextField.setText("");
        CodCliHospTextField.setText("");
        NuQuartoTextField.setText("");
        dataEntradaTextField.setText("");
        DataSaidaTextField.setText("");
        SolNorRadioButton.setSelected(true);
        InfantilCheckBox.setSelected(false);
        FumanteCheckBox.setSelected(false);
        CodHosTextField.requestFocus();
        NomCliHosTextField.setText("");
        TipoTextField.setText("");
        AndarTextField.setText("");
    }//GEN-LAST:event_HosExcluirButtonActionPerformed

    private void RdB_ComidaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RdB_ComidaFocusGained

        jPanelComida.setVisible(true);      

        torta.setSelected(false);
        doce.setSelected(false);
        frito.setSelected(false);
        salcool.setSelected(false);
        sgas.setSelected(false);
        calcool.setSelected(false);
        cgas.setSelected(false);
        bolo.setSelected(false);
        assado.setSelected(false);
        refri.setSelected(false);
        suco.setSelected(false);
    }//GEN-LAST:event_RdB_ComidaFocusGained

    private void RdB_BebidaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RdB_BebidaFocusGained

        jPanelBebida.setVisible(true);
        jPanelComida.setVisible(false);
        torta.setSelected(false);
        doce.setSelected(false);
        frito.setSelected(false);
        salcool.setSelected(false);
        sgas.setSelected(false);
        calcool.setSelected(false);
        cgas.setSelected(false);
        bolo.setSelected(false);
        assado.setSelected(false);
        refri.setSelected(false);
        suco.setSelected(false);
    }//GEN-LAST:event_RdB_BebidaFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        logar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RelProdutoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelProdutoButtonActionPerformed
        try {
            cadastroprodutoQuery = conect.createQuery("SELECT p FROM Cadastroproduto p");
            cadastroprodutoList = cadastroprodutoQuery.getResultList();
            JasperReport report = (JasperReport) JRLoader.loadObject("Jasper/Produto.jasper");
            JRBeanCollectionDataSource jr = new JRBeanCollectionDataSource(cadastrarhospedeList, false);
            JasperPrint print = JasperFillManager.fillReport(report, null, jr);
            JasperViewer visualizar = new JasperViewer(print, false);
            visualizar.setTitle("Relatorios das Series");
            visualizar.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            visualizar.setVisible(true);
        } catch (Exception e) {
            util.Mensagem("erro: " + e);
        }
    }//GEN-LAST:event_RelProdutoButtonActionPerformed

    private void QpcoesSalvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QpcoesSalvarButtonActionPerformed
        conect.getTransaction().begin();

        try {
         /*   Opcoes opcoes;

            if (opcoesId == 0) {
                opcoes = new Opcoes();
            } else {
                opcoes = conect.find(Opcoes.class, opcoesId);
            }

            opcoes.setCafeManha(Double.parseDouble(AlimenteCafeTextField.getText()));
            opcoes.setCafeAlmoco(Double.parseDouble(AlimenteAlmocoTextField.getText()));
            opcoes.setTodosJantar(Double.parseDouble(AlimenteTodosTextField.getText()));
            opcoes.setAreaFumante(Double.parseDouble(AcessibiFumanteTextField.getText()));
            opcoes.setInfantil(Double.parseDouble(AcessibiInfatilTextField.getText()));

            if (opcoesId == 0) {
                conect.persist(opcoes);
            } else {
                conect.merge(opcoes);
            }
*/
            conect.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!", "Salvar", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
           conect.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_QpcoesSalvarButtonActionPerformed

    private void CodigoCliTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoCliTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoCliTextField3ActionPerformed

    public void Invisivel() {
        CadastoCliente.setVisible(false);
        CadastroProdutos.setVisible(false);
        CadastroPacostes.setVisible(false);
        CadastroFuncionarios.setVisible(false);
        CadastroQuarto.setVisible(false);
        Opcoes.setVisible(false);
        Hospedagem.setVisible(false);
    }

    public void abrirJanela(JInternalFrame tela) {
        try {
            Invisivel();
            tela.setVisible(true);
            tela.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Iniciar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void logar() {
        Invisivel();
        abrirJanela(Logar);
        ClienteButton.setVisible(false);
        RelClienteButton.setVisible(false);
        CadFuncioButton.setVisible(false);
        ProdutosButton.setVisible(false);
        RelProdutoButton.setVisible(false);
        PacotesButton.setVisible(false);
        QuartosButton.setVisible(false);
        OpcionaiButton.setVisible(false);
        HospedagemButton.setVisible(false);
    }

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
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Iniciar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AcessibiFumanteTextField;
    private javax.swing.JTextField AcessibiInfatilTextField;
    private javax.swing.JRadioButton AdmNaoRadioButton;
    private javax.swing.JRadioButton AdmSimRadioButton;
    private javax.swing.ButtonGroup AdministradorbuttonGroup;
    private javax.swing.ButtonGroup AlimentacaobuttonGroup;
    private javax.swing.JTextField AlimenteAlmocoTextField;
    private javax.swing.JTextField AlimenteCafeTextField;
    private javax.swing.JTextField AlimenteTodosTextField;
    private javax.swing.JRadioButton AlmocoRadioButton;
    private javax.swing.JSpinner AndarQuartoTextField;
    private javax.swing.JTextField AndarTextField;
    private javax.swing.JTextField BairroCliTextField;
    private javax.swing.JTextField BairroFunTextField;
    private javax.swing.JTextField CEPCliTextField;
    private javax.swing.JTextField CEPFunTextField;
    private javax.swing.JTextField CPFCNPJCliTextField;
    private javax.swing.JTextField CPFFunTextField;
    private javax.swing.JButton CadFuncioButton;
    private javax.swing.JInternalFrame CadastoCliente;
    private javax.swing.JCheckBox CadastraCliCheckBox;
    private javax.swing.JCheckBox CadastraFunCheckBox;
    private javax.swing.JCheckBox CadastraPrdCheckBox;
    private javax.swing.JCheckBox CadastraQuartoCheckBox;
    private javax.swing.JInternalFrame CadastroFuncionarios;
    private javax.swing.JInternalFrame CadastroPacostes;
    private javax.swing.JPanel CadastroProduto;
    private javax.swing.JInternalFrame CadastroProdutos;
    private javax.swing.JInternalFrame CadastroQuarto;
    private javax.swing.JRadioButton CafeRadioButton;
    private javax.swing.JSpinner CamasQuartoTextField;
    private javax.swing.JRadioButton CasAltRadioButton;
    private javax.swing.JTextField CasAltTemTextField;
    private javax.swing.JRadioButton CasFimRadioButton;
    private javax.swing.JTextField CasFinSemTextField;
    private javax.swing.JRadioButton CasNorRadioButton1;
    private javax.swing.JTextField CasNormTextField;
    private javax.swing.JTextField CidadeCliTextField;
    private javax.swing.JTextField CidadeFunTextField;
    private javax.swing.JButton ClienteButton;
    private javax.swing.JPanel ClienteMenu;
    private javax.swing.JTextField CodCliHospTextField;
    private javax.swing.JTextField CodHosTextField;
    private javax.swing.JTextField CodPrdTextField;
    private javax.swing.JTextField CodigoCliTextField3;
    private javax.swing.JTextField CodigoFunTextField;
    private javax.swing.JPasswordField ConfirmaSenhaCliTextField;
    private javax.swing.JTextField ConfirmaSenhaFunTextField;
    private javax.swing.JTextField Conforto1TextField;
    private javax.swing.JTextField Conforto2TextField;
    private javax.swing.JTextField Conforto3TextField;
    private javax.swing.JFormattedTextField DataSaidaTextField;
    private javax.swing.JTextField E_mailCliTextField;
    private javax.swing.JPanel EnderecoCli;
    private javax.swing.JTextField EnderecoCliTextField;
    private javax.swing.JPanel EnderecoFun;
    private javax.swing.JTextField EnderecoFunTextField;
    private javax.swing.JTextField EstPrdTextField;
    private javax.swing.JTextField EstadoCivilCliTextField;
    private javax.swing.JTextField EstadoCliTextField;
    private javax.swing.JTextField EstadoFunTextField;
    private javax.swing.JButton ExcluirButton;
    private javax.swing.JButton FecharCliButton;
    private javax.swing.JButton FecharFunButton;
    private javax.swing.JButton FecharPrdButton;
    private javax.swing.JCheckBox FumanteCheckBox;
    private javax.swing.JTextField FuncaoFunTextField;
    private javax.swing.JPanel HomeMenu;
    private javax.swing.JButton HosCancelarButton;
    private javax.swing.JButton HosExcluirButton;
    private javax.swing.JInternalFrame Hospedagem;
    private javax.swing.JButton HospedagemButton;
    private javax.swing.JCheckBox HospedagemCheckBox;
    private javax.swing.JPanel HospedagenMenu;
    private javax.swing.JPanel InfPrdPanel;
    private javax.swing.JCheckBox InfantilCheckBox;
    private javax.swing.JPanel InfoCli3;
    private javax.swing.JPanel InfoFun;
    private javax.swing.JPanel InfoPrdPanel;
    private javax.swing.JRadioButton JantarRadioButton;
    private javax.swing.JInternalFrame Logar;
    private javax.swing.JButton LogarButton;
    private javax.swing.JPanel Login;
    private javax.swing.JTextField LoginFunTextField;
    private javax.swing.JTextField NCliTextField;
    private javax.swing.JTextField NFunTextField;
    private javax.swing.JTextField NomCliHosTextField;
    private javax.swing.JTextField NomPrdTextField;
    private javax.swing.JTextField NomeCliTextField;
    private javax.swing.JTextField NomeFunTextField;
    private javax.swing.JTextField NuQuartoTextField;
    private javax.swing.JTextPane OBSText;
    private javax.swing.JButton OpcionaiButton;
    private javax.swing.JInternalFrame Opcoes;
    private javax.swing.JButton OpcoesCancelarButton;
    private javax.swing.ButtonGroup PacotebuttonGroup;
    private javax.swing.JButton PacotesButton;
    private javax.swing.JTextField PaisCliTextField;
    private javax.swing.JTextField PaisFunTextField;
    private javax.swing.JPanel PanelCadastroCliente;
    private javax.swing.JPanel PanelCadastroFuncionario;
    private javax.swing.JPanel PanelHospedagem;
    private javax.swing.JPanel PanelOpcionais;
    private javax.swing.JPanel PanelPacotes;
    private javax.swing.JPanel PanelQuartos;
    private javax.swing.JPanel Permicoes;
    private javax.swing.JButton PrincipalButton;
    private javax.swing.JPanel ProdutoMenu;
    private javax.swing.JButton ProdutosButton;
    private javax.swing.JButton QpcoesSalvarButton;
    private javax.swing.JButton QuartosButton;
    private javax.swing.JRadioButton RdB_Bebida;
    private javax.swing.JRadioButton RdB_Comida;
    private javax.swing.JButton RelClienteButton;
    private javax.swing.JButton RelProdutoButton;
    private javax.swing.JButton SairButton;
    private javax.swing.JPanel SenhaCli;
    private javax.swing.JPasswordField SenhaCliTextField;
    private javax.swing.JTextField SenhaFunTextField;
    private javax.swing.JPasswordField SenhaTextField;
    private javax.swing.JRadioButton SolAltRadioButton;
    private javax.swing.JRadioButton SolFimRadioButton;
    private javax.swing.JTextField SolFinSemTextField;
    private javax.swing.JRadioButton SolNorRadioButton;
    private javax.swing.JTextField SolNormTextField;
    private javax.swing.JTextField SoltAltaTemTextField;
    private javax.swing.JTabbedPane TabbedPaneMenu;
    private javax.swing.ButtonGroup TipoPrdbuttonGroup;
    private javax.swing.JTextField TipoTextField;
    private javax.swing.JTextField UsuarioTextField;
    private javax.swing.JFormattedTextField ValorTextField;
    private javax.swing.JTextField ValorVendaTextField;
    private javax.swing.JCheckBox assado;
    private javax.swing.JCheckBox bolo;
    private java.util.List<Codigo.Cadastrarhospede> cadastrarhospedeList;
    private javax.persistence.Query cadastrarhospedeQuery;
    private java.util.List<Codigo.Cadastroproduto> cadastroprodutoList;
    private javax.persistence.Query cadastroprodutoQuery;
    private javax.swing.JCheckBox calcool;
    private javax.swing.JCheckBox cgas;
    private javax.persistence.EntityManager conect;
    private javax.swing.JFormattedTextField dataEntradaTextField;
    private javax.swing.JCheckBox doce;
    private javax.swing.JButton excluirClienteButton3;
    private javax.swing.JButton excluirFunButton;
    private javax.swing.JButton excluirProdutoButton;
    private java.util.List<Codigo.Formapagamento> formapagamentoList;
    private javax.persistence.Query formapagamentoQuery;
    private javax.swing.JCheckBox frito;
    private javax.swing.JButton hosSalvarButton;
    private java.util.List<Codigo.Hospedagem> hospedagemList;
    private javax.persistence.Query hospedagemQuery;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelBebida;
    private javax.swing.JPanel jPanelComida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JButton limparClienteButton3;
    private javax.swing.JButton limparFunButton;
    private java.util.List<Codigo.Loginfuncionario> loginfuncionarioList;
    private javax.persistence.Query loginfuncionarioQuery;
    private javax.swing.JButton pacotesCadastrarButton;
    private javax.swing.JButton pacotesCancelarButton;
    private java.util.List<Codigo.Pacotes> pacotesList;
    private javax.persistence.Query pacotesQuery;
    private javax.swing.JTextField profissaoCliTextField;
    private javax.swing.JButton quartoCancelarjButton5;
    private javax.swing.JTextField quartoNumeroTextField;
    private javax.swing.JButton quartoRegistrarButton;
    private javax.swing.JTextField quartoTipoTextField;
    private java.util.List<Codigo.Quartos> quartosList;
    private javax.persistence.Query quartosQuery;
    private javax.swing.JCheckBox refri;
    private javax.swing.JCheckBox salcool;
    private javax.swing.JButton salvarClienteButton3;
    private javax.swing.JButton salvarFunButton;
    private javax.swing.JButton salvarProdutoButton;
    private javax.swing.JCheckBox sgas;
    private javax.swing.JCheckBox suco;
    private javax.swing.JCheckBox torta;
    // End of variables declaration//GEN-END:variables

}
