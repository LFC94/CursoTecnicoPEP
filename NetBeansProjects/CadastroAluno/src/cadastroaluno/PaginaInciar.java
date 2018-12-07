package cadastroaluno;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class PaginaInciar extends javax.swing.JFrame {

    Aluno aluno1 = new Aluno();
    Aluno aluno2 = new Aluno();
    Aluno aluno3 = new Aluno();
    Aluno aluno4 = new Aluno();
    Aluno aluno5 = new Aluno();
    Aluno aluno6 = new Aluno();
    String telefone, sexo, ddd, quateto1, quateto2;
    double tele;

    public PaginaInciar() {
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

        sexobuttonGroup = new javax.swing.ButtonGroup();
        alunobuttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        aluno1RadioButton = new javax.swing.JRadioButton();
        aluno3RadioButton = new javax.swing.JRadioButton();
        aluno4RadioButton = new javax.swing.JRadioButton();
        aluno6RadioButton = new javax.swing.JRadioButton();
        aluno5RadioButton = new javax.swing.JRadioButton();
        salvarButton = new javax.swing.JButton();
        aluno2RadioButton = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        enderecoTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        telefoneTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        estadoCivilComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        sexoMasculinoRadioButton = new javax.swing.JRadioButton();
        sexofemininoRadioButton = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        dataNascimentoTextField = new javax.swing.JTextField();
        nomeTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Aluno");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Aluno", 0, 0, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N

        aluno1RadioButton.setBackground(new java.awt.Color(255, 255, 255));
        alunobuttonGroup.add(aluno1RadioButton);
        aluno1RadioButton.setText("1");
        aluno1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aluno1RadioButtonActionPerformed(evt);
            }
        });

        aluno3RadioButton.setBackground(new java.awt.Color(255, 255, 255));
        alunobuttonGroup.add(aluno3RadioButton);
        aluno3RadioButton.setText("3");
        aluno3RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aluno3RadioButtonActionPerformed(evt);
            }
        });

        aluno4RadioButton.setBackground(new java.awt.Color(255, 255, 255));
        alunobuttonGroup.add(aluno4RadioButton);
        aluno4RadioButton.setText("4");
        aluno4RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aluno4RadioButtonActionPerformed(evt);
            }
        });

        aluno6RadioButton.setBackground(new java.awt.Color(255, 255, 255));
        alunobuttonGroup.add(aluno6RadioButton);
        aluno6RadioButton.setText("6");
        aluno6RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aluno6RadioButtonActionPerformed(evt);
            }
        });

        aluno5RadioButton.setBackground(new java.awt.Color(255, 255, 255));
        alunobuttonGroup.add(aluno5RadioButton);
        aluno5RadioButton.setText("5");
        aluno5RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aluno5RadioButtonActionPerformed(evt);
            }
        });

        salvarButton.setText("Salvar");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        aluno2RadioButton.setBackground(new java.awt.Color(255, 255, 255));
        alunobuttonGroup.add(aluno2RadioButton);
        aluno2RadioButton.setText("2");
        aluno2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aluno2RadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(aluno1RadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(aluno2RadioButton)
                .addGap(51, 51, 51)
                .addComponent(aluno3RadioButton)
                .addGap(49, 49, 49)
                .addComponent(aluno4RadioButton)
                .addGap(49, 49, 49)
                .addComponent(aluno5RadioButton)
                .addGap(49, 49, 49)
                .addComponent(aluno6RadioButton)
                .addGap(40, 40, 40)
                .addComponent(salvarButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aluno1RadioButton)
                    .addComponent(aluno3RadioButton)
                    .addComponent(aluno4RadioButton)
                    .addComponent(aluno5RadioButton)
                    .addComponent(aluno6RadioButton)
                    .addComponent(salvarButton)
                    .addComponent(aluno2RadioButton))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cadastro"));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Endereço:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Telefone:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Estado civil:");

        estadoCivilComboBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        estadoCivilComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Solteiro", "Casado", "Namorando" }));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Sexo:");

        sexoMasculinoRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        sexobuttonGroup.add(sexoMasculinoRadioButton);
        sexoMasculinoRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        sexoMasculinoRadioButton.setText("Marculino");

        sexofemininoRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        sexobuttonGroup.add(sexofemininoRadioButton);
        sexofemininoRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        sexofemininoRadioButton.setText("Feminino");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Data de Nascimento:");

        nomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataNascimentoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enderecoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(telefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estadoCivilComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sexoMasculinoRadioButton)
                                    .addComponent(sexofemininoRadioButton))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(dataNascimentoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(enderecoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(telefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(estadoCivilComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(sexoMasculinoRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sexofemininoRadioButton)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        try {
            if (nomeTextField.getText().trim().toString().isEmpty() && enderecoTextField.getText().trim().toString().isEmpty()) {
                Mensagem("O nome e o endereço sao nessesario");
            } else {
                if (aluno1RadioButton.isSelected()) {
                    aluno1.setNome(nomeTextField.getText());
                    aluno1.setEndereco(enderecoTextField.getText());
                    aluno1.setSexo(Sexo());
                    aluno1.setEstadoCivil(estadoCivil());
                    aluno1.setTelefone(telefone());
                    aluno1.setDataNascimento(dataNascimentoTextField.getText());
                } else {
                    if (aluno2RadioButton.isSelected()) {
                        aluno2.setNome(nomeTextField.getText());
                        aluno2.setEndereco(enderecoTextField.getText());
                        aluno2.setSexo(Sexo());
                        aluno2.setEstadoCivil(estadoCivil());
                        aluno2.setTelefone(telefone());
                        aluno2.setDataNascimento(dataNascimentoTextField.getText());
                    } else {
                        if (aluno3RadioButton.isSelected()) {
                            aluno3.setNome(nomeTextField.getText());
                            aluno3.setEndereco(enderecoTextField.getText());
                            aluno3.setSexo(Sexo());
                            aluno3.setEstadoCivil(estadoCivil());
                            aluno3.setTelefone(telefone());
                            aluno3.setDataNascimento(dataNascimentoTextField.getText());
                        } else {
                            if (aluno4RadioButton.isSelected()) {
                                aluno4.setNome(nomeTextField.getText());
                                aluno4.setEndereco(enderecoTextField.getText());
                                aluno4.setSexo(Sexo());
                                aluno4.setEstadoCivil(estadoCivil());
                                aluno4.setTelefone(telefone());
                                aluno4.setDataNascimento(dataNascimentoTextField.getText());
                            } else {
                                if (aluno5RadioButton.isSelected()) {
                                    aluno5.setNome(nomeTextField.getText());
                                    aluno5.setEndereco(enderecoTextField.getText());
                                    aluno5.setSexo(Sexo());
                                    aluno5.setEstadoCivil(estadoCivil());
                                    aluno5.setTelefone(telefone());
                                    aluno5.setDataNascimento(dataNascimentoTextField.getText());
                                } else {
                                    if (aluno6RadioButton.isSelected()) {
                                        aluno6.setNome(nomeTextField.getText());
                                        aluno6.setEndereco(enderecoTextField.getText());
                                        aluno6.setSexo(Sexo());
                                        aluno6.setEstadoCivil(estadoCivil());
                                        aluno6.setTelefone(telefone());
                                        aluno6.setDataNascimento(dataNascimentoTextField.getText());
                                    } else {
                                        Mensagem("E nessesario selecionar um aluno");
                                    }
                                }
                            }
                        }
                    }
                }

            }

        } catch (Exception e) {
            Mensagem("Erro " + e);
        }

    }//GEN-LAST:event_salvarButtonActionPerformed

    private void aluno1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aluno1RadioButtonActionPerformed
        try {
            sexo = aluno1.getSexo();
            nomeTextField.setText(aluno1.getNome());
            enderecoTextField.setText(aluno1.getEndereco());
            telefoneTextField.setText(aluno1.getTelefone());
            if (sexo.equalsIgnoreCase("M")) {
                sexoMasculinoRadioButton.setSelected(true);
            }
            if (sexo.equalsIgnoreCase("F")) {
                sexofemininoRadioButton.setSelected(true);
            }
            estadoCivilComboBox.setSelectedItem(aluno1.getEstadoCivil());
            dataNascimentoTextField.setText(aluno1.getDataNascimento());
        } catch (Exception e) {
            Mensagem("erro: " + e);
        }

    }//GEN-LAST:event_aluno1RadioButtonActionPerformed

    private void aluno2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aluno2RadioButtonActionPerformed
        sexo = aluno2.getSexo();
        nomeTextField.setText(aluno2.getNome());
        enderecoTextField.setText(aluno2.getEndereco());
        telefoneTextField.setText(aluno2.getTelefone());
        if (sexo.equalsIgnoreCase("M")) {
            sexoMasculinoRadioButton.setSelected(true);
        }
        if (sexo.equalsIgnoreCase("F")) {
            sexofemininoRadioButton.setSelected(true);
        }
        estadoCivilComboBox.setSelectedItem(aluno2.getEstadoCivil());
        dataNascimentoTextField.setText(aluno2.getDataNascimento());

    }//GEN-LAST:event_aluno2RadioButtonActionPerformed

    private void aluno3RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aluno3RadioButtonActionPerformed
        sexo = aluno3.getSexo();
        nomeTextField.setText(aluno3.getNome());
        enderecoTextField.setText(aluno3.getEndereco());
        telefoneTextField.setText(aluno3.getTelefone());
        if (sexo.equalsIgnoreCase("M")) {
            sexoMasculinoRadioButton.setSelected(true);
        }
        if (sexo.equalsIgnoreCase("F")) {
            sexofemininoRadioButton.setSelected(true);
        }
        estadoCivilComboBox.setSelectedItem(aluno3.getEstadoCivil());
        dataNascimentoTextField.setText(aluno3.getDataNascimento());
    }//GEN-LAST:event_aluno3RadioButtonActionPerformed

    private void aluno4RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aluno4RadioButtonActionPerformed
        sexo = aluno4.getSexo();
        nomeTextField.setText(aluno4.getNome());
        enderecoTextField.setText(aluno4.getEndereco());
        telefoneTextField.setText(aluno4.getTelefone());
        if (sexo.equalsIgnoreCase("M")) {
            sexoMasculinoRadioButton.setSelected(true);
        }
        if (sexo.equalsIgnoreCase("F")) {
            sexofemininoRadioButton.setSelected(true);
        }
        estadoCivilComboBox.setSelectedItem(aluno4.getEstadoCivil());
        dataNascimentoTextField.setText(aluno4.getDataNascimento());
    }//GEN-LAST:event_aluno4RadioButtonActionPerformed

    private void aluno5RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aluno5RadioButtonActionPerformed
        sexo = aluno5.getSexo();
        nomeTextField.setText(aluno5.getNome());
        enderecoTextField.setText(aluno5.getEndereco());
        telefoneTextField.setText(aluno5.getTelefone());
        if (sexo.equalsIgnoreCase("M")) {
            sexoMasculinoRadioButton.setSelected(true);
        }
        if (sexo.equalsIgnoreCase("F")) {
            sexofemininoRadioButton.setSelected(true);
        }
        estadoCivilComboBox.setSelectedItem(aluno5.getEstadoCivil());
        dataNascimentoTextField.setText(aluno5.getDataNascimento());
    }//GEN-LAST:event_aluno5RadioButtonActionPerformed

    private void aluno6RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aluno6RadioButtonActionPerformed
        sexo = aluno6.getSexo();
        nomeTextField.setText(aluno6.getNome());
        enderecoTextField.setText(aluno6.getEndereco());
        telefoneTextField.setText(aluno6.getTelefone());
        if (sexo.equalsIgnoreCase("M")) {
            sexoMasculinoRadioButton.setSelected(true);
        }
        if (sexo.equalsIgnoreCase("F")) {
            sexofemininoRadioButton.setSelected(true);
        }
        estadoCivilComboBox.setSelectedItem(aluno6.getEstadoCivil());
        dataNascimentoTextField.setText(aluno6.getDataNascimento());
    }//GEN-LAST:event_aluno6RadioButtonActionPerformed

    private void nomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextFieldActionPerformed
    }//GEN-LAST:event_nomeTextFieldActionPerformed

    public String Sexo() {
        if (sexoMasculinoRadioButton.isSelected()) {
            return "M";
        } else if (sexofemininoRadioButton.isSelected()) {
            return "F";
        } else {
            Mensagem("Selecione o sexo do aluno");
            return "";
        }
    }

    public String estadoCivil() {
        if (estadoCivilComboBox.getSelectedIndex() == 0) {
            return "Solteiro";
        } else {
            if (estadoCivilComboBox.getSelectedIndex() == 1) {
                return "Casado";
            } else {
                if (estadoCivilComboBox.getSelectedIndex() == 2) {
                    return "Namorando";
                } else {
                    Mensagem("Selecione o estado civil do aluno");
                    return "";
                }
            }
        }

    }

    public String telefone() {
        try {
            telefone = telefoneTextField.getText();
            telefone = telefone.replaceAll("\\(", "").replaceAll("\\)", "").replaceAll("-", "").replaceAll(" ", "");


            if (telefone.length() == 8) {
                quateto1 = telefone.substring(0, 4);
                quateto2 = telefone.substring(4, 8);
                tele = Double.parseDouble(telefone);
                return "(37)" + quateto1 + "-" + quateto2;

            } else {
                if (telefone.length() == 10) {
                    ddd = telefone.substring(0, 2);
                    quateto1 = telefone.substring(2, 6);
                    quateto2 = telefone.substring(6, 10);
                    tele = Double.parseDouble(telefone);
                    return "(" + ddd + ")" + quateto1 + "-" + quateto2;
                } else {
                    if (telefone.length() == 11) {
                        ddd = telefone.substring(1, 3);
                        quateto1 = telefone.substring(3, 7);
                        quateto2 = telefone.substring(7, 11);
                        tele = Double.parseDouble(telefone);
                        return "(" + ddd + ")" + quateto1 + "-" + quateto2;
                    } else {
                        if (telefone.length() == 12) {
                            ddd = telefone.substring(2, 4);
                            quateto1 = telefone.substring(4, 8);
                            quateto2 = telefone.substring(8, 12);
                            tele = Double.parseDouble(telefone);
                            return "(" + ddd + ")" + quateto1 + "-" + quateto2;

                        } else {
                            if (telefone.length() < 8 && telefone.length() > 0 || telefone.length() > 12
                                    || telefone.length() == 9) {
                                Mensagem("O telefone contem numero a mais ou a menos");
                                return "";
                            } else {
                                return "";
                            }

                        }
                    }
                }
            }
        } catch (Exception e) {
            Mensagem(" Voce digitou letra no telefone");
            return "";
        }

    }

    public void Mensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Atenção", JOptionPane.QUESTION_MESSAGE);
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaginaInciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaInciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaInciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaInciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaInciar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton aluno1RadioButton;
    private javax.swing.JRadioButton aluno2RadioButton;
    private javax.swing.JRadioButton aluno3RadioButton;
    private javax.swing.JRadioButton aluno4RadioButton;
    private javax.swing.JRadioButton aluno5RadioButton;
    private javax.swing.JRadioButton aluno6RadioButton;
    private javax.swing.ButtonGroup alunobuttonGroup;
    private javax.swing.JTextField dataNascimentoTextField;
    private javax.swing.JTextField enderecoTextField;
    private javax.swing.JComboBox estadoCivilComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JButton salvarButton;
    private javax.swing.JRadioButton sexoMasculinoRadioButton;
    private javax.swing.ButtonGroup sexobuttonGroup;
    private javax.swing.JRadioButton sexofemininoRadioButton;
    private javax.swing.JTextField telefoneTextField;
    // End of variables declaration//GEN-END:variables
}
