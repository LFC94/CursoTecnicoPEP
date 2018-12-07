/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lucas
 */
@Entity
@Table(name = "loginfuncionario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Loginfuncionario.findAll", query = "SELECT l FROM Loginfuncionario l")
    , @NamedQuery(name = "Loginfuncionario.findByCodigo", query = "SELECT l FROM Loginfuncionario l WHERE l.codigo = :codigo")
    , @NamedQuery(name = "Loginfuncionario.findByLogin", query = "SELECT l FROM Loginfuncionario l WHERE l.login = :login")
    , @NamedQuery(name = "Loginfuncionario.findBySenha", query = "SELECT l FROM Loginfuncionario l WHERE l.senha = :senha")
    , @NamedQuery(name = "Loginfuncionario.findByNome", query = "SELECT l FROM Loginfuncionario l WHERE l.nome = :nome")
    , @NamedQuery(name = "Loginfuncionario.findByCpf", query = "SELECT l FROM Loginfuncionario l WHERE l.cpf = :cpf")
    , @NamedQuery(name = "Loginfuncionario.findByFuncao", query = "SELECT l FROM Loginfuncionario l WHERE l.funcao = :funcao")
    , @NamedQuery(name = "Loginfuncionario.findByCep", query = "SELECT l FROM Loginfuncionario l WHERE l.cep = :cep")
    , @NamedQuery(name = "Loginfuncionario.findByPais", query = "SELECT l FROM Loginfuncionario l WHERE l.pais = :pais")
    , @NamedQuery(name = "Loginfuncionario.findByEndereco", query = "SELECT l FROM Loginfuncionario l WHERE l.endereco = :endereco")
    , @NamedQuery(name = "Loginfuncionario.findByNuendere", query = "SELECT l FROM Loginfuncionario l WHERE l.nuendere = :nuendere")
    , @NamedQuery(name = "Loginfuncionario.findByBairro", query = "SELECT l FROM Loginfuncionario l WHERE l.bairro = :bairro")
    , @NamedQuery(name = "Loginfuncionario.findByCidade", query = "SELECT l FROM Loginfuncionario l WHERE l.cidade = :cidade")
    , @NamedQuery(name = "Loginfuncionario.findByEstado", query = "SELECT l FROM Loginfuncionario l WHERE l.estado = :estado")
    , @NamedQuery(name = "Loginfuncionario.findByAdmin", query = "SELECT l FROM Loginfuncionario l WHERE l.admin = :admin")
    , @NamedQuery(name = "Loginfuncionario.findByPermicao1", query = "SELECT l FROM Loginfuncionario l WHERE l.permicao1 = :permicao1")
    , @NamedQuery(name = "Loginfuncionario.findByPermicao2", query = "SELECT l FROM Loginfuncionario l WHERE l.permicao2 = :permicao2")
    , @NamedQuery(name = "Loginfuncionario.findByPermicao3", query = "SELECT l FROM Loginfuncionario l WHERE l.permicao3 = :permicao3")
    , @NamedQuery(name = "Loginfuncionario.findByPermicao4", query = "SELECT l FROM Loginfuncionario l WHERE l.permicao4 = :permicao4")
    , @NamedQuery(name = "Loginfuncionario.findByPermicao5", query = "SELECT l FROM Loginfuncionario l WHERE l.permicao5 = :permicao5")
    , @NamedQuery(name = "Loginfuncionario.findByPermicao6", query = "SELECT l FROM Loginfuncionario l WHERE l.permicao6 = :permicao6")
    , @NamedQuery(name = "Loginfuncionario.findByPermicao7", query = "SELECT l FROM Loginfuncionario l WHERE l.permicao7 = :permicao7")
    , @NamedQuery(name = "Loginfuncionario.findByPermicao8", query = "SELECT l FROM Loginfuncionario l WHERE l.permicao8 = :permicao8")
    , @NamedQuery(name = "Loginfuncionario.findByPermicao9", query = "SELECT l FROM Loginfuncionario l WHERE l.permicao9 = :permicao9")
    , @NamedQuery(name = "Loginfuncionario.findByPermicao10", query = "SELECT l FROM Loginfuncionario l WHERE l.permicao10 = :permicao10")
    , @NamedQuery(name = "Loginfuncionario.findByPermicao11", query = "SELECT l FROM Loginfuncionario l WHERE l.permicao11 = :permicao11")})
public class Loginfuncionario implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "login")
    private String login;
    @Basic(optional = false)
    @Column(name = "senha")
    private String senha;
    @Basic(optional = false)
    @Column(name = "Nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "cpf")
    private String cpf;
    @Basic(optional = false)
    @Column(name = "funcao")
    private String funcao;
    @Basic(optional = false)
    @Column(name = "cep")
    private String cep;
    @Basic(optional = false)
    @Column(name = "pais")
    private String pais;
    @Basic(optional = false)
    @Column(name = "endereco")
    private String endereco;
    @Basic(optional = false)
    @Column(name = "nuendere")
    private String nuendere;
    @Basic(optional = false)
    @Column(name = "bairro")
    private String bairro;
    @Basic(optional = false)
    @Column(name = "cidade")
    private String cidade;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @Column(name = "admin")
    private String admin;
    @Basic(optional = false)
    @Column(name = "permicao1")
    private String permicao1;
    @Basic(optional = false)
    @Column(name = "permicao2")
    private String permicao2;
    @Basic(optional = false)
    @Column(name = "permicao3")
    private String permicao3;
    @Basic(optional = false)
    @Column(name = "permicao4")
    private String permicao4;
    @Basic(optional = false)
    @Column(name = "permicao5")
    private String permicao5;
    @Basic(optional = false)
    @Column(name = "permicao6")
    private String permicao6;
    @Basic(optional = false)
    @Column(name = "permicao7")
    private String permicao7;
    @Basic(optional = false)
    @Column(name = "permicao8")
    private String permicao8;
    @Basic(optional = false)
    @Column(name = "permicao9")
    private String permicao9;
    @Basic(optional = false)
    @Column(name = "permicao10")
    private String permicao10;
    @Basic(optional = false)
    @Column(name = "permicao11")
    private String permicao11;

    public Loginfuncionario() {
    }

    public Loginfuncionario(Integer codigo) {
        this.codigo = codigo;
    }

    public Loginfuncionario(Integer codigo, String login, String senha, String nome, String cpf, String funcao, String cep, String pais, String endereco, String nuendere, String bairro, String cidade, String estado, String admin, String permicao1, String permicao2, String permicao3, String permicao4, String permicao5, String permicao6, String permicao7, String permicao8, String permicao9, String permicao10, String permicao11) {
        this.codigo = codigo;
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.cpf = cpf;
        this.funcao = funcao;
        this.cep = cep;
        this.pais = pais;
        this.endereco = endereco;
        this.nuendere = nuendere;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.admin = admin;
        this.permicao1 = permicao1;
        this.permicao2 = permicao2;
        this.permicao3 = permicao3;
        this.permicao4 = permicao4;
        this.permicao5 = permicao5;
        this.permicao6 = permicao6;
        this.permicao7 = permicao7;
        this.permicao8 = permicao8;
        this.permicao9 = permicao9;
        this.permicao10 = permicao10;
        this.permicao11 = permicao11;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        Integer oldCodigo = this.codigo;
        this.codigo = codigo;
        changeSupport.firePropertyChange("codigo", oldCodigo, codigo);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        String oldLogin = this.login;
        this.login = login;
        changeSupport.firePropertyChange("login", oldLogin, login);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        String oldSenha = this.senha;
        this.senha = senha;
        changeSupport.firePropertyChange("senha", oldSenha, senha);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        String oldFuncao = this.funcao;
        this.funcao = funcao;
        changeSupport.firePropertyChange("funcao", oldFuncao, funcao);
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        String oldCep = this.cep;
        this.cep = cep;
        changeSupport.firePropertyChange("cep", oldCep, cep);
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        String oldPais = this.pais;
        this.pais = pais;
        changeSupport.firePropertyChange("pais", oldPais, pais);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String oldEndereco = this.endereco;
        this.endereco = endereco;
        changeSupport.firePropertyChange("endereco", oldEndereco, endereco);
    }

    public String getNuendere() {
        return nuendere;
    }

    public void setNuendere(String nuendere) {
        String oldNuendere = this.nuendere;
        this.nuendere = nuendere;
        changeSupport.firePropertyChange("nuendere", oldNuendere, nuendere);
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        String oldBairro = this.bairro;
        this.bairro = bairro;
        changeSupport.firePropertyChange("bairro", oldBairro, bairro);
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        String oldCidade = this.cidade;
        this.cidade = cidade;
        changeSupport.firePropertyChange("cidade", oldCidade, cidade);
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        String oldEstado = this.estado;
        this.estado = estado;
        changeSupport.firePropertyChange("estado", oldEstado, estado);
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        String oldAdmin = this.admin;
        this.admin = admin;
        changeSupport.firePropertyChange("admin", oldAdmin, admin);
    }

    public String getPermicao1() {
        return permicao1;
    }

    public void setPermicao1(String permicao1) {
        String oldPermicao1 = this.permicao1;
        this.permicao1 = permicao1;
        changeSupport.firePropertyChange("permicao1", oldPermicao1, permicao1);
    }

    public String getPermicao2() {
        return permicao2;
    }

    public void setPermicao2(String permicao2) {
        String oldPermicao2 = this.permicao2;
        this.permicao2 = permicao2;
        changeSupport.firePropertyChange("permicao2", oldPermicao2, permicao2);
    }

    public String getPermicao3() {
        return permicao3;
    }

    public void setPermicao3(String permicao3) {
        String oldPermicao3 = this.permicao3;
        this.permicao3 = permicao3;
        changeSupport.firePropertyChange("permicao3", oldPermicao3, permicao3);
    }

    public String getPermicao4() {
        return permicao4;
    }

    public void setPermicao4(String permicao4) {
        String oldPermicao4 = this.permicao4;
        this.permicao4 = permicao4;
        changeSupport.firePropertyChange("permicao4", oldPermicao4, permicao4);
    }

    public String getPermicao5() {
        return permicao5;
    }

    public void setPermicao5(String permicao5) {
        String oldPermicao5 = this.permicao5;
        this.permicao5 = permicao5;
        changeSupport.firePropertyChange("permicao5", oldPermicao5, permicao5);
    }

    public String getPermicao6() {
        return permicao6;
    }

    public void setPermicao6(String permicao6) {
        String oldPermicao6 = this.permicao6;
        this.permicao6 = permicao6;
        changeSupport.firePropertyChange("permicao6", oldPermicao6, permicao6);
    }

    public String getPermicao7() {
        return permicao7;
    }

    public void setPermicao7(String permicao7) {
        String oldPermicao7 = this.permicao7;
        this.permicao7 = permicao7;
        changeSupport.firePropertyChange("permicao7", oldPermicao7, permicao7);
    }

    public String getPermicao8() {
        return permicao8;
    }

    public void setPermicao8(String permicao8) {
        String oldPermicao8 = this.permicao8;
        this.permicao8 = permicao8;
        changeSupport.firePropertyChange("permicao8", oldPermicao8, permicao8);
    }

    public String getPermicao9() {
        return permicao9;
    }

    public void setPermicao9(String permicao9) {
        String oldPermicao9 = this.permicao9;
        this.permicao9 = permicao9;
        changeSupport.firePropertyChange("permicao9", oldPermicao9, permicao9);
    }

    public String getPermicao10() {
        return permicao10;
    }

    public void setPermicao10(String permicao10) {
        String oldPermicao10 = this.permicao10;
        this.permicao10 = permicao10;
        changeSupport.firePropertyChange("permicao10", oldPermicao10, permicao10);
    }

    public String getPermicao11() {
        return permicao11;
    }

    public void setPermicao11(String permicao11) {
        String oldPermicao11 = this.permicao11;
        this.permicao11 = permicao11;
        changeSupport.firePropertyChange("permicao11", oldPermicao11, permicao11);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Loginfuncionario)) {
            return false;
        }
        Loginfuncionario other = (Loginfuncionario) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Codigo.Loginfuncionario[ codigo=" + codigo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
