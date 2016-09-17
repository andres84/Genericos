package Ej3WildCard;

import java.util.ArrayList;
import java.util.List;

public class appWild {

    public void listar(List<Alumno> lista){
        
        
        for(Alumno a : lista){
            
            System.out.println(a.getNombre());
            
        }
        
    }
    
    public static void main(String[] args) {
        
        
        appWild aw = new appWild();
        
        Alumno a1 = new Alumno("liliana");
        Alumno a2 = new Alumno("sara");
        Alumno a3 = new Alumno("isabella");
        Alumno a4 = new Alumno("lucia");
        
        List<Alumno> lista = new ArrayList<>();
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);
        lista.add(a4);
        
        aw.listar(lista);
    }

    
}
