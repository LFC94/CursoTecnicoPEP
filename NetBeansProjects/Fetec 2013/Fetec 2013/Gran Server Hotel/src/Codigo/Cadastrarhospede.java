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
@Table(name = "cadastrarhospede")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cadastrarhospede.findAll", query = "SELECT c FROM Cadastrarhospede c")
    , @NamedQuery(name = "Cadastrarhospede.findByCodigo", query = "SELECT c FROM Cadastrarhospede c WHERE c.codigo = :codigo")
    , @NamedQuery(name = "Cadastrarhospede.findByNome", query = "SELECT c FROM Cadastrarhospede c WHERE c.nome = :nome")
    , @NamedQuery(name = "Cadastrarhospede.findByCnpj", query = "SELECT c FROM Cadastrarhospede c WHERE c.cnpj = :cnpj")
    , @NamedQuery(name = "Cadastrarhospede.findByProfissao", query = "SELECT c FROM Cadastrarhospede c WHERE c.profissao = :profissao")
    , @NamedQuery(name = "Cadastrarhospede.findByEndereco", query = "SELECT c FROM Cadastrarhospede c WHERE c.endereco = :endereco")
    , @NamedQuery(name = "Cadastrarhospede.findByNumend", query = "SELECT c FROM Cadastrarhospede c WHERE c.numend = :numend")
    , @NamedQuery(name = "Cadastrarhospede.findByBairro", query = "SELECT c FROM Cadastrarhospede c WHERE c.bairro = :bairro")
    , @NamedQuery(name = "Cadastrarhospede.findByCidade", query = "SELECT c FROM Cadastrarhospede c WHERE c.cidade = :cidade")
    , @NamedQuery(name = "Cadastrarhospede.findByEstado", query = "SELECT c FROM Cadastrarhospede c WHERE c.estado = :estado")
    , @NamedQuery(name = "Cadastrarhospede.findByPais", query = "SELECT c FROM Cadastrarhospede c WHERE c.pais = :pais")
    , @NamedQuery(name = "Cadastrarhospede.findByCep", query = "SELECT c FROM Cadastrarhospede c WHERE c.cep = :cep")
    , @NamedQuery(name = "Cadastrarhospede.findByEmail", query = "SELECT c FROM Cadastrarhospede c WHERE c.email = :email")
    , @NamedQuery(name = "Cadastrarhospede.findByEstadoCivil", query = "SELECT c FROM Cadastrarhospede c WHERE c.estadoCivil = :estadoCivil")
    , @NamedQuery(name = "Cadastrarhospede.findBySenha", query = "SELECT c FROM Cadastrarhospede c WHERE c.senha = :senha")})
public class Cadastrarhospede implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "cnpj")
    private String cnpj;
    @Basic(optional = false)
    @Column(name = "profissao")
    private String profissao;
    @Basic(optional = false)
    @Column(name = "endereco")
    private String endereco;
    @Basic(optional = false)
    @Column(name = "numend")
    private String numend;
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
    @Column(name = "pais")
    private String pais;
    @Basic(optional = false)
    @Column(name = "cep")
    private String cep;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "estadoCivil")
    private String estadoCivil;
    @Basic(optional = false)
    @Column(name = "senha")
    private String senha;

    public Cadastrarhospede() {
    }

    public Cadastrarhospede(Integer codigo) {
        this.codigo = codigo;
    }

    public Cadastrarhospede(Integer codigo, String nome, String cnpj, String profissao, String endereco, String numend, String bairro, String cidade, String estado, String pais, String cep, String email, String estadoCivil, String senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.cnpj = cnpj;
        this.profissao = profissao;
        this.endereco = endereco;
        this.numend = numend;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.email = email;
        this.estadoCivil = estadoCivil;
        this.senha = senha;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        Integer oldCodigo = this.codigo;
        this.codigo = codigo;
        changeSupport.firePropertyChange("codigo", oldCodigo, codigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        String oldCnpj = this.cnpj;
        this.cnpj = cnpj;
        changeSupport.firePropertyChange("cnpj", oldCnpj, cnpj);
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        String oldProfissao = this.profissao;
        this.profissao = profissao;
        changeSupport.firePropertyChange("profissao", oldProfissao, profissao);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String oldEndereco = this.endereco;
        this.endereco = endereco;
        changeSupport.firePropertyChange("endereco", oldEndereco, endereco);
    }

    public String getNumend() {
        return numend;
    }

    public void setNumend(String numend) {
        String oldNumend = this.numend;
        this.numend = numend;
        changeSupport.firePropertyChange("numend", oldNumend, numend);
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        String oldPais = this.pais;
        this.pais = pais;
        changeSupport.firePropertyChange("pais", oldPais, pais);
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        String oldCep = this.cep;
        this.cep = cep;
        changeSupport.firePropertyChange("cep", oldCep, cep);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        String oldEstadoCivil = this.estadoCivil;
        this.estadoCivil = estadoCivil;
        changeSupport.firePropertyChange("estadoCivil", oldEstadoCivil, estadoCivil);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        String oldSenha = this.senha;
        this.senha = senha;
        changeSupport.firePropertyChange("senha", oldSenha, senha);
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
        if (!(object instanceof Cadastrarhospede)) {
            return false;
        }
        Cadastrarhospede other = (Cadastrarhospede) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Codigo.Cadastrarhospede[ codigo=" + codigo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
