/**
 *
 * @author Lucas
 */
public class TesteGeladeira {
    public static void main(String[]args){
      
     geladeira minhaGeladeira= new geladeira();
     
      minhaGeladeira.imprimirEstadus();
        
      //mudar temperatura freezer -60°C
      minhaGeladeira.setTemperaturaFreezer(-50);
      minhaGeladeira.imprimirEstadus();
      
      //mudar temperatura freezer -45
      minhaGeladeira.setTemperaturaFreezer(-45);
     minhaGeladeira.imprimirEstadus();
     
    }
}
