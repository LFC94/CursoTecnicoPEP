/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroaluno;

import javax.swing.JOptionPane;

/**
 *
 * @author INFO01
 */
public class Aluno {

    private String nome = "";
    private String dataNascimento = "";
    private String endereco = "";
    private String dataNascimentoInvertida = "";
    private String telefone = "";
    private String estadoCivil = "Solteiro";
    private String sexo = "";

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getDataNascimentoInvertida() {
        return dataNascimentoInvertida;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNome(String novonome) {
        nome = novonome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;

        if (!this.dataNascimento.trim().equals("")) {
            String dia, mes, ano;
            dia = dataNascimento.substring(0, 2);
            mes = dataNascimento.substring(3, 5);
            ano = dataNascimento.substring(6, 10);
            this.dataNascimento = dia + "/" + mes + "/" + ano;
            setDataNascimentoInvertida(dataNascimento);
        }
    }

    private void setDataNascimentoInvertida(String novoDataNascimentoInvertida) {
        String dia, mes, ano;
        dia = novoDataNascimentoInvertida.substring(0, 2);
        mes = novoDataNascimentoInvertida.substring(3, 5);
        ano = novoDataNascimentoInvertida.substring(6, 10);

        dataNascimentoInvertida = ano + "-" + mes + "-" + dia;
    }
}
