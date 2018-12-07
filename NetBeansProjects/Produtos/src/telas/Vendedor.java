/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

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
 * @author Lucas
 */
@Entity
@Table(name = "vendedor", catalog = "con_estoque", schema = "")
@NamedQueries({
    @NamedQuery(name = "Vendedor.findAll", query = "SELECT v FROM Vendedor v"),
    @NamedQuery(name = "Vendedor.findByCodigo", query = "SELECT v FROM Vendedor v WHERE v.codigo = :codigo"),
    @NamedQuery(name = "Vendedor.findByNome", query = "SELECT v FROM Vendedor v WHERE v.nome = :nome"),
    @NamedQuery(name = "Vendedor.findByEndereco", query = "SELECT v FROM Vendedor v WHERE v.endereco = :endereco"),
    @NamedQuery(name = "Vendedor.findByNEndereco", query = "SELECT v FROM Vendedor v WHERE v.nEndereco = :nEndereco"),
    @NamedQuery(name = "Vendedor.findByCidade", query = "SELECT v FROM Vendedor v WHERE v.cidade = :cidade"),
    @NamedQuery(name = "Vendedor.findByEstado", query = "SELECT v FROM Vendedor v WHERE v.estado = :estado"),
    @NamedQuery(name = "Vendedor.findByFuncao", query = "SELECT v FROM Vendedor v WHERE v.funcao = :funcao"),
    @NamedQuery(name = "Vendedor.findBySenha", query = "SELECT v FROM Vendedor v WHERE v.senha = :senha")})
public class Vendedor implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Codigo")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "Nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "Endereco")
    private String endereco;
    @Basic(optional = false)
    @Column(name = "N_Endereco")
    private String nEndereco;
    @Basic(optional = false)
    @Column(name = "Cidade")
    private String cidade;
    @Basic(optional = false)
    @Column(name = "Estado")
    private String estado;
    @Basic(optional = false)
    @Column(name = "Funcao")
    private String funcao;
    @Basic(optional = false)
    @Column(name = "senha")
    private String senha;

    public Vendedor() {
    }

    public Vendedor(Integer codigo) {
        this.codigo = codigo;
    }

    public Vendedor(Integer codigo, String nome, String endereco, String nEndereco, String cidade, String estado, String funcao, String senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.nEndereco = nEndereco;
        this.cidade = cidade;
        this.estado = estado;
        this.funcao = funcao;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String oldEndereco = this.endereco;
        this.endereco = endereco;
        changeSupport.firePropertyChange("endereco", oldEndereco, endereco);
    }

    public String getNEndereco() {
        return nEndereco;
    }

    public void setNEndereco(String nEndereco) {
        String oldNEndereco = this.nEndereco;
        this.nEndereco = nEndereco;
        changeSupport.firePropertyChange("NEndereco", oldNEndereco, nEndereco);
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

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        String oldFuncao = this.funcao;
        this.funcao = funcao;
        changeSupport.firePropertyChange("funcao", oldFuncao, funcao);
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
        if (!(object instanceof Vendedor)) {
            return false;
        }
        Vendedor other = (Vendedor) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "telas.Vendedor[ codigo=" + codigo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
