/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lucas
 */
@Entity
@Table(name = "quartos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Quartos.findAll", query = "SELECT q FROM Quartos q")
    , @NamedQuery(name = "Quartos.findByCodigo", query = "SELECT q FROM Quartos q WHERE q.codigo = :codigo")
    , @NamedQuery(name = "Quartos.findByAndar", query = "SELECT q FROM Quartos q WHERE q.andar = :andar")
    , @NamedQuery(name = "Quartos.findByNumQuarto", query = "SELECT q FROM Quartos q WHERE q.numQuarto = :numQuarto")
    , @NamedQuery(name = "Quartos.findByTipo", query = "SELECT q FROM Quartos q WHERE q.tipo = :tipo")
    , @NamedQuery(name = "Quartos.findByCamas", query = "SELECT q FROM Quartos q WHERE q.camas = :camas")
    , @NamedQuery(name = "Quartos.findByConforto1", query = "SELECT q FROM Quartos q WHERE q.conforto1 = :conforto1")
    , @NamedQuery(name = "Quartos.findByConforto2", query = "SELECT q FROM Quartos q WHERE q.conforto2 = :conforto2")
    , @NamedQuery(name = "Quartos.findByConforto3", query = "SELECT q FROM Quartos q WHERE q.conforto3 = :conforto3")
    , @NamedQuery(name = "Quartos.findByValor", query = "SELECT q FROM Quartos q WHERE q.valor = :valor")})
public class Quartos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "andar")
    private String andar;
    @Basic(optional = false)
    @Column(name = "numQuarto")
    private String numQuarto;
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "camas")
    private String camas;
    @Basic(optional = false)
    @Column(name = "conforto1")
    private String conforto1;
    @Basic(optional = false)
    @Column(name = "conforto2")
    private String conforto2;
    @Basic(optional = false)
    @Column(name = "conforto3")
    private String conforto3;
    @Basic(optional = false)
    @Column(name = "valor")
    private double valor;

    public Quartos() {
    }

    public Quartos(Integer codigo) {
        this.codigo = codigo;
    }

    public Quartos(Integer codigo, String andar, String numQuarto, String tipo, String camas, String conforto1, String conforto2, String conforto3, double valor) {
        this.codigo = codigo;
        this.andar = andar;
        this.numQuarto = numQuarto;
        this.tipo = tipo;
        this.camas = camas;
        this.conforto1 = conforto1;
        this.conforto2 = conforto2;
        this.conforto3 = conforto3;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(String numQuarto) {
        this.numQuarto = numQuarto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCamas() {
        return camas;
    }

    public void setCamas(String camas) {
        this.camas = camas;
    }

    public String getConforto1() {
        return conforto1;
    }

    public void setConforto1(String conforto1) {
        this.conforto1 = conforto1;
    }

    public String getConforto2() {
        return conforto2;
    }

    public void setConforto2(String conforto2) {
        this.conforto2 = conforto2;
    }

    public String getConforto3() {
        return conforto3;
    }

    public void setConforto3(String conforto3) {
        this.conforto3 = conforto3;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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
        if (!(object instanceof Quartos)) {
            return false;
        }
        Quartos other = (Quartos) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Codigo.Quartos[ codigo=" + codigo + " ]";
    }
    
}
