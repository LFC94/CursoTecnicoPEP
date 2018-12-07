/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lucas
 */
@Entity
@Table(name = "pacotes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pacotes.findAll", query = "SELECT p FROM Pacotes p")
    , @NamedQuery(name = "Pacotes.findByCodigo", query = "SELECT p FROM Pacotes p WHERE p.codigo = :codigo")
    , @NamedQuery(name = "Pacotes.findByOpcoes", query = "SELECT p FROM Pacotes p WHERE p.opcoes = :opcoes")
    , @NamedQuery(name = "Pacotes.findByPrecos", query = "SELECT p FROM Pacotes p WHERE p.precos = :precos")})
public class Pacotes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "opcoes")
    private String opcoes;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "precos")
    private BigDecimal precos;

    public Pacotes() {
    }

    public Pacotes(Integer codigo) {
        this.codigo = codigo;
    }

    public Pacotes(Integer codigo, String opcoes, BigDecimal precos) {
        this.codigo = codigo;
        this.opcoes = opcoes;
        this.precos = precos;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(String opcoes) {
        this.opcoes = opcoes;
    }

    public BigDecimal getPrecos() {
        return precos;
    }

    public void setPrecos(BigDecimal precos) {
        this.precos = precos;
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
        if (!(object instanceof Pacotes)) {
            return false;
        }
        Pacotes other = (Pacotes) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Codigo.Pacotes[ codigo=" + codigo + " ]";
    }
    
}
