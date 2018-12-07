/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaocaixa;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author INFO01
 */
@Entity
@Table(name = "movimento", catalog = "caixa", schema = "")
@NamedQueries({
    @NamedQuery(name = "Movimento.findAll", query = "SELECT m FROM Movimento m"),
    @NamedQuery(name = "Movimento.findByLanc", query = "SELECT m FROM Movimento m WHERE m.lanc = :lanc"),
    @NamedQuery(name = "Movimento.findByData", query = "SELECT m FROM Movimento m WHERE m.data = :data"),
    @NamedQuery(name = "Movimento.findByHistorico", query = "SELECT m FROM Movimento m WHERE m.historico = :historico"),
    @NamedQuery(name = "Movimento.findByCredito", query = "SELECT m FROM Movimento m WHERE m.credito = :credito"),
    @NamedQuery(name = "Movimento.findByDebito", query = "SELECT m FROM Movimento m WHERE m.debito = :debito"),
    @NamedQuery(name = "Movimento.findBySaldo", query = "SELECT m FROM Movimento m WHERE m.saldo = :saldo"),
    @NamedQuery(name = "Movimento.findByUsuario", query = "SELECT m FROM Movimento m WHERE m.usuario = :usuario")})
public class Movimento implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "lanc")
    private Integer lanc;
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Column(name = "historico")
    private String historico;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "credito")
    private BigDecimal credito;
    @Column(name = "debito")
    private BigDecimal debito;
    @Column(name = "saldo")
    private BigDecimal saldo;
    @Column(name = "usuario")
    private Integer usuario;

    public Movimento() {
    }

    public Movimento(Integer lanc) {
        this.lanc = lanc;
    }

    public Integer getLanc() {
        return lanc;
    }

    public void setLanc(Integer lanc) {
        Integer oldLanc = this.lanc;
        this.lanc = lanc;
        changeSupport.firePropertyChange("lanc", oldLanc, lanc);
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        Date oldData = this.data;
        this.data = data;
        changeSupport.firePropertyChange("data", oldData, data);
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        String oldHistorico = this.historico;
        this.historico = historico;
        changeSupport.firePropertyChange("historico", oldHistorico, historico);
    }

    public BigDecimal getCredito() {
        return credito;
    }

    public void setCredito(BigDecimal credito) {
        BigDecimal oldCredito = this.credito;
        this.credito = credito;
        changeSupport.firePropertyChange("credito", oldCredito, credito);
    }

    public BigDecimal getDebito() {
        return debito;
    }

    public void setDebito(BigDecimal debito) {
        BigDecimal oldDebito = this.debito;
        this.debito = debito;
        changeSupport.firePropertyChange("debito", oldDebito, debito);
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        BigDecimal oldSaldo = this.saldo;
        this.saldo = saldo;
        changeSupport.firePropertyChange("saldo", oldSaldo, saldo);
    }

    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        Integer oldUsuario = this.usuario;
        this.usuario = usuario;
        changeSupport.firePropertyChange("usuario", oldUsuario, usuario);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lanc != null ? lanc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movimento)) {
            return false;
        }
        Movimento other = (Movimento) object;
        if ((this.lanc == null && other.lanc != null) || (this.lanc != null && !this.lanc.equals(other.lanc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "revisaocaixa.Movimento[ lanc=" + lanc + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
