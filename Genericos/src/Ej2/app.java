package Ej2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sara
 */
public class app {

    public static void main(String[] args) {
        
        Clase<String, Integer, String, Double> l = new Clase<>("andres", 2, "fragozo", 34.4);
       // l.mostrarTipo();
        
        List<Clase<String, Integer, String, Double>> l2 = new ArrayList<>();
        l2.add(new Clase<>("andres", 2, "fragozo", 34.4));
        
        for(Clase<String, Integer, String, Double> lista : l2){
            
            lista.mostrarTipo();
            
        }
        
    }
    
}
