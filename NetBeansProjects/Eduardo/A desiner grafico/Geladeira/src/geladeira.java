
/**
 * @author Lucas Felipe
 */
public class geladeira {
    //campo

    private double temperaturaFreezer;
    private double temperaturaGeladeira;
    private boolean ligado;
    private boolean portaAberta;

    //metodos getters
    public double getTemperaturaFreezer() {
        return temperaturaFreezer;
    }

    public void setTemperaturaFreezer(double temperaturaFreezer) {
        //verificar temperatura desejada pelo usuario limite especificado pelo fabricante
        if (temperaturaFreezer <= 10 && temperaturaFreezer >= -50) {
            this.temperaturaFreezer = temperaturaFreezer;
        } else {
            System.out.println("Temperatura nao suportada pelo Freezer");
        }
    }

    public double getTemperaturaGeladeira() {
        return temperaturaGeladeira;
    }

    public void setTemperaturaGeladeira(double temperaturaGeladeira) {
        if (temperaturaGeladeira <= 15 && temperaturaGeladeira >= -30) {
            this.temperaturaGeladeira = temperaturaGeladeira;
        } else {
            System.out.println("Temperatura nao suportada pela Geladeira");
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isPortaAberta() {
        return portaAberta;
    }

    public void setPortaAberta(boolean portaAberta) {
        this.portaAberta = portaAberta;
    }

    public void aumentarTemperaturaGeladeira() {
        this.temperaturaGeladeira = 15;
    }

    public void aumentarTemperaturaFreezer() {
        this.temperaturaFreezer = 10;
    }

    public void diminuirTemperaturaGeladeira() {
        this.temperaturaGeladeira = -30;
    }

    public void diminuirTemperaturaFreezer() {
        this.temperaturaFreezer = -50;
    }

    public void ligar() {
        this.ligado = true;
        this.temperaturaGeladeira = -2;
        this.temperaturaFreezer = -10;
    }

    public void desligar() {
        this.ligado = false;
        this.temperaturaGeladeira = 5;
        this.temperaturaFreezer = 0;
    }
    //metodos personalizado

    public void imprimirEstadus() {
        System.out.println("Temperatura Freezer: " + this.temperaturaFreezer + "°C");
        System.out.println("Temperatura Geladeira: " + this.temperaturaGeladeira + "°C");
        if (this.ligado) {
            System.out.println("A geladeira esta Ligada");
        } else {
            System.out.println("A geladeira esta Desligada");
        }
        if (this.portaAberta) {
            System.out.println("A porta esta Aberta");
        } else {
            System.out.println("A porta esta Fechada");
        }
    }
}