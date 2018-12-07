/*
 * To change this template, choose Tools | Templates
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

/**
 *
 * @author INFO01
 */
@Entity
@Table(name = "atrores", catalog = "HBO", schema = "")
@NamedQueries({
    @NamedQuery(name = "Atrores.findAll", query = "SELECT a FROM Atrores a"),
    @NamedQuery(name = "Atrores.findByCodigo", query = "SELECT a FROM Atrores a WHERE a.codigo = :codigo"),
    @NamedQuery(name = "Atrores.findByNome", query = "SELECT a FROM Atrores a WHERE a.nome = :nome"),
    @NamedQuery(name = "Atrores.findByTelefone", query = "SELECT a FROM Atrores a WHERE a.telefone = :telefone"),
    @NamedQuery(name = "Atrores.findByIdade", query = "SELECT a FROM Atrores a WHERE a.idade = :idade")})
public class Atrores implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "idade")
    private Integer idade;

    public Atrores() {
    }

    public Atrores(Integer codigo) {
        this.codigo = codigo;
    }

    public Atrores(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        Integer oldIdade = this.idade;
        this.idade = idade;
        changeSupport.firePropertyChange("idade", oldIdade, idade);
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
        if (!(object instanceof Atrores)) {
            return false;
        }
        Atrores other = (Atrores) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Codigo.Atrores[ codigo=" + codigo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
