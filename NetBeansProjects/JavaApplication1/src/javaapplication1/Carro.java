/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Carro;

/**
 *
 * @author INFO01
 */
public class Carro {
    private String marca;
    private String modelo;
    private double motor;
    private String cor;
    private String placa;
    private int ano;
    
    private boolean ligado = false;
    private int velocidade = 0;
    private int marcha = 0;
    
    public String getMarca(){
            return marca;
    }
    public String getModelo(){
            return modelo;
    }
    public double getMotor(){
            return motor;
    }
    public String getCor(){
            return cor;
    }
    public String getPlaca(){
            return placa;
    }
    public int getAno(){
            return ano;
    }
    public boolean getLigado(){
            return ligado;
    }
    public int getVelocidade(){
            return velocidade;
    }
    public int getMarcha(){
            return marcha;
    }
    
    public void partida(){
        if (ligado == true){
            ligado = false;
        }else{
            ligado = true;
        }
    }
    
    public void acelerar(){
        if (velocidade < 180)
            velocidade++;
    }
    
    public void frear(){
        velocidade--;
    }
    
    public void mudarMarcha(int novaMarcha){
        if (novaMarcha >= -1 && novaMarcha <=6){
            marcha = novaMarcha;
        }
    }
    
    public void imprimirDados(){
        System.out.println("Ligado: "+ligado);
        System.out.println("Velocidade: "+velocidade);
        System.out.println("Marcha: "+marcha);
    }

    public void setMarca(String novamarca) {
        marca = novamarca;
    }

    public void setModelo(String novomodelo) {
        modelo = novomodelo;
    }

    public void setAno(int novoano) {
        ano = novoano;        
    }

    public void setCor(String novacor) {
        cor = novacor;        
    }

    public void setMotor(double novomotor) {
        motor = novomotor;
    }

    public void setPlaca(String novaplaca) {
        placa = novaplaca;
    }
}
