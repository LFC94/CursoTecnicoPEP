/**
 *
 * @author INFO01
 */
public class Registro {

     String nome,telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone ="(37)"+ telefone;
    }
    public void setTelefone(String ddd,String telefone) {
        this.telefone = telefone;
        this.telefone="("+ddd+")"+telefone;
    }
    
}
