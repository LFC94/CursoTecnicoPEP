/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "cadastroproduto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cadastroproduto.findAll", query = "SELECT c FROM Cadastroproduto c")
    , @NamedQuery(name = "Cadastroproduto.findByCodigo", query = "SELECT c FROM Cadastroproduto c WHERE c.codigo = :codigo")
    , @NamedQuery(name = "Cadastroproduto.findByNome", query = "SELECT c FROM Cadastroproduto c WHERE c.nome = :nome")
    , @NamedQuery(name = "Cadastroproduto.findByModelo", query = "SELECT c FROM Cadastroproduto c WHERE c.modelo = :modelo")
    , @NamedQuery(name = "Cadastroproduto.findByFabricante", query = "SELECT c FROM Cadastroproduto c WHERE c.fabricante = :fabricante")
    , @NamedQuery(name = "Cadastroproduto.findByQuantidade", query = "SELECT c FROM Cadastroproduto c WHERE c.quantidade = :quantidade")
    , @NamedQuery(name = "Cadastroproduto.findByPreco", query = "SELECT c FROM Cadastroproduto c WHERE c.preco = :preco")})
public class Cadastroproduto implements Serializable {

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
    @Column(name = "modelo")
    private String modelo;
    @Basic(optional = false)
    @Column(name = "fabricante")
    private String fabricante;
    @Basic(optional = false)
    @Column(name = "quantidade")
    private int quantidade;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "preco")
    private BigDecimal preco;

    public Cadastroproduto() {
    }

    public Cadastroproduto(Integer codigo) {
        this.codigo = codigo;
    }

    public Cadastroproduto(Integer codigo, String nome, String modelo, String fabricante, int quantidade, BigDecimal preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.quantidade = quantidade;
        this.preco = preco;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        String oldModelo = this.modelo;
        this.modelo = modelo;
        changeSupport.firePropertyChange("modelo", oldModelo, modelo);
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        String oldFabricante = this.fabricante;
        this.fabricante = fabricante;
        changeSupport.firePropertyChange("fabricante", oldFabricante, fabricante);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        int oldQuantidade = this.quantidade;
        this.quantidade = quantidade;
        changeSupport.firePropertyChange("quantidade", oldQuantidade, quantidade);
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        BigDecimal oldPreco = this.preco;
        this.preco = preco;
        changeSupport.firePropertyChange("preco", oldPreco, preco);
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
        if (!(object instanceof Cadastroproduto)) {
            return false;
        }
        Cadastroproduto other = (Cadastroproduto) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Codigo.Cadastroproduto[ codigo=" + codigo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
