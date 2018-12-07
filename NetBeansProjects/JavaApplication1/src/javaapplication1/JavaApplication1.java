/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import Carro.Carro;
import javax.swing.JOptionPane;

/**
 *
 * @author INFO01
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro x = new Carro();
        Carro y = new Carro();
        Carro z = new Carro();
        
        x.setMarca("Fiat");
        x.setModelo("Brava");
        x.setAno(2012);
        x.setCor("Azul");
        x.setMotor(1.6);
        x.setPlaca("RAY1607");
        
        x.partida();
        x.mudarMarcha(1);
        x.acelerar();
        y.partida();
        x.acelerar();
        x.acelerar();
        y.mudarMarcha(1);
        x.mudarMarcha(1);
        x.acelerar();
        x.frear();
        y.acelerar();
        z.partida();
        
        
        x.imprimirDados();
        y.imprimirDados();
        z.imprimirDados();
        
        JOptionPane.showMessageDialog(null, "Motor do carro:" + x.getMotor());
        System.out.println("O veículo "+x.getModelo()+", "+ x.getCor()+
                ", da marca "+x.getMarca()+", tem um motor "+x.getMotor()+
                " e foi fabricado no ano "+x.getAno());
    }
}
