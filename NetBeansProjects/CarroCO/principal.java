
/**
 *
 * @author Lucas Felipe
 * @version 1.0
 */
public class principal {

    public static void main(String[] args) {

        Carro x = new Carro();
        Carro y = new Carro();
        Carro z = new Carro();

        x.partida();
        x.acelerar();
        x.acelerar();
        x.mudarMarcha(1);
        x.mudarMarcha(8);
        x.setMarca("FIAT");
        x.setModelo("Palio");
        x.setMotor(1.0);
        x.setAno(2000);
        System.out.println("Marca: " + x.getMarca());
        System.out.print("Modelo: " + x.getModelo());
        System.out.println(" " + x.getMotor());
        System.out.println("Ano: " + x.getAno());
        x.imprimirDados();

        y.partida();
        y.acelerar();
        y.acelerar();
        y.acelerar();
        y.mudarMarcha(1);
        y.mudarMarcha(2);
        y.setMarca("AUDI");
        y.setModelo("A5");
        y.setMotor(2.0);
        System.out.println("Marca: " + y.getMarca());
        System.out.print("Modelo: " + y.getModelo());
        System.out.println(" " + y.getMotor());
        y.imprimirDados();
        
        
        z.partida();
        z.acelerar();
        System.out.println("Marca: " + z.getMarca());
        z.imprimirDados();
    }
}
