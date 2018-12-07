/**
 *
 * @author lucas
 */
public class Televisor {

    private String marca, tela;
    private double polegadas;
    private int canal=1, volume;
    private boolean ligarDesligar = false;

    public boolean isLigarDesligar() {
        return ligarDesligar;
    }

    public void setLigarDesligar() {
        if (ligarDesligar == false) {
            ligarDesligar = true;
        } else {
            ligarDesligar = false;
        }
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int novoCanal) {
        if (novoCanal <= 10 && novoCanal >= 1) {
            this.canal = novoCanal;
        }

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int novoVolume) {
        if (novoVolume <= 100 && novoVolume >= 0) {
            this.volume = novoVolume;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String novaTela) {
        this.tela = novaTela;
    }

    public double getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(double novaPolegada) {
        this.polegadas = novaPolegada;
    }
}
