/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lucas
 */
@Entity
@Table(name = "hospedagem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hospedagem.findAll", query = "SELECT h FROM Hospedagem h")
    , @NamedQuery(name = "Hospedagem.findByCodigo", query = "SELECT h FROM Hospedagem h WHERE h.codigo = :codigo")
    , @NamedQuery(name = "Hospedagem.findByCodQuarto", query = "SELECT h FROM Hospedagem h WHERE h.codQuarto = :codQuarto")
    , @NamedQuery(name = "Hospedagem.findByDiaChegada", query = "SELECT h FROM Hospedagem h WHERE h.diaChegada = :diaChegada")
    , @NamedQuery(name = "Hospedagem.findByDiaSaida", query = "SELECT h FROM Hospedagem h WHERE h.diaSaida = :diaSaida")
    , @NamedQuery(name = "Hospedagem.findByPacote", query = "SELECT h FROM Hospedagem h WHERE h.pacote = :pacote")
    , @NamedQuery(name = "Hospedagem.findByAlimentacao", query = "SELECT h FROM Hospedagem h WHERE h.alimentacao = :alimentacao")
    , @NamedQuery(name = "Hospedagem.findByHospede", query = "SELECT h FROM Hospedagem h WHERE h.hospede = :hospede")
    , @NamedQuery(name = "Hospedagem.findByAcesinfa", query = "SELECT h FROM Hospedagem h WHERE h.acesinfa = :acesinfa")
    , @NamedQuery(name = "Hospedagem.findByAcesfuma", query = "SELECT h FROM Hospedagem h WHERE h.acesfuma = :acesfuma")})
public class Hospedagem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "codQuarto")
    private String codQuarto;
    @Basic(optional = false)
    @Column(name = "diaChegada")
    @Temporal(TemporalType.DATE)
    private Date diaChegada;
    @Basic(optional = false)
    @Column(name = "diaSaida")
    @Temporal(TemporalType.DATE)
    private Date diaSaida;
    @Basic(optional = false)
    @Column(name = "pacote")
    private String pacote;
    @Basic(optional = false)
    @Column(name = "alimentacao")
    private int alimentacao;
    @Basic(optional = false)
    @Column(name = "hospede")
    private int hospede;
    @Basic(optional = false)
    @Column(name = "acesinfa")
    private String acesinfa;
    @Basic(optional = false)
    @Column(name = "acesfuma")
    private String acesfuma;

    public Hospedagem() {
    }

    public Hospedagem(Integer codigo) {
        this.codigo = codigo;
    }

    public Hospedagem(Integer codigo, String codQuarto, Date diaChegada, Date diaSaida, String pacote, int alimentacao, int hospede, String acesinfa, String acesfuma) {
        this.codigo = codigo;
        this.codQuarto = codQuarto;
        this.diaChegada = diaChegada;
        this.diaSaida = diaSaida;
        this.pacote = pacote;
        this.alimentacao = alimentacao;
        this.hospede = hospede;
        this.acesinfa = acesinfa;
        this.acesfuma = acesfuma;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCodQuarto() {
        return codQuarto;
    }

    public void setCodQuarto(String codQuarto) {
        this.codQuarto = codQuarto;
    }

    public Date getDiaChegada() {
        return diaChegada;
    }

    public void setDiaChegada(Date diaChegada) {
        this.diaChegada = diaChegada;
    }

    public Date getDiaSaida() {
        return diaSaida;
    }

    public void setDiaSaida(Date diaSaida) {
        this.diaSaida = diaSaida;
    }

    public String getPacote() {
        return pacote;
    }

    public void setPacote(String pacote) {
        this.pacote = pacote;
    }

    public int getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(int alimentacao) {
        this.alimentacao = alimentacao;
    }

    public int getHospede() {
        return hospede;
    }

    public void setHospede(int hospede) {
        this.hospede = hospede;
    }

    public String getAcesinfa() {
        return acesinfa;
    }

    public void setAcesinfa(String acesinfa) {
        this.acesinfa = acesinfa;
    }

    public String getAcesfuma() {
        return acesfuma;
    }

    public void setAcesfuma(String acesfuma) {
        this.acesfuma = acesfuma;
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
        if (!(object instanceof Hospedagem)) {
            return false;
        }
        Hospedagem other = (Hospedagem) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Codigo.Hospedagem[ codigo=" + codigo + " ]";
    }
    
}
