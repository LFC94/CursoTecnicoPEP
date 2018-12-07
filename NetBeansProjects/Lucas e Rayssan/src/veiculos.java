
/**
 *
 * @author Lucas e Rayssan
 */
public class veiculos {

    private String  modelo, cambio="", ano="";
    private int marca=0;
    private boolean arC, travaE, vidroE;

    public boolean isArC() {
        return arC;
    }

    public void setArC(boolean arC) {
        this.arC = arC;
    }

    public boolean isTravaE() {
        return travaE;
    }

    public void setTravaE(boolean travaE) {
        this.travaE = travaE;
    }

    public boolean isVidroE() {
        return vidroE;
    }

    public void setVidroE(boolean vidroE) {
        this.vidroE = vidroE;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
